package com.example.jacklee.airport;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AirportAdapter extends ArrayAdapter<Airport> {
    public AirportAdapter(Activity context, ArrayList<Airport> cities){
        super(context, 0, cities);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        final Context context = getContext();
        if(listItemView == null){
            listItemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        final Airport currentAirport = getItem(position);

        TextView textView = (TextView)listItemView.findViewById(R.id.text_view);
        textView.setText(currentAirport.getAirportName());


        listItemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CategoryActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("airportName", currentAirport.getAirportName());
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });

        return listItemView;
    }
}
