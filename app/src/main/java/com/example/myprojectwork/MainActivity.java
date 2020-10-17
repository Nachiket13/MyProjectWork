package com.example.myprojectwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LoginButton = (Button)findViewById(R.id.loginbtn);
        TextView signupText =(TextView)findViewById(R.id.Signup_text);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(LoginIntent);

            }
        });

        // Following code is to make textview Clickable
        SpannableString spannableString = new SpannableString("Sign up");
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent signupIntent = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(signupIntent);
            }
        };
        spannableString.setSpan(clickableSpan,0,7, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        signupText.setText(spannableString);
        signupText.setMovementMethod(LinkMovementMethod.getInstance());
       //end of clickable text code
    }
}