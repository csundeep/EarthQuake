package com.example.sundeepchilukur.earthquake;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {
    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

        // Create a fake list of earthquake locations.
        ArrayList<EarthQuake> earthquakes = new ArrayList<EarthQuake>();
        earthquakes.add(new EarthQuake("7.2", "San Francisco", "Feb 2,2016"));
        earthquakes.add(new EarthQuake("6.1", "London", "July 20,2015"));
        earthquakes.add(new EarthQuake("3.9", "Tokyo", "Nov 10,2014"));
        earthquakes.add(new EarthQuake("5.4", "Mexico City", "May 3,2014"));
        earthquakes.add(new EarthQuake("2.8", "Moscow", "Jan 31,2013"));
        earthquakes.add(new EarthQuake("4.9", "Rio de Janeiro", "Aug 19,2012"));
        earthquakes.add(new EarthQuake("1.6", "Paris", "Oct 30,2011"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        EarthQuakeAdapter adapter = new EarthQuakeAdapter(this, earthquakes);


        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
