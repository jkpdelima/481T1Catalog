package com.example.andrew.cpsc481;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        //fruits--------------------------
        Button fruits = (Button) findViewById(R.id.fruits_map);
        fruits.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapActivity.this, fruitsActivity.class);
                startActivity(intent);
            }
        });

        //vegetables----------------------
        Button vegetables = (Button) findViewById(R.id.veggies_map);
        vegetables.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapActivity.this, veggiesActivity.class);
                startActivity(intent);
            }
        });

        //meats----------------------------
        Button meats = (Button) findViewById(R.id.meat_map);
        meats.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapActivity.this, meatsActivity.class);
                startActivity(intent);
            }
        });

        //dairy-----------------------------
        Button dairy = (Button) findViewById(R.id.dairy_map);
        dairy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapActivity.this, dairyActivity.class);
                startActivity(intent);
            }
        });

        //snacks-----------------------------
        Button snacks = (Button) findViewById(R.id.button11);
        snacks.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapActivity.this, snacksActivity.class);
                startActivity(intent);
            }
        });

        //beverages--------------------------
        Button beverages = (Button) findViewById(R.id.button10);
        beverages.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapActivity.this, beveragesActivity.class);
                startActivity(intent);
            }
        });

    }

}
