package com.example.andrew.cpsc481;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class veggiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veggies);

        setTitle("Vegetables");

        String[] item = {"Carrots","cabbage","pumpkins","onions","peppers","spinach","yam","tomatoes"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        ListView beveragesListView = (ListView)  findViewById(R.id.listOfVegetables);
        beveragesListView.setAdapter(adapter);


        beveragesListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String data = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(veggiesActivity.this, "(" + data + ")" + " added to Cart", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}
