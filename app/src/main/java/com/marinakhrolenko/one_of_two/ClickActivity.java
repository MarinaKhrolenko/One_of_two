package com.marinakhrolenko.one_of_two;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Администратор on 09.02.2015.
 */
public class ClickActivity extends FragmentActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment);

        Intent intent=getIntent();
        String item_=intent.getStringExtra(MyConstant.ITEM_CONSTANT);


        Fragment frag;

        frag=FragmentItem.newInstance(item_);

        FragmentManager fragmentManager=getSupportFragmentManager();

        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.LinearLayout1,frag);

        fragmentTransaction.commit();

    }
}
