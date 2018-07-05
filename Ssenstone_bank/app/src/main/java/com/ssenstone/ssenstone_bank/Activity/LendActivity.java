package com.ssenstone.ssenstone_bank.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.ssenstone.ssenstone_bank.R;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class LendActivity extends AppCompatActivity {
    private static String TAG = "LendActivity";
    private Spinner paybackMethod = null;
    private ArrayAdapter<String> spinner_adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lend);

        paybackMethod = (Spinner)findViewById(R.id.payBackMethod);

        spinner_adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, (String[])getResources().getStringArray(R.array.paybackWay));
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        paybackMethod.setAdapter(spinner_adapter);

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
