package com.example.disaster;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Flooding extends ActionBarActivity {

    //declaration of widgets in layout
    Button guidelines, firstaid, redcross;
    TextView line,line1, line2, line3, line4, line5, line6, line7, line8, line9 ,line10, line11, line12, line13, line14, line15, line16, line17, line18, line19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //set activity layout
        setContentView(R.layout.activity_flooding);

        //assinging buttons from layout

        guidelines =(Button) findViewById(R.id.guidelines);
        firstaid = (Button) findViewById(R.id.firstaid);
        redcross = (Button) findViewById(R.id.redcross);
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);
        line2 = (TextView) findViewById(R.id.line2);
        line3 = (TextView) findViewById(R.id.line3);
        line4 = (TextView) findViewById(R.id.line4);
        line5 = (TextView) findViewById(R.id.line5);
        line6 = (TextView) findViewById(R.id.line6);
        line7 = (TextView) findViewById(R.id.line7);
        line8 = (TextView) findViewById(R.id.line8);
        line9 = (TextView) findViewById(R.id.line9);
        line10 = (TextView) findViewById(R.id.line10);
        line11 = (TextView) findViewById(R.id.line11);
        line12 = (TextView) findViewById(R.id.line12);
        line13 = (TextView) findViewById(R.id.line13);
        line14 = (TextView) findViewById(R.id.line14);
        line15 = (TextView) findViewById(R.id.line15);
        line16 = (TextView) findViewById(R.id.line16);
        line17 = (TextView) findViewById(R.id.line17);
        line18 = (TextView) findViewById(R.id.line18);
        line19 = (TextView) findViewById(R.id.line19);


        guidelines.setBackgroundColor(Color.GRAY);
        redcross.setBackgroundColor(Color.GRAY);
        firstaid.setBackgroundColor(Color.RED);
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);
        line2.setBackgroundColor(Color.GRAY);
        line3.setBackgroundColor(Color.GRAY);
        line4.setBackgroundColor(Color.GRAY);
        line5.setBackgroundColor(Color.GRAY);
        line6.setBackgroundColor(Color.GRAY);
        line7.setBackgroundColor(Color.GRAY);
        line8.setBackgroundColor(Color.GRAY);
        line9.setBackgroundColor(Color.GRAY);
        line10.setBackgroundColor(Color.GRAY);
        line11.setBackgroundColor(Color.GRAY);
        line12.setBackgroundColor(Color.GRAY);
        line13.setBackgroundColor(Color.GRAY);
        line14.setBackgroundColor(Color.GRAY);
        line15.setBackgroundColor(Color.GRAY);
        line16.setBackgroundColor(Color.GRAY);
        line17.setBackgroundColor(Color.GRAY);
        line18.setBackgroundColor(Color.GRAY);
        line19.setBackgroundColor(Color.GRAY);
        
   
        //on clicking guidelines button
        guidelines.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Flooding.this, Guidelines.class));
                finish();
            }
        });


        //on clicking firstaid button
        firstaid.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Flooding.this, Firstaid.class));
                finish();
            }
        });
        
        //on clicking firstaid button
        redcross.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Flooding.this, Redcross.class));
                finish();
            }
        });





    }



}