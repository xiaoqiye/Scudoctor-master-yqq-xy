package com.scudoctor.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.scudoctor.R;

public class PerfectInfoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfect_info);

        final EditText et_nickname=(EditText)findViewById(R.id.nickname);
        final EditText et_age=(EditText)findViewById(R.id.age);
        final EditText et_address=(EditText)findViewById(R.id.address);
        final EditText et_phone=(EditText)findViewById(R.id.phone);
        final EditText et_sex=(EditText)findViewById(R.id.sex);
        Button bt_okchange=(Button)findViewById(R.id.changeInfo);

        bt_okchange.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                //获取用户名和密码提交到服务器，若返回登录成功，则跳转到主页面，若返回登录失败，则弹出提示
                //重新输入登录信息
                //获取用户名和密码
                String nickname=et_nickname.getText().toString();
                String age=et_age.getText().toString();
                String address=et_address.getText().toString();
                String phone=et_phone.getText().toString();
                String sex=et_sex.getText().toString();
                if (nickname.length() != 0 && age.length() != 0 && address.length() != 0
                        && phone.length() != 0 && sex.length() != 0) {

                    Toast.makeText(getApplicationContext(), "修改成功",
                            Toast.LENGTH_SHORT).show();// 显示时间较短
                    Intent intent = new Intent(PerfectInfoActivity.this, MainFragmentActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "请将信息填写完整",
                            Toast.LENGTH_SHORT).show();// 显示时间较短
                }
            }
        });

    }
}
