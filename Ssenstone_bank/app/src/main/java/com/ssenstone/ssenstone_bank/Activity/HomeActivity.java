package com.ssenstone.ssenstone_bank.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.ssenstone.ssenstone_bank.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class HomeActivity extends AppCompatActivity {
    private static String TAG = "HomeActivity";
    Button mPayButton, mTransferButton, mLendButton, mInsuranceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mPayButton       = findViewById(R.id.pay_button);
        mTransferButton  = findViewById(R.id.transfer_button);
        mLendButton      = findViewById(R.id.lend_button);
        mInsuranceButton = findViewById(R.id.insurance_button);

        mPayButton.setOnClickListener(mClickListener);
        mTransferButton.setOnClickListener(mClickListener);
        mLendButton.setOnClickListener(mClickListener);
        mInsuranceButton.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.pay_button:
                    Intent pay_intent = new Intent(HomeActivity.this, PayActivity.class);
                    startActivity(pay_intent);
                    break;
                case R.id.transfer_button:
                    Intent transfer_intent = new Intent(HomeActivity.this, TransferActivity.class);
                    startActivity(transfer_intent);
                    break;
                case R.id.lend_button:
                    Intent lend_intent = new Intent(HomeActivity.this, LendActivity.class);
                    startActivity(lend_intent);
                    break;
                case R.id.insurance_button:
                    Intent insurance_intent = new Intent(HomeActivity.this, InsuranceActivity.class);
                    startActivity(insurance_intent);
                    break;
                default:
                    Log.d(TAG, "Wrong Button Clicked");
                    break;
            }
        }
    };

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
