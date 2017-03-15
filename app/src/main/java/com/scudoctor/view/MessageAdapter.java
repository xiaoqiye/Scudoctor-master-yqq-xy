package com.scudoctor.view;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.scudoctor.R;

import java.util.ArrayList;

/**
 * Created by xianyou on 15/03/2017.
 */

public class MessageAdapter extends ArrayAdapter<MessageBox> {
    public MessageAdapter(Activity context, ArrayList<MessageBox> reciveMessage) {

        super(context, 0, reciveMessage);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        // 获取ListView请求对象的初始位置
        MessageBox currentMessageBox = getItem(position);
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.message_list, parent, false);
        }
        // 将MessageBox中患者的名字填入vistor_name_view
        TextView vistorNameView = (TextView) listItemView.findViewById(R.id.vistor_name_view);

        vistorNameView.setText(currentMessageBox.getVistorName());

        // 将MessageBox中患者的消息填入incomeMessage_view
        TextView IncomeMessageView = (TextView) listItemView.findViewById(R.id.incomeMessage_view);
        IncomeMessageView.setText(currentMessageBox.getIncomeMessage());

        // 将MessageBox中患者的头像填入vistor_image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.vistor_image);

        if (currentMessageBox.hasImage()) {
            iconView.setImageResource(currentMessageBox.getImageId());
        } else {
            iconView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}