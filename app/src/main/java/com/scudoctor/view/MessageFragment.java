package com.scudoctor.view;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.scudoctor.R;

import java.util.ArrayList;

import static android.R.attr.category;
import static android.R.attr.start;
import static android.R.id.list;

//首页视图（资讯）
public class MessageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View v=LayoutInflater.from(getActivity()).inflate(R.layout.message_f,null);
        View v = inflater.inflate(R.layout.message_f, container, false);
        final ArrayList<MessageBox> reciveMessage = new ArrayList<MessageBox>();
        reciveMessage.add(new MessageBox("张三", "樱花飞舞的初春", R.drawable.donut));
        reciveMessage.add(new MessageBox("李四", "半空中落英缤纷", R.drawable.donut));
        reciveMessage.add(new MessageBox("王五", "蓝紫色桔梗", R.drawable.donut));
        reciveMessage.add(new MessageBox("陈六", "似将画面停顿", R.drawable.donut));
        MessageAdapter adapter = new MessageAdapter(getActivity(), reciveMessage);
        ListView listView = (ListView) v.findViewById(R.id.rootMessageView);
        listView.setAdapter(adapter);

        return v;
    }

}
