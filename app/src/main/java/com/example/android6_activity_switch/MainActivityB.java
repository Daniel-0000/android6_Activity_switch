package com.example.android6_activity_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
    }

    public void b_to_a(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivityB.this, MainActivity.class);
        startActivity(intent);
    }


}