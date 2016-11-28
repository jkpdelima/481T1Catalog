package com.example.andrew.cpsc481;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class fruitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        setTitle("Fruits");

        String[] item = {"apples", "bananas","blueberries","cherries", "grapefruit","kiwi","mango","watermelon",};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        ListView itemListView = (ListView)  findViewById(R.id.listOfFruits);
        itemListView.setAdapter(adapter);


        itemListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String data = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(fruitsActivity.this, "(" + data + ")" + " added to Cart", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}
