package com.example.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityC extends AppCompatActivity {

    private ImageView imageVw;
    private TextView txtV1;
    private View txtV2;
    private TextView txtV3;
    private TextView txtV4;
    private TextView txtV5;
    private TextView txtV6;
    private TextView txtV7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        imageVw = (ImageView)findViewById(R.id.imageView);
        txtV1 = (TextView) findViewById(R.id.textView1);
        txtV2 = (View) findViewById(R.id.textView2);
        txtV3 = (TextView) findViewById(R.id.textView3);
        txtV4 = (TextView) findViewById(R.id.textView4);
        txtV5 = (TextView) findViewById(R.id.textView5);
        txtV6 = (TextView) findViewById(R.id.textView6);
        txtV7 = (TextView) findViewById(R.id.textView7);



    }
}
