package com.scudoctor.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.scudoctor.R;


public class EditArticleFragment extends Fragment {
    private String thisArticleTitle;
    private String thisArticleContent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.edit_article_f, container, false);

        final EditText articleTitle = (EditText) v.findViewById(R.id.edit_article_title);
        final EditText articleContent = (EditText) v.findViewById(R.id.eidt_article_content);
        //点击提交文章按钮，获取文章标题和内容后提交
        Button pushArticle = (Button) v.findViewById(R.id.pushArticle);
        pushArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thisArticleTitle = articleTitle.getText().toString().trim();
                thisArticleContent = articleContent.getText().toString().trim();
                //显示获取的文章标题
                Toast.makeText(getActivity().getApplicationContext(), thisArticleTitle, Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }


}
