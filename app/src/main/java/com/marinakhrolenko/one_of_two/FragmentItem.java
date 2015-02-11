package com.marinakhrolenko.one_of_two;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.Intent.getIntent;

/**
 * Created by Администратор on 09.02.2015.
 */
public class FragmentItem extends Fragment {

    private String mItem;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
       if (args != null) {
            mItem = args.getString(MyConstant.ITEM_CONSTANT);
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.item_g,container,false);
        TextView textI = (TextView) v.findViewById(R.id.textI);

       if (!TextUtils.isEmpty(mItem)) {
            textI.setText("You clicked: " + mItem);
       }
        return v;
    }

    public static FragmentItem newInstance(String someStr) {
        FragmentItem frag = new FragmentItem();
        Bundle args = new Bundle();
        args.putString(MyConstant.ITEM_CONSTANT, someStr);
        frag.setArguments(args);
        return frag;
    }


}
