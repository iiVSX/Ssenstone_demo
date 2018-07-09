package com.ssenstone.ssenstone_bank.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.ssenstone.ssenstone_bank.Model.CustomSpinnerAdapter;
import com.ssenstone.ssenstone_bank.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class LendActivity extends AppCompatActivity {
    private static String TAG = "LendActivity";
    private Spinner paybackMethod = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lend);

        String[] temp = getResources().getStringArray(R.array.paybackWay);
        ArrayList<String> payback_methods = new ArrayList<>();
        Collections.addAll(payback_methods, temp);

        paybackMethod = (Spinner) findViewById(R.id.payBackMethod);

        CustomSpinnerAdapter spinner_adapter = new CustomSpinnerAdapter(LendActivity.this, payback_methods);
        paybackMethod.setAdapter(spinner_adapter);

        Button button = findViewById(R.id.do_lend_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
