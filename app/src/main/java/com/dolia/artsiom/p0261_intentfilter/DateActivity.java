package com.dolia.artsiom.p0261_intentfilter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.sql.Date;


public class DateActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date);

        TextView tv = (TextView) findViewById(R.id.tvDate);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String date = sdf.format(new Date(System.currentTimeMillis()));

        tv.setText(date);
    }
}
