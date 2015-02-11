package com.marinakhrolenko.one_of_two;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Администратор on 03.02.2015.
 */
public class Result extends ActionBarActivity implements View.OnClickListener{

    //TODO ListView 2 1act Array, 2act Base, video, read
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Button btnR=(Button) findViewById(R.id.btnR);
        btnR.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this,Result.class));

    }
}

