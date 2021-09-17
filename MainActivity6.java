package com.example.projectwork;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity6 extends AppCompatActivity {
    WebView wbv;

    static {
        System.loadLibrary("native-lib");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        wbv = findViewById(R.id.viewid);
        wbv.loadUrl("https://www.google.com/");

    }

}