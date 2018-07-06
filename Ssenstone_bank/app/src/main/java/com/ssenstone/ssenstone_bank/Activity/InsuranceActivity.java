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
    private ArrayAdapter<CharSequence> insuranceNameAdapter = null;
    private ArrayAdapter<CharSequence> insuranceTypeAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);

        insuranceName = findViewById(R.id.insuranceName);
        insuranceNameAdapter = ArrayAdapter.createFromResource(this, R.array.insuranceName ,android.R.layout.simple_spinner_item);
        insuranceNameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        insuranceName.setAdapter(insuranceNameAdapter);

        insuranceType = findViewById(R.id.insuranceType);
        insuranceTypeAdapter = ArrayAdapter.createFromResource(this, R.array.insuranceType ,android.R.layout.simple_spinner_item);
        insuranceTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
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