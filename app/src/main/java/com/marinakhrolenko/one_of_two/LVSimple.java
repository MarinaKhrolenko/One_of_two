package com.marinakhrolenko.one_of_two;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Администратор on 05.02.2015.
 */
public class LVSimple extends ActionBarActivity {

    ArrayList<Colors> color = new ArrayList<>();

    String[] colors = {"red", "blue", "yellow", "white", "black",
            "pink", "green", "gray", "silver", "gold",
            "orange", "brown", "purple", "mint", "cyan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        fillData();
        CustomAdapter cAdapter = new CustomAdapter(this, color);

        ListView listV = (ListView) findViewById(R.id.listV);
        listV.setAdapter(cAdapter);

    }

    void fillData() {

        for (int i = 0; i < colors.length; i++) {
            color.add(new Colors(colors[i], false));
        }

    }

    static class ViewHolder {
        TextView tv;
        CheckBox cb;
        ImageView img;
    }

    private class CustomAdapter extends BaseAdapter {

        private static final int ITEM_TYPE_CHECKBOX = 0;
        private static final int ITEM_TYPE_IMAGE = 1;

        Context context;
        LayoutInflater lInflater;
        ArrayList<Colors> color;

        public CustomAdapter(Context context, ArrayList<Colors> color) {

            this.context = context;
            this.color = color;
            lInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }


        @Override
        public int getCount() {

            return color.size();
        }

        @Override
        public Object getItem(int position) {

            return color.get(position);
        }

        @Override
        public long getItemId(int position) {

            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //TODO: ViewHolder pattern

            ViewHolder viewHolder;

            View view = convertView;

            long type = getItemViewType(position);

            if (view == null) {
                viewHolder = new ViewHolder();

                if (type == ITEM_TYPE_CHECKBOX) {
                    view = lInflater.inflate(R.layout.item, parent, false);
                    viewHolder.tv = (TextView) view.findViewById(R.id.tv);
                    viewHolder.cb = (CheckBox) view.findViewById(R.id.cb);
                    view.setTag(viewHolder);
                } else {
                    view = lInflater.inflate(R.layout.item_, parent, false);
//                    viewHolder.tv = (TextView) view.findViewById(R.id.tv);
//                    viewHolder.img = (ImageView) view.findViewById(R.id.img);
                    view.setTag(viewHolder);
                }
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }

            Colors c = getColors(position);

            if (type == ITEM_TYPE_CHECKBOX) {
                viewHolder.tv.setText(c.color);
            } else {
                // smth...
            }


            return view;
        }

        Colors getColors(int position) {

            return ((Colors) getItem(position));
        }

        @Override
        public int getItemViewType(int position) {
            if (position % 2 == 0) {
                return ITEM_TYPE_CHECKBOX;
            } else {
                return ITEM_TYPE_IMAGE;
            }
        }

        @Override
        public int getViewTypeCount() {
            return 2;
        }
    }

    //TODO: list item types
}
