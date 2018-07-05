package com.ssenstone.ssenstone_bank.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ssenstone.ssenstone_bank.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCustomFont("fonts/yanoljaRegular.ttf");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    private void setCustomFont(String fontName){
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath(fontName)
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
}
