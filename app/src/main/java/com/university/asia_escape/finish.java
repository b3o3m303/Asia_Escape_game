package com.university.asia_escape;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class finish extends AppCompatActivity {
    VideoView vid;
    MediaController m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);//要求裝置不進入睡眠
        final Button newgame=(Button)findViewById(R.id.newgame);
        final Button aboutus=(Button)findViewById(R.id.aboutus);
        final value gv = (value) getApplicationContext();//變數呼叫
        vid =(VideoView)findViewById(R.id.videoView4);
        vid.setVideoURI(Uri.parse("android.resource://" +"com.university.asia_escape"+ "/" + R.raw.finish));
        vid.start();
        vid.setMediaController(null);

        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
           newgame.setVisibility(View.VISIBLE);
           aboutus.setVisibility(View.VISIBLE);
            }
        }, 5000);

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(finish.this, about.class);
                startActivity(intent);
            }
        });

        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gv.setN1(0);
                gv.setN10(0);
                gv.setN11(0);
                gv.setN2(0);
                gv.setN3(0);
                gv.setN4(0);
                gv.setN5(0);
                gv.setN6(0);
                gv.setN7(0);
                gv.setN8(0);
                gv.setN9(0);
                gv.setPASS1(0);
                gv.setPASS2(0);
                gv.setPASS3(0);
                gv.setPASS4(0);
                gv.setPASS5(0);
                gv.setPASS6(0);
                gv.setPASS7(0);
                gv.setG(0);
                gv.setT(0);
                gv.setN12(0);
                Intent intent = new Intent();
                intent.setClass(finish.this, story.class);
                startActivity(intent);
            }
        });
    }
}
