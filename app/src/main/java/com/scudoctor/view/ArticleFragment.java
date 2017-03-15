package com.scudoctor.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.scudoctor.R;

import java.util.ArrayList;

//患者可以发表文章
public class ArticleFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.article_f, null);
        ArrayList<ArticleBox> articleInfo = new ArrayList<ArticleBox>();
        articleInfo.add(new ArticleBox("七号公园", "樱花飞舞的初春"));
        articleInfo.add(new ArticleBox("玫瑰花的葬礼", "离开你一百个星期"));
        articleInfo.add(new ArticleBox("庐州月", "儿时凿壁偷了谁家的光，宿昔不梳 一苦十年寒窗，如今灯下闲读 红袖添香，半生浮名只是虚妄，" +
                "三月 一路烟霞 莺飞草长。柳絮纷飞里看见了故乡，不知心上的你是否还在庐阳，一缕青丝一生珍藏，桥上的恋人入对出双。" +
                "桥边红药叹夜太漫长，月也摇晃 人也彷徨。乌蓬里传来了一曲离殇"));
        articleInfo.add(new ArticleBox("千百度", "关外夜店，烟火绝，客怎眠"));
        ArticleAdapter adapter = new ArticleAdapter(getActivity(), articleInfo);
        ListView listView = (ListView) v.findViewById(R.id.rootArticleView);
        listView.setAdapter(adapter);
        return v;
    }
}


//    public void showArticleDetail(View v){
//        ArrayList<String> articleInfo = new ArrayList<String>();
//        articleInfo.add("庐州月");
//        articleInfo.add("儿时凿壁偷了谁家的光，宿昔不梳 一苦十年寒窗，如今灯下闲读 红袖添香，半生浮名只是虚妄，"+
//                "三月 一路烟霞 莺飞草长。柳絮纷飞里看见了故乡，不知心上的你是否还在庐阳，一缕青丝一生珍藏，桥上的恋人入对出双。"+
//                "桥边红药叹夜太漫长，月也摇晃 人也彷徨。乌蓬里传来了一曲离殇");
//        Intent i = new Intent(getActivity(),ArticleDetail.class);
//        i.putStringArrayListExtra("articleInfo",articleInfo);
//        startActivity(i);
//
//    }


//public class ArticleFragment extends Fragment {
//    private ListView ll;
//    private FragmentActivity fa;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_message_list);
//        //构建消息列表
//        ArrayList<MessageBox> reciveMessage = new ArrayList<MessageBox>();
//        reciveMessage.add(new MessageBox("张三","樱花飞舞的初春",R.drawable.donut));
//        reciveMessage.add(new MessageBox("李四","半空中落英缤纷",R.drawable.donut));
//        reciveMessage.add(new MessageBox("王五","蓝紫色桔梗",R.drawable.donut));
//        reciveMessage.add(new MessageBox("陈六","似将画面停顿",R.drawable.donut));
//        //将消息列表传入MessageAdapter处理
//        MessageAdapter adapter = new MessageAdapter(this,reciveMessage);
//        ListView listView = (ListView) findViewById(R.id.rootMessageView);
//        //将处理后的MessageAdapter对象进行填充
//        listView.setAdapter(adapter);
//    }
//}