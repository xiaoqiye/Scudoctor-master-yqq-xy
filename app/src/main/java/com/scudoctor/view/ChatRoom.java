package com.scudoctor.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.scudoctor.R;

import java.util.ArrayList;

public class ChatRoom extends AppCompatActivity {

    private ArrayList<MessageBox> inputMessage = new ArrayList<MessageBox>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);


    }

    public void sendMessage(View view) {
        //将输入的消息填入chat_list_view的ListView
        EditText inputText = (EditText) findViewById(R.id.chat_edit_text1);
        String inputMessageContent = inputText.getText().toString();
        inputMessage.add(new MessageBox("鲜莜", inputMessageContent, R.drawable.honeycomb));
        MessageAdapter adapter = new MessageAdapter(this, inputMessage);
        ListView listView = (ListView) findViewById(R.id.chat_list_view);
        listView.setAdapter(adapter);

    }
}