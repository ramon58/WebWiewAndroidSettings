package com.rama.webview.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        wb = (WebView) findViewById(R.id.webView);
        String url="http://www.regilog.com";
        wb.getSettings().setJavaScriptEnabled(true);
        wb.getSettings().setBuiltInZoomControls(true);
        wb.loadUrl(url);
        wb.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading (WebView view, WebResourceRequest request){

                return false;

            }
        });
    }
}