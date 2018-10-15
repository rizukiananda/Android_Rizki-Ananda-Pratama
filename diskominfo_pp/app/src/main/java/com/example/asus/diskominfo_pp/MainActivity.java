package com.example.asus.diskominfo_pp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        WebView web = (WebView) findViewById(R.id.web_view);
        web.loadUrl("http://10.0.2.2/rizki-ananda-pratama-diskominfo/laravel_rizki-ananda-pratama/");
        web.setWebViewClient(new WebViewClient());
    }
}
