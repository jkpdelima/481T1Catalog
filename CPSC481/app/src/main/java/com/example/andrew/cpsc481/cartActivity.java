package com.example.andrew.cpsc481;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class cartActivity extends AppCompatActivity {
    private ListView chipsID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ArrayList<String> chips = getIntent().getExtras().getStringArrayList("chips");

        //firstname1.addAll(first);
        //http://stackoverflow.com/questions/6383330/how-to-combine-two-array-list-and-show-in-a-listview-in-android


        chipsID = (ListView) findViewById(R.id.listViewCart);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.textView, chips);
        chipsID.setAdapter(adapter);
    }
}
