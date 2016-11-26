package com.example.andrew.cpsc481;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class dairyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        setTitle("Dairy");

        String[] beverages = {"Butter", "Cheese" ,"Milk", "Frozen Desserts", "Yogurt", "Dips"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, beverages);
        ListView beveragesListView = (ListView)  findViewById(R.id.listOfDairy);
        beveragesListView.setAdapter(adapter);


        beveragesListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String data = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(dairyActivity.this, "(" + data + ")" + " added to Cart", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}
