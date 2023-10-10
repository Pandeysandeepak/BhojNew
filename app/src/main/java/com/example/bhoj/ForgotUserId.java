package com.example.bhoj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotUserId extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_forgot_user_id );
    }

    public void switchPage(View view) {

        Intent intent = new Intent (ForgotUserId.this, Otp.class);
        startActivity(intent);
    }
}