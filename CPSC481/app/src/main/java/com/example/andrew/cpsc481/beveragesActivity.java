package com.example.andrew.cpsc481;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class beveragesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);

        setTitle("Beverages");

        String[] beverages = {"Water", "Milk", "Tea", "Coffee", "Carbonated Drinks", "Juices", "Alcohol"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, beverages);
        ListView beveragesListView = (ListView)  findViewById(R.id.listOfBeverages);
        beveragesListView.setAdapter(adapter);


        beveragesListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String data = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(beveragesActivity.this, "(" + data + ")" + " added to Cart", Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }
}
