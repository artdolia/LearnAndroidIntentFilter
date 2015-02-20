package com.dolia.artsiom.p0261_intentfilter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    Button btnTime;
    Button btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnTime = (Button) findViewById(R.id.btnTime);
        btnDate = (Button) findViewById(R.id.btnDate);

        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        Intent intent;

        switch (v.getId()){

            case R.id.btnDate:
                intent = new Intent("com.dolia.artsiom.showdate");
                startActivity(intent);
                break;
            case R.id.btnTime:
                intent = new Intent("com.dolia.artsiom.showtime");
                startActivity(intent);
                break;
        }



    }
}
