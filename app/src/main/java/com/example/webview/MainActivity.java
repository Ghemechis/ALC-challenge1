package com.example.webview;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Title;
    private Button btn1;
    private Button btn2;


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);



        Title= findViewById(R.id.title);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
    }
    public void btn1Click(View view){
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);

    }
    public void btn2Click(View view){
        Intent intent = new Intent(this, ActivityC.class);
        startActivity(intent);

    }
}