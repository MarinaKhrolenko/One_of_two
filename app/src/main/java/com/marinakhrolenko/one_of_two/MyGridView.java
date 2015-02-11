package com.marinakhrolenko.one_of_two;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.GridView;


/**
 * Created by Администратор on 09.02.2015.
 */
public class MyGridView extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);

        TextView text = (TextView) findViewById(R.id.text);

        final String[] food = {"apple", "pear", "plum", "cherry", "coconut",
                "pineapple", "orange", "strawberries", "mango", "avocado",
                "banana", "grapefruit", "peach", "lemon"};

        GridAdapter adapter = new GridAdapter(this, food);

        GridView gridView = (GridView) findViewById(R.id.gridV);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(getBaseContext(),ClickActivity.class);
                intent.putExtra("item",food[position].toString());
                startActivity(intent);
            }
        });

    }

    static class ViewHolder {
        TextView textI;
    }


    private class GridAdapter extends BaseAdapter {

        Context context;
        LayoutInflater lInflater;
        String[] food;


        public GridAdapter(Context context, String[] food) {

            this.context = context;
            this.food = food;
            lInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }


        @Override
        public int getCount() {
            return food.length;
        }

        @Override
        public Object getItem(int position) {
            return food[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder viewHolder;


            if (convertView == null) {
                viewHolder = new ViewHolder();
                convertView = lInflater.inflate(R.layout.item_g, parent, false);

                viewHolder.textI = (TextView) convertView.findViewById(R.id.textI);//!!!!!!!
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }

            viewHolder.textI.setText(food[position]);

            return convertView;
        }
    }
}
