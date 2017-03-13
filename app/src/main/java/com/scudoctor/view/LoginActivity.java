package com.scudoctor.view;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.scudoctor.R;


public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //获取两个按钮和两个编辑文本框
        Button bt_login = (Button) findViewById(R.id.loginBtn);
        Button bt_goregister = (Button) findViewById(R.id.loginNewUser);
        TextView tv_findpsd=(TextView)findViewById(R.id.loginMissps);
        final EditText et_username = (EditText) findViewById(R.id.loginId);
        final EditText et_password = (EditText) findViewById(R.id.loginPassword);
        //为登录点击按钮添加监听事件
        bt_login.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                //获取用户名和密码提交到服务器，若返回登录成功，则跳转到主页面，若返回登录失败，则弹出提示
                // 重新输入登录信息
                //获取用户名和密码
                String username=et_username.getText().toString();
                String password=et_password.getText().toString();
                //登录成功跳转主页面
                if(username.length()>0&&password.length()>0) {
                    Toast.makeText(getApplicationContext(), "登录成功",
                            Toast.LENGTH_SHORT).show();// 显示时间较短
                    Intent intent = new Intent(LoginActivity.this, MainFragmentActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "请检查登录信息",
                            Toast.LENGTH_SHORT).show();// 显示时间较短
                }
            }
        });
        //为跳转注册界面按钮添加监听事件
        bt_goregister.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                //直接跳转到注册界面
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        //无法登陆跳转找回密码界面监听
        tv_findpsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,FindPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
