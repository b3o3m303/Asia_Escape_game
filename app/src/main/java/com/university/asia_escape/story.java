package com.university.asia_escape;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class story extends AppCompatActivity {
    private TextView textView;
    private ImageButton imageButton;
    private String s = "就讀大一的威威回到家以後準備要就寢時，\n發現明天要期末報告的隨身碟好像掉在電腦教室裡了，\n回到教室的他發現門已經上鎖了，\n於是打算尋求警衛的幫助.....";
    private TiaoZiUtil tiaoziUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        imageButton = ((ImageButton) findViewById(R.id.imageButton));
        textView = ((TextView) findViewById(R.id.textView));
        tiaoziUtil = new TiaoZiUtil(textView, s, 120);//呼叫逐字JAVA

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                imageButton.setVisibility(View.VISIBLE);

            }
        }, 9500);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(story.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}

