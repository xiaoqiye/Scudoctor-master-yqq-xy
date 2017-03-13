package com.scudoctor.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.scudoctor.R;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //获取三个文本编辑框和两个按钮
        final EditText et_username=(EditText)findViewById(R.id.registerName);
        final EditText et_regisertid=(EditText)findViewById(R.id.registerId);
        final EditText et_psd1=(EditText)findViewById(R.id.registerPassword);
        final EditText et_psd2=(EditText)findViewById(R.id.turePassword);
        Button bt_register=(Button) findViewById(R.id.registerBtn);
        Button bt_back=(Button) findViewById(R.id.registerBack);
        //Button bt_back=(Button) findViewById(R.id.button4);
        //注册按钮监听事件
        bt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=et_username.getText().toString();
                String registerid=et_regisertid.getText().toString();
                String psd1=et_psd1.getText().toString();
                String psd2=et_psd2.getText().toString();
                if(Chickusername(username,registerid)&&ChickPassword(psd1,psd2))
                {
                    //提交到服务器
                    //提交成功自动登录跳转到主页面
                    Toast.makeText(getApplicationContext(), "注册成功，直接登录",
                            Toast.LENGTH_SHORT).show();// 显示时间较短
                    Intent intent=new Intent(RegisterActivity.this,MainFragmentActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "注册失败，请检查",
                            Toast.LENGTH_SHORT).show();// 显示时间较短
                }
            }
        });
        //返回按钮监听事件
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击直接返回登录界面
                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
    //对用户名进行检查
    private Boolean Chickusername(String str1,String str2)
    {
        if(str1.length()!=0&&str2.length()!=0) {
            return true;
        }
        return false;
    }

    //对密码进行本地检查
    private  Boolean ChickPassword(String str1,String str2)
    {
        if(str1.length()>=6&&str1.equals(str2)) {
            return true;
        }
        return false;
    }
}
