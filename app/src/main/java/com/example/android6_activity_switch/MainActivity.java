package com.example.android6_activity_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void a_to_b(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivityB.class);
        startActivity(intent);
    }


}