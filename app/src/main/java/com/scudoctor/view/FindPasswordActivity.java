package com.scudoctor.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.scudoctor.R;

public class FindPasswordActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_password);

        final EditText et_id=(EditText) findViewById(R.id.findPasswId);
        final EditText et_psd1=(EditText)findViewById(R.id.findPasswAuth);
        Button bt_look=(Button)findViewById(R.id.findPasswordBtn);
        Button bt_back=(Button) findViewById(R.id.findPasswordBack);
        //Button bt_back=(Button)findViewById(R.id.button19);

        bt_look.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=et_id.getText().toString();
                String psd1=et_psd1.getText().toString();
                //String psd2=et_psd2.getText().toString();
                //
                if(psd1.length()!=0)
                {
                    //验证身份
                    if(id.length()!=0)//假设不为空即检查成功
                    {
                        Toast.makeText(getApplicationContext(), "找回成功，直接登录",
                                Toast.LENGTH_SHORT).show();// 显示时间较短
                        Intent intent = new Intent(FindPasswordActivity.this, MainFragmentActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "身份验证失败，请检查",
                                Toast.LENGTH_SHORT).show();// 显示时间较短
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "验证码失败，请检查",
                            Toast.LENGTH_SHORT).show();// 显示时间较短
                }
            }
        });

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FindPasswordActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
