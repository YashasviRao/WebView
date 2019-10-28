package com.example.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ApActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ap);

        webView = (WebView) findViewById(R.id.apwebview);

        WebSettings webSetting = webView.getSettings();
        webSetting.setBuiltInZoomControls(false);
        webSetting.setJavaScriptEnabled(true);

        Bundle extras = getIntent().getExtras();
    //    if(extras !=null){
           String stateName = extras.getString("key");
    //    }
        webView.loadUrl(stateName);
        webView.setWebViewClient(new MyWebViewClient1());
        webView.setWebChromeClient(new MyWebChromeClient1());
        webView.addJavascriptInterface(new WebAppInterface1(this), "AndroidInterface");
    }

    private class MyWebViewClient1 extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

    private class MyWebChromeClient1 extends WebChromeClient {
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
            if (newProgress == 100) {
                // progressBar.setVisibility(View.GONE);
            } else {
                //   progressBar.setVisibility(View.VISIBLE);
                // progressBar.setProgress(newProgress);
            }
        }
    }
}
