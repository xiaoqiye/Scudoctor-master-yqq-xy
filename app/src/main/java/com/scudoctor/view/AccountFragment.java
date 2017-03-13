package com.scudoctor.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.scudoctor.R;
//个人账户
public class AccountFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View v=LayoutInflater.from(getActivity()).inflate(R.layout.account_f,null);

        TextView tv_basic = (TextView) v.findViewById(R.id.basicinfo);
        TextView tv_change = (TextView) v.findViewById(R.id.changepsd);
        TextView tv_real=(TextView)v.findViewById(R.id.realname);
        TextView tv_out=(TextView)v.findViewById(R.id.tv_top_edit);
        //聊天按钮监听
        /*bt_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到聊天界面
                //Intent intent=new Intent(PersonalCenterActivity.this.ChatActivity.class);
                //startActivity(intent);
            }
        });
        //文章按钮监听
        bt_article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到文章界面
                //Intent intent=new Intent(PersonalCenterActivity.this.ArticleActivity.class);
                //startActivity(intent);
            }
        });*/
        //修改密码按钮监听
        tv_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到修改密码界面
                Intent intent = new Intent(getActivity(), ChangePasswordActivity.class);
                startActivity(intent);
            }
        });
        //实名认证按钮监听
        tv_real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到实名认证密码界面
                Intent intent = new Intent(getActivity(), RealNameActivity.class);
                startActivity(intent);
            }
        });
        //注销按钮监听
        tv_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到实名认证密码界面
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        //完善信息按钮监听
        tv_basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到实名认证密码界面
                Intent intent = new Intent(getActivity(), PerfectInfoActivity.class);
                startActivity(intent);
            }
        });
        //initView();
        return v;
    }
}
