package com.marinakhrolenko.one_of_two;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Администратор on 05.02.2015.
 */
public class LVArray extends ActionBarActivity {

    String[] colors={"red","blue","yellow","white","black",
            "pink","green","gray","silver","gold",
            "orange","brown","purple","mint","cyan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ListView listV=(ListView) findViewById(R.id.listV);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,colors);

        listV.setAdapter(adapter);

    }
}
