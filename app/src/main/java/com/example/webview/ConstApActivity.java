package com.example.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ConstApActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_const_ap);

        Bundle extras = getIntent().getExtras();
        //    if(extras !=null){
        String constituencyName = extras.getString("key");
        //    }
    }
}
