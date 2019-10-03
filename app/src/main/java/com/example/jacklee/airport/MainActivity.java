package com.example.jacklee.airport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Airport> cities = new ArrayList<Airport>();
        cities.add(new Airport("Tianjin Binhai International Airport"));
        cities.add(new Airport("Beijing Capital International Airport"));

        AirportAdapter airportAdapter = new AirportAdapter(this, cities);
        ListView listView = (ListView)findViewById(R.id.main_list_view);
        listView.setAdapter(airportAdapter);
    }
}
