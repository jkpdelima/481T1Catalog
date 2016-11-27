package com.example.andrew.cpsc481;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        Button otherStore = (Button) findViewById(R.id.button4);
        otherStore.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoreActivity.this, OtherStoreActivity.class);
                startActivity(intent);
            }
        });

    }
}
