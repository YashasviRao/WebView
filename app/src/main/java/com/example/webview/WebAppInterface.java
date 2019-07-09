package com.example.webview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;

    // Instantiate the interface and set the context
    WebAppInterface(Context c) {
        mContext = c;
    }

    // Show a toast from the web page
    @JavascriptInterface
    public void showToast(String constituency) {

        if(constituency.equals("Kanniyakumari"))
        {
           Intent intent = new Intent(mContext, Main2Activity.class);
            mContext.startActivity(intent);

        }
        Toast.makeText(mContext, constituency, Toast.LENGTH_SHORT).show();
    }

}
