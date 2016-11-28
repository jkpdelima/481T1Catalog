package com.example.andrew.cpsc481;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    public ArrayList<String> chipsList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //buttons-----------------------------------------------------------------------------------
        //lays add to cart button
        Button lays = (Button) findViewById(R.id.button1);
        lays.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                chipsList.add("(Aisle 2) Lays - Classic");
                Toast.makeText(Main2Activity.this,  "(Lays - Classic) added to cart", Toast.LENGTH_SHORT).show();
                //when button is clicked
                //Intent intent = new Intent(getApplicationContext(), cartActivity.class);

                //intent.putStringArrayListExtra("chipsList", chipsList);
                //startActivity(intent);
            }
        });

        //pringles add to cart button
        Button pringles = (Button) findViewById(R.id.button2);
        pringles.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                chipsList.add("(Aisle 2) Pringle's - Sour Cream & Onion");
                Toast.makeText(Main2Activity.this,  "(Pringle's - Sour Cream & Onion) added to cart", Toast.LENGTH_SHORT).show();

            }
        });

        //doritos add to cart button
        Button doritos = (Button) findViewById(R.id.button3);
        doritos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                chipsList.add("(Aisle 2) Doritos - Cool Ranch");
                Toast.makeText(Main2Activity.this,  "(Doritos - Cool Ranch) added to cart", Toast.LENGTH_SHORT).show();

            }
        });
        //search--------------------------------
        Button search = (Button) findViewById(R.id.button8);
        search.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //map--------------------------------
        Button map = (Button) findViewById(R.id.button10);
        map.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        //cart-------------------------------
        Button cart = (Button) findViewById(R.id.button21);
        cart.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, cartActivity.class);
                intent.putStringArrayListExtra("chips", chipsList);
                startActivity(intent);
            }
        });



    }


}
