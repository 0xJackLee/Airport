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

        ArrayList<Airport> airports = new ArrayList<Airport>();
        airports.add(new Airport("Tianjin Binhai International Airport"));
        airports.add(new Airport("Beijing Capital International Airport"));
        airports.add(new Airport("Qindao Liuting International Airport"));
        airports.add(new Airport("Changsha Huanghua International Airport"));
        airports.add(new Airport("Guangzhou Baiyun Internation Airport"));
        airports.add(new Airport("Hangzhou xiaoshan International Airport"));
        airports.add(new Airport("Shanghai Hongqiao International Airport"));
        airports.add(new Airport("Shanghai Pudong International Airport"));
        airports.add(new Airport("Beijing Daxing International Airport"));
        airports.add(new Airport("Kunming Changshui International Airport"));
        airports.add(new Airport("Chengdu Shuangliu International Airport"));
        airports.add(new Airport("Wuhan Tianhe Internationla Airport"));
        airports.add(new Airport("Chongqin Jiangbei International Airport"));
        airports.add(new Airport("Shenzhen Bao'an International Airport"));
        airports.add(new Airport("Xi'an Xianyan International Airport"));

        AirportAdapter airportAdapter = new AirportAdapter(this, airports);
        ListView listView = (ListView)findViewById(R.id.main_list_view);
        listView.setAdapter(airportAdapter);
    }
}
