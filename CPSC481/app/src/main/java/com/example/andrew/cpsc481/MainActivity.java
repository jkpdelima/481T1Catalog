package com.example.andrew.cpsc481;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.andrew.cpsc481.R.id.button8;


public class MainActivity extends AppCompatActivity {

    private ListView lstSearch;
    private EditText edtSearch;
    private ArrayAdapter<String> adapter;

    String data[] = {
            "banana", "apple", "orange", "grapefruit",
            "celery", "spinach", "tomato", "lettuce", "squash",
            "chips", "pepsi", "sprite",
            "ham", "bacon", "salmon", "tuna",
            "swiss cheese", "cheddar"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //search bar--------------------------------------------------------------------------------
        lstSearch = (ListView) findViewById(R.id.lstSearch);
        edtSearch = (EditText) findViewById(R.id.edtSearch);
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.textView, data);
        lstSearch.setAdapter(adapter);


        lstSearch.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String data = String.valueOf(parent.getItemAtPosition(position));
                        //Toast.makeText(MainActivity.this, data, Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), Main2Activity.class)); //goes to new activity
                    }
                }
        );

        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                MainActivity.this.adapter.getFilter().filter(s);
                if (s.length() > 0) {
                    lstSearch.setVisibility(View.VISIBLE);
                } else {
                    lstSearch.setVisibility(View.GONE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //buttons for-------------------------------------------------------------------------------

        //fruits--------------------------
        Button fruits = (Button) findViewById(R.id.fruits);
        fruits.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fruitsActivity.class);
                startActivity(intent);
            }
        });

        //vegetables----------------------
        Button vegetables = (Button) findViewById(R.id.veggies);
        vegetables.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, veggiesActivity.class);
                startActivity(intent);
            }
        });

        //meats----------------------------
        Button meats = (Button) findViewById(R.id.meat);
        meats.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, meatsActivity.class);
                startActivity(intent);
            }
        });

        //dairy-----------------------------
        Button dairy = (Button) findViewById(R.id.dairy);
        dairy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, dairyActivity.class);
                startActivity(intent);
            }
        });

        //snacks-----------------------------
        Button snacks = (Button) findViewById(R.id.snacks);
        snacks.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, snacksActivity.class);
                startActivity(intent);
            }
        });

        //beverages--------------------------
        Button beverages = (Button) findViewById(R.id.beverages);
        beverages.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, beveragesActivity.class);
                startActivity(intent);
            }
        });

        //map--------------------------------
        Button map = (Button) findViewById(R.id.button10);
        map.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        //store------------------------------
        Button store = (Button) findViewById(R.id.button9);
        store.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(intent);
            }
        });

    }

}
