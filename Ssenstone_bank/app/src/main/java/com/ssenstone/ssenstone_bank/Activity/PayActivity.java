package com.ssenstone.ssenstone_bank.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;

import com.ssenstone.ssenstone_bank.Model.CustomSpinnerAdapter;
import com.ssenstone.ssenstone_bank.R;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class PayActivity  extends AppCompatActivity {
    private static String TAG = "PayActivity";
    private ArrayList<TableRow> table_rows;
    private TableRow credit_row, credit_title_row;
    private Spinner payment_spinner, credit_spinner;
    private Button mPurchaseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        payment_spinner = findViewById(R.id.spinner_payment_method);
        credit_spinner = findViewById(R.id.spinner_credit_card);

        credit_title_row = findViewById(R.id.row_credit_title);
        credit_row = findViewById(R.id.row_credit_choose);

        mPurchaseBtn = findViewById(R.id.purchase_button);

        set_payment_spinner();

        mPurchaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selected = (String) payment_spinner.getSelectedItem();
                Log.d(TAG, selected+" is selected");
            }
        });
    }

    private void set_payment_spinner(){
        ArrayList<String> payments = new ArrayList<>();
        payments.add(getString(R.string.ssen_pay));
        payments.add(getString(R.string.credit_card));
        payments.add(getString(R.string.payco));
        payments.add(getString(R.string.kakao_pay));

        CustomSpinnerAdapter payment_adapter
                = new CustomSpinnerAdapter(PayActivity.this, payments);

        payment_spinner.setAdapter(payment_adapter);
        payment_spinner.setPrompt(getString(R.string.please_choose_payment));
        payment_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                if(selected.equals(getString(R.string.please_choose_payment))){
                    hide_credit_row();
                    Log.d(TAG, "Please Choose");
                }else if(selected.equals(getString(R.string.credit_card))){
                    show_credit_row();
                    Log.d(TAG, selected);
                }else if(selected.equals(getString(R.string.ssen_pay))){
                    hide_credit_row();
                    Log.d(TAG, selected);
                }else if(selected.equals(getString(R.string.payco))){
                    hide_credit_row();
                    Log.d(TAG, selected);
                }else if(selected.equals(getString(R.string.kakao_pay))){
                    hide_credit_row();
                    Log.d(TAG, selected);
                }else{
                    hide_credit_row();
                    Log.d(TAG, "NOTHING");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit_row.setVisibility(View.GONE);
                credit_title_row.setVisibility(View.GONE);
            }
        });
    }

    private void set_credit_spinner(){
        ArrayList<String> credit_cards = new ArrayList<>();
        credit_cards.add(getString(R.string.credit_kb));
        credit_cards.add(getString(R.string.credit_samsung));
        credit_cards.add(getString(R.string.credit_shinhan));
        credit_cards.add(getString(R.string.credit_woori));

        CustomSpinnerAdapter credit_adapter
                = new CustomSpinnerAdapter(PayActivity.this, credit_cards);

        credit_spinner.setAdapter(credit_adapter);
        credit_spinner.setPrompt(getString(R.string.please_choose_card));
    }

    private void show_credit_row(){
        set_credit_spinner();
        credit_row.setVisibility(View.VISIBLE);
        credit_title_row.setVisibility(View.VISIBLE);
    }

    private void hide_credit_row(){
        credit_title_row.setVisibility(View.GONE);
        credit_row.setVisibility(View.GONE);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}