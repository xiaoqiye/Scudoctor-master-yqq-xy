package com.scudoctor.view;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.scudoctor.R;

import java.util.ArrayList;

/**
 * Created by xianyou on 15/03/2017.
 */

public class ArticleAdapter extends ArrayAdapter<ArticleBox> {
    public ArticleAdapter(Activity context, ArrayList<ArticleBox> articleInfo) {

        super(context, 0, articleInfo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list, parent, false);
        }


        ArticleBox currentArticleBox = getItem(position);


        TextView articleTitleView = (TextView) listItemView.findViewById(R.id.articleTitle_view);

        articleTitleView.setText(currentArticleBox.getTitle());


        TextView articleContentView = (TextView) listItemView.findViewById(R.id.articleContent_view);

        articleContentView.setText(currentArticleBox.getContent());


        return listItemView;
    }
}