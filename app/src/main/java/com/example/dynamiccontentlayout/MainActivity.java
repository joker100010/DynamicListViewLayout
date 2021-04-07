package com.example.dynamiccontentlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String words[] = {"Hasnain", "Raza", "Alivi", "Peshawert"};
    private Object AdapterView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> myArray = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            myArray.add(words[i]);
        }

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, myArray);

        ListView l1 = findViewById(R.id.listview);
        l1.setAdapter(adp);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
                TextView t1 = findViewById(R.id.txt);
                t1.setText("The user clicked on item " + position + "the id is " + id);
            }
        });
    }
}
