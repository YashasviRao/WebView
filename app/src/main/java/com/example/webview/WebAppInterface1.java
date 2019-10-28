package com.example.webview;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface1 {
    Context mContext;

    // Instantiate the interface and set the context
    WebAppInterface1(Context context)
    {
        mContext=context;
    }
    // Show a toast from the web page
    @JavascriptInterface
    public void showToast(String constituency) {

       // if(constituency.equals("Araku"))
       // {
            Intent i = new Intent(mContext, ConstApActivity.class);
            i.putExtra("key",constituency);
            mContext.startActivity(i);

       // }
        Toast.makeText(mContext, constituency, Toast.LENGTH_SHORT).show();
    }

}
