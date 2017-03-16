package com.scudoctor.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.scudoctor.R;

import java.util.ArrayList;

/**
 * Created by xianyou on 15/03/2017.
 */

public class ArticleList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_f);

        //构建文章列表
        ArrayList<ArticleBox> articleInfo = new ArrayList<ArticleBox>();
        articleInfo.add(new ArticleBox("七号公园", "樱花飞舞的初春"));
        articleInfo.add(new ArticleBox("玫瑰花的葬礼", "离开你一百个星期"));
        articleInfo.add(new ArticleBox("庐州月", "儿时凿壁偷了谁家的光，宿昔不梳 一苦十年寒窗，如今灯下闲读 红袖添香，半生浮名只是虚妄，" +
                "三月 一路烟霞 莺飞草长。柳絮纷飞里看见了故乡，不知心上的你是否还在庐阳，一缕青丝一生珍藏，桥上的恋人入对出双。" +
                "桥边红药叹夜太漫长，月也摇晃 人也彷徨。乌蓬里传来了一曲离殇"));
        articleInfo.add(new ArticleBox("千百度", "关外夜店，烟火绝，客怎眠"));

        //类似message类中的方式
        ArticleAdapter adapter = new ArticleAdapter(this, articleInfo);
        ListView listView = (ListView) findViewById(R.id.rootArticleView);
        listView.setAdapter(adapter);
    }

    public void showArticleDetail(View view) {
        //打开文章详情，并发送文章相关信息
        ArrayList<String> articleInfo = new ArrayList<String>();
        articleInfo.add("庐州月");
        articleInfo.add("儿时凿壁偷了谁家的光，宿昔不梳 一苦十年寒窗，如今灯下闲读 红袖添香，半生浮名只是虚妄，" +
                "三月 一路烟霞 莺飞草长。柳絮纷飞里看见了故乡，不知心上的你是否还在庐阳，一缕青丝一生珍藏，桥上的恋人入对出双。" +
                "桥边红药叹夜太漫长，月也摇晃 人也彷徨。乌蓬里传来了一曲离殇");
        Intent i = new Intent(this, ArticleDetail.class);
        i.putStringArrayListExtra("articleInfo", articleInfo);
        startActivity(i);
    }
}
