package com.ratnasrivastava.listview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
///////////////////////////////////////////////////////Approach 1////////////////////////////////////////////////////////////////////////////////
        ListView listView = (ListView) findViewById(R.id.listView);

        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ajay");
        arrayList.add("Ratna");
        arrayList.add("papa");
        arrayList.add("mummy");
        arrayList.add("akshat");

        //to show array list on list view
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("unique7", "i= " + i);
                Toast.makeText(MainActivity.this, "item clicked : " + arrayList.get(i), Toast.LENGTH_SHORT).show();
            }
        });
/////////////////////////////////////////Approach2 asList
        ListView listView2 = (ListView) findViewById(R.id.listview2);

        ArrayList<String> arrayList2 = new ArrayList<String>(asList("Tarushi", "Prashan", "Akshat", "Kittu"));

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList2);

        listView2.setAdapter(arrayAdapter1);

    }
}