package com.scudoctor.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.scudoctor.R;

public class ChangePasswordActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        final EditText et_account=(EditText)findViewById(R.id.changePwId);
        final EditText et_old=(EditText)findViewById(R.id.changePw);
        final EditText et_new=(EditText)findViewById(R.id.changePwNew);
        //Button bt_back=(Button)findViewById(R.id.button11);
        Button bt_checkchange=(Button)findViewById(R.id.changePwBtn);
        Button bt_back=(Button)findViewById(R.id.changePwBack);
        //返回按钮监听
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangePasswordActivity.this, MainFragmentActivity.class);
                startActivity(intent);
            }
        });
        //确认修改按钮监听
        bt_checkchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account=et_account.getText().toString();
                String old=et_old.getText().toString();
                String newpsd=et_new.getText().toString();
                //检查原始密码是否正确
                if(account.length()!=0) {
                    //检查新密码格式是否正确
                    if (ChickPassword(old, newpsd)) {
                        //新密码提交到服务器
                        Toast.makeText(getApplicationContext(), "修改成功",
                                Toast.LENGTH_SHORT).show();// 显示时间较短
                        Intent intent=new Intent(ChangePasswordActivity.this,MainFragmentActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "请输入6位以上相同的新密码",
                                Toast.LENGTH_SHORT).show();// 显示时间较短
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "请检查，确认原始密码和新密码",
                            Toast.LENGTH_SHORT).show();// 显示时间较短
                }
            }
        });
    }
    //新密码检查
    private Boolean ChickPassword(String str1,String str2)
    {
        if(str1.length()>=6&&str2.length()>=6) {
            return true;
        }
        return false;
    }
}

