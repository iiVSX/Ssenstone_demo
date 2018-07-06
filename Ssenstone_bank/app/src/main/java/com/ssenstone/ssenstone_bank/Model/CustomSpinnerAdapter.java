package com.ssenstone.ssenstone_bank.Model;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.ssenstone.ssenstone_bank.Activity.PayActivity;
import com.ssenstone.ssenstone_bank.R;

import java.util.ArrayList;

public class CustomSpinnerAdapter extends BaseAdapter implements SpinnerAdapter{
    private final Context mContext;
    private ArrayList<String> mArrayList;

    public CustomSpinnerAdapter(Context context, ArrayList<String> spinner_list){
        mContext = context;
        mArrayList = spinner_list;
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(mContext);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(5, 40, 5, 40);
        textView.setTextSize(20);
        textView.setText(mArrayList.get(position));
        textView.setTextColor(ContextCompat.getColor(mContext, R.color.gray));
        return textView;
    }

//    @Override
//    public View getDropDownView(int position, View counterView, ViewGroup parent){
//        Text text =
//    }
}
