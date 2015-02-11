package com.marinakhrolenko.one_of_two;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Администратор on 03.02.2015.
 */
public class Color extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color);

        Button btnC1=(Button) findViewById(R.id.btnC1);
        btnC1.setOnClickListener(this);
        Button btnC2=(Button) findViewById(R.id.btnC2);
        btnC2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

                startActivity(new Intent(this, Animal.class));

    }
}