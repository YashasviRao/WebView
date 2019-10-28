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
    public void showToast(String state) {

        if(state.equals("Andhra Pradesh"))
        {
            String stateName ="file:///android_asset/andhra.html";
           Intent i = new Intent(mContext, ApActivity.class);
           i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Arunachal Pradesh"))
        {
            String stateName ="file:///android_asset/arunachalpradesh.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Assam"))
        {
            String stateName ="file:///android_asset/assam.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Bihar"))
        {
            String stateName ="file:///android_asset/bihar.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Chhattisgarh"))
        {
            String stateName ="file:///android_asset/chhattisgarh.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Goa"))
        {
            String stateName ="file:///android_asset/goa.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Gujarath"))
        {
            String stateName ="file:///android_asset/gujarath.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Haryana"))
        {
            String stateName ="file:///android_asset/haryana.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Himachal Pradesh"))
        {
            String stateName ="file:///android_asset/himachalpradesh.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Jharkhand"))
        {
            String stateName ="file:///android_asset/jharkhand.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Jammu and Kashmir"))
        {
            String stateName ="file:///android_asset/jammuandkashmir.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Karnataka"))
        {
            String stateName ="file:///android_asset/karnataka.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        } else if(state.equals("Kerala"))
        {
            String stateName ="file:///android_asset/kerala.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        } else if(state.equals("Madhya Pradesh"))
        {
            String stateName ="file:///android_asset/madhyapradesh.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        } else if(state.equals("Maharashtra"))
        {
            String stateName ="file:///android_asset/maharashtra.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Manipur"))
        {
            String stateName ="file:///android_asset/manipur.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Meghalaya"))
        {
            String stateName ="file:///android_asset/meghalaya.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Mizoram"))
        {
            String stateName ="file:///android_asset/mizoram.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Nagaland"))
        {
            String stateName ="file:///android_asset/nagaland.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Odisha"))
        {
            String stateName ="file:///android_asset/odisha.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Punjab"))
        {
            String stateName ="file:///android_asset/punjab.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Rajasthan"))
        {
            String stateName ="file:///android_asset/rajasthan.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Sikkim"))
        {
            String stateName ="file:///android_asset/sikkim.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Telangana"))
        {
            String stateName ="file:///android_asset/telangana.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Tamil Nadu"))
        {
            String stateName ="file:///android_asset/tamilnadu.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Tripura"))
        {
            String stateName ="file:///android_asset/tripura.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("Uttarakhand"))
        {
            String stateName ="file:///android_asset/uttarakhand.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        else if(state.equals("West Bengal"))
        {
            String stateName ="file:///android_asset/westbengal.html";
            Intent i = new Intent(mContext, ApActivity.class);
            i.putExtra("key",stateName);
            mContext.startActivity(i);
        }
        Toast.makeText(mContext, state, Toast.LENGTH_SHORT).show();
    }

}
