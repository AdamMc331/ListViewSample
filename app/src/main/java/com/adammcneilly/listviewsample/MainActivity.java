package com.adammcneilly.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Build a sample data source
        String[][] data = new String[3][3];
        data[0] = new String[] {"1", "2", "3"};
        data[1] = new String[] {"a", "b", "c"};
        data[2] = new String[] {"lol", "lol", "lol"};

        // Create the adapter
        MyListAdapter myListAdapter = new MyListAdapter(this, data);

        // Get a reference to the list view.
        ListView listView = (ListView) findViewById(R.id.list_view);

        // Set adapter.
        listView.setAdapter(myListAdapter);
    }
}
