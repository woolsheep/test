package com.example.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;


public class Startwait extends  Activity{
    private final int  STARTWAIT_DISPLAY_LENGHT = 3000;//延遲時間3秒   final為不可變數
    private ImageView youtubeicon;//新增元件
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startwait);
        //取得youtubeiccon圖片
        youtubeicon = (ImageView)findViewById(R.id.youtubeicon);//取得元件
        youtubeicon.setImageResource(R.drawable.youtubeicon);//顯示ImageView圖片
        //handler 延遲效果
        new Handler().postDelayed(new Runnable() {
            @Override
            //跳轉介面至MainActivity 延遲3秒
            public void run() {
                Intent intent = new Intent(Startwait.this, Login.class);
                Startwait.this.startActivity(intent);
                Startwait.this.finish();
            }
        }, STARTWAIT_DISPLAY_LENGHT);
    }

}
