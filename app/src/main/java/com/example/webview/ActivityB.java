package com.example.webview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class ActivityB extends AppCompatActivity {

    private WebView browser;
    private ProgressBar proBar;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        proBar = (ProgressBar) findViewById(R.id.progressBar);
        proBar.setMax(100);

        browser = findViewById(R.id.webview);
        browser.getSettings();
        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setDomStorageEnabled(true);
        browser.getSettings().setUseWideViewPort(true);
        browser.getSettings().setLoadWithOverviewMode(true);
        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        browser.setWebChromeClient(new WebChromeClient(){
            public void onProgressChanged(WebView webView, int newProgress) {
            if (newProgress == 100) {
                proBar.setVisibility(View.GONE);
            } else {
                proBar.setVisibility(View.VISIBLE);
                proBar.setProgress(newProgress);
            }
        }
        });

        browser.setWebViewClient(
                new SSLTolerentWebViewVlient());
        browser.loadUrl("https://andela.com/alc/");

    }

}




