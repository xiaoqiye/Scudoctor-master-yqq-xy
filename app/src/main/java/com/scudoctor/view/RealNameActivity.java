package com.scudoctor.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.scudoctor.R;

public class RealNameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_name);
        final EditText et_realname=(EditText)findViewById(R.id.realname);
        final EditText et_idnum=(EditText)findViewById(R.id.idnum);
        //final EditText et_docnum=(EditText)findViewById(R.id.editText11);
        Button bt_sure=(Button)findViewById(R.id.realBtn);
        //Button bt_back=(Button)findViewById(R.id.button13);
        //返回按钮
        /*bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RealNameActivity.this,PersonalCenterActivity.class);
                startActivity(intent);
            }
        });*/
        //实名认证确认监听
        bt_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String realname=et_realname.getText().toString();
                String idnum=et_idnum.getText().toString();
                //String docnum=et_docnum.getText().toString();
                if(ChickInfo(realname,idnum))
                {
                    //将认证信息发回到服务器验证
                    Toast.makeText(getApplicationContext(), "认证成功",
                            Toast.LENGTH_SHORT).show();// 显示时间较短
                    Intent intent=new Intent(RealNameActivity.this,MainFragmentActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "请检查，输入完整的认证信息",
                            Toast.LENGTH_SHORT).show();// 显示时间较短
                }
            }
        });
    }
    //输入信息检查,姓名不为空，身份证号和医师证号都为18位
    private Boolean ChickInfo(String str1,String str2)
    {
        if(str1.length()!=0&&str2.length()==18)
        {
            return true;
        }
        return false;
    }
}
