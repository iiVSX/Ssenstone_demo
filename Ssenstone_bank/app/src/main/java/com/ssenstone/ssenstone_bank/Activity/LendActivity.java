package com.ssenstone.ssenstone_bank.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ssenstone.ssenstone_bank.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class LendActivity extends AppCompatActivity {
    private static String TAG = "LendActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lend);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
