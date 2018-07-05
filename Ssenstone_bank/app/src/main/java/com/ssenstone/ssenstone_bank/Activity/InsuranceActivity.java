package com.ssenstone.ssenstone_bank.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.ssenstone.ssenstone_bank.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class InsuranceActivity  extends AppCompatActivity {
    private static String TAG = "InsuranceActivity";
    private Spinner insuranceName = null;
    private Spinner insuranceType = null;
    private ArrayAdapter<String> insuranceAdapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);

        insuranceName = (Spinner)findViewById(R.id.insuranceName);

        insuranceAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, (String[])getResources().getStringArray(R.array.insuranceName));
        insuranceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        insuranceType.setAdapter(insuranceAdapter);

        insuranceType = (Spinner)findViewById(R.id.insuranceType);

        insuranceAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, (String[])getResources().getStringArray(R.array.insuranceType));
        insuranceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        insuranceType.setAdapter(insuranceAdapter);

        Button button = findViewById(R.id.lend_button);
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