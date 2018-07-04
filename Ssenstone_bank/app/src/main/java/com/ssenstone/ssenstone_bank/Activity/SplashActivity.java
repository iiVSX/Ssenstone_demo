package com.ssenstone.ssenstone_bank.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ssenstone.ssenstone_bank.R;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            Thread.sleep(3000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}
