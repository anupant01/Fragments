package com.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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


     
    }
}
