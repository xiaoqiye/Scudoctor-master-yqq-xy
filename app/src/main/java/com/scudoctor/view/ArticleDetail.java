package com.scudoctor.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.scudoctor.R;

import java.util.ArrayList;

/**
 * Created by xianyou on 15/03/2017.
 */

public class ArticleDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_detail);
        ArrayList<String> articleInfo = getIntent().getExtras().getStringArrayList("articleInfo");
        //获取文章题目并填充到articleTiTleDetail_view
        TextView myArticleTitle = (TextView) findViewById(R.id.articleTiTleDetail_view);
        myArticleTitle.setText(articleInfo.get(0));
        //获取文章内容并填充到articleContentDetil_view
        TextView myArticleContent = (TextView) findViewById(R.id.articleContentDetil_view);
        myArticleContent.setText(articleInfo.get(1));

    }
}
