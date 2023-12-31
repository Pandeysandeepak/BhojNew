package com.example.bhoj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_logo );
        Timer timer=new Timer ();
        timer.schedule(new TimerTask () {
            @Override
            public void run() {
                Intent intent = new Intent (LogoActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        },2000);
    }
}