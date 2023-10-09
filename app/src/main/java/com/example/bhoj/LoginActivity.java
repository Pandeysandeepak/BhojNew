package com.example.bhoj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_login );
        TextView textView =(TextView)findViewById(R.id.ForgotPassword);
        textView.setClickable(true);
        textView.setMovementMethod( LinkMovementMethod.getInstance());
        String text = "<a href='/activity_forgot_user_id.java'> Forgot Password </a>";
        textView.setText( Html.fromHtml(text));
        TextView NewUser=(TextView)findViewById ( R.id.NewUser );
        NewUser.setClickable(true);
//        String text="<a href="
    }
}