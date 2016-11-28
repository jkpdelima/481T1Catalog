package com.example.andrew.cpsc481;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class snacksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

        setTitle("Snacks");

        String[] item = {"Apple Slices","Candy Bar","Chips","Chocolate","Cupcakes","Doughnuts","Dried Fruits","Fruit Salads","Granola Bars","Jello","Nachos","Nuts","Pizza","Popcorn","Raisins","Saltines","Yogurt"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        ListView beveragesListView = (ListView)  findViewById(R.id.listOfSnacks);
        beveragesListView.setAdapter(adapter);


        beveragesListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String data = String.valueOf(parent.getItemAtPosition(position));
                        //Toast.makeText(snacksActivity.this, "(" + data + ")" + " added to Cart", Toast.LENGTH_SHORT).show();
                        if (data == "Chips"){
                            startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                        }

                    }
                }
        );
    }
}
