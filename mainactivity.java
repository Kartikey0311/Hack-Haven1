package com.example.quickrespo;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    WebView myWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWeb = findViewById(R.id.myWeb);
        myWeb.getSettings().setJavaScriptEnabled(true);
        myWeb.setWebViewClient(new WebViewClient());
        myWeb.loadUrl("https://kartikey0311.github.io/Hack-Haven1/");

    }
}