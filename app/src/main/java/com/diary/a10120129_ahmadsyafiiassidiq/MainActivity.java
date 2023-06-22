package com.diary.a10120129_ahmadsyafiiassidiq;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity { // 10120129-Ahmad Syafii Assidiq-IF4 //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), home.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}