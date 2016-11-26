package com.example.andrew.cpsc481;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class meatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meats);

        setTitle("Meats");

        String[] item = {"beef","pork","lamb","chicken","seafood","eggs","fish"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        ListView beveragesListView = (ListView)  findViewById(R.id.listOfMeats);
        beveragesListView.setAdapter(adapter);


        beveragesListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String data = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(meatsActivity.this, "(" + data + ")" + " added to Cart", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}
