package com.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragments.FirstFragment;
import fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnfragment;

    private  Boolean status =true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfragment = findViewById(R.id.btnfragment);
        btnfragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (status){
            FirstFragment firstFragment =new FirstFragment();
            fragmentTransaction.replace(R.id.fragmentscontainer,firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnfragment.setText("Load Second Fragment");
            status=false;
        }

        else {

            SecondFragment secondFragment=new SecondFragment();
            fragmentTransaction.replace(R.id.fragmentscontainer,secondFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnfragment.setText("Load First Fragment");
            status=true;

        }






     
    }
}
