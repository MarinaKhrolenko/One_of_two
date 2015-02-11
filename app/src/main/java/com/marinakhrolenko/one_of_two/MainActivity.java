package com.marinakhrolenko.one_of_two;

import android.support.v7.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener   {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        Button btnM = (Button) findViewById(R.id.btnM);
        btnM.setOnClickListener(this);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.title1:
            startActivity(new Intent(this, Color.class));
                break;
            case R.id.title2:
                startActivity(new Intent(this, Animal.class));
                break;
            case R.id.title3:
                startActivity(new Intent(this, MyGridView.class));
                break;
            case R.id.title4:
                startActivity(new Intent(this, Result.class));
                break;

            case R.id.title5:

                startActivity(new Intent(this,LVArray.class));

                break;
            case R.id.title6:

                startActivity(new Intent(this,LVSimple.class));

                break;

        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {

            startActivity(new Intent(this, Color.class));

    }

}
