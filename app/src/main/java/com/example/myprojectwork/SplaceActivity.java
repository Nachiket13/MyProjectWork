package com.example.myprojectwork;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class SplaceActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplaceActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);


        TextView bookstext = findViewById(R.id.books_text);
        String txt = "BooksBuy";
        SpannableString ss = new SpannableString(txt);

        ForegroundColorSpan first = new ForegroundColorSpan(Color.parseColor("#57B7E7"));
        ForegroundColorSpan second = new ForegroundColorSpan(Color.parseColor("#009933"));

        ss.setSpan(first,0,5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(second,5,8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        bookstext.setText(ss);
    }
}