package com.example.jacklee.airport;

import android.app.Activity;
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

public class ShopAdapter extends ArrayAdapter<Airport.Shop> {
    public ShopAdapter(Activity context, ArrayList<Airport.Shop> shops){
        super(context, 0, shops);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }
        final Airport.Shop currentAirportShop = getItem(position);
        TextView textView = (TextView)listItemView.findViewById(R.id.text_view);
        textView.setText(currentAirportShop.getShopName());

        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ContentActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("ShopName", currentAirportShop.getShopName());
                bundle.putInt("ShopImageResourceId", currentAirportShop.getImageResourceId());
                bundle.putString("ShopContent", currentAirportShop.getContent());
                intent.putExtras(bundle);
                getContext().startActivity(intent);
            }
        });

        return listItemView;
    }
}
