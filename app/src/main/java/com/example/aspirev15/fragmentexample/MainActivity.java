package com.example.aspirev15.fragmentexample;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnOne;
    Button btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btnOne=(Button)findViewById(R.id.button1);
        btnTwo=(Button)findViewById(R.id.button2);

        btnTwo.setOnClickListener(this);
        btnOne.setOnClickListener(this);
    }

    public void selectFrag(View view) {
        Fragment fr;
        Fragment ft;
        Fragment gm;

        if (view == findViewById(R.id.button2)) {
            fr = new FragmentTwo();

        } else {
            fr = new FragmentOne();
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View view) {
        selectFrag(view);
    }
}
