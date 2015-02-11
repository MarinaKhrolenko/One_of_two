package com.marinakhrolenko.one_of_two;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Администратор on 03.02.2015.
 */
public class Food  extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        Button btnF1=(Button) findViewById(R.id.btnF1);
        btnF1.setOnClickListener(this);
        Button btnF2=(Button) findViewById(R.id.btnF2);
        btnF2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnF1:
            startActivity(new Intent(this, Result.class));
                break;
            case R.id.btnF2:
                startActivity(new Intent(this, Animal.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
break;
        }
    }
}
