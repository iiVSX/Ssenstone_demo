package com.ssenstone.ssenstone_bank.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.ssenstone.ssenstone_bank.Model.CustomSpinnerAdapter;
import com.ssenstone.ssenstone_bank.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class TransferActivity extends AppCompatActivity {
    private static String TAG = "TransferActivity";
    DecimalFormat mDF = new DecimalFormat("###,###,###,###");
    private EditText mAmount, mReceiver_account, mReceiver;
    private TextView mMyAccount;
    private Button mTransferButton;
    private String myAccount = "395726-01-305829";
    private Spinner mBankSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        mMyAccount = findViewById(R.id.my_account_num);
        mAmount = findViewById(R.id.transfer_amount);
        mReceiver_account = findViewById(R.id.receiver_account);
        mReceiver = findViewById(R.id.receiver);
        mBankSpinner = findViewById(R.id.spinner_bank);
        mTransferButton = findViewById(R.id.do_transfer_button);

        String temp = mMyAccount.getText().toString();
        mMyAccount.setText(temp + myAccount);

        set_bank_spinner();

        mTransferButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void set_bank_spinner() {
        ArrayList<String> banks = new ArrayList<>();
        banks.add(getString(R.string.bank_kb));
        banks.add(getString(R.string.bank_shinhan));
        banks.add(getString(R.string.bank_woori));

        CustomSpinnerAdapter bank_adapter
                = new CustomSpinnerAdapter(TransferActivity.this, banks);

        mBankSpinner.setAdapter(bank_adapter);
        mBankSpinner.setPrompt(getString(R.string.please_choose_bank));
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
