package com.example.anuja.eventbus_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import POJO.MessageEvent;

public class MainActivity extends AppCompatActivity {
    TextView name,email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView)findViewById(R.id.name);
        email = (TextView)findViewById(R.id.email);

    }

    public void clickMe(View v){
        EventBus.getDefault().postSticky(new MessageEvent(name.getText().toString(),email.getText().toString()));
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

}
