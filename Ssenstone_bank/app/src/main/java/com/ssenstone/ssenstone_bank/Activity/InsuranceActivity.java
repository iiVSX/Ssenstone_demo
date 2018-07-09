package com.ssenstone.ssenstone_bank.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.ssenstone.ssenstone_bank.Model.CustomSpinnerAdapter;
import com.ssenstone.ssenstone_bank.R;

import java.util.ArrayList;
import java.util.Collections;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class InsuranceActivity extends AppCompatActivity {
    private static String TAG = "InsuranceActivity";
    private Spinner insuranceName = null;
    private Spinner insuranceType = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);

        String[] insurance_names = getResources().getStringArray(R.array.insuranceName);
        String[] insurance_types = getResources().getStringArray(R.array.insuranceType);
        ArrayList<String> al_names = new ArrayList<>();
        ArrayList<String> al_types = new ArrayList<>();
        Collections.addAll(al_names, insurance_names);
        Collections.addAll(al_types, insurance_types);

        insuranceName = findViewById(R.id.insuranceName);
        insuranceType = findViewById(R.id.insuranceType);

        CustomSpinnerAdapter insuranceNameAdapter = new CustomSpinnerAdapter(InsuranceActivity.this, al_names);
        CustomSpinnerAdapter insuranceTypeAdapter = new CustomSpinnerAdapter(InsuranceActivity.this, al_types);

        insuranceName.setAdapter(insuranceNameAdapter);
        insuranceType.setAdapter(insuranceTypeAdapter);

        Button button = findViewById(R.id.apply_insurance);
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