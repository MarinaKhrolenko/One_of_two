package com.marinakhrolenko.one_of_two;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Администратор on 03.02.2015.
 */
public class Animal extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal);
        Button btnA1=(Button) findViewById(R.id.btnA1);
        btnA1.setOnClickListener(this);
        Button btnA2=(Button) findViewById(R.id.btnA2);
        btnA2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnA1:
            startActivity(new Intent(this, Food.class));
            break;

            case R.id.btnA2:
                startActivity(new Intent(this, Color.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
                break;
        }
    }
    }

