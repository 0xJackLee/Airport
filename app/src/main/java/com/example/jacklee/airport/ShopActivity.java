package com.example.jacklee.airport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String airportName = bundle.getString("airportName","");
        int category = bundle.getInt("category");

        ShopAdapter shopAdapter;
        ListView listView = (ListView)findViewById(R.id.shop_list_view);

        if(airportName.equals("Tianjin Binhai International Airport")){
            Airport TianJin = new Airport(airportName);

            switch(category){
                case 1:
                    ArrayList<Airport.Shop> tianJinBuyShops = new ArrayList<Airport.Shop>();
                    tianJinBuyShops.add(TianJin.new Shop("Nike", R.drawable.nike,"The First Nike Airport AR Shop"));
                    tianJinBuyShops.add(TianJin.new Shop("Adidas", R.drawable.adidas, "The First Adidas Airport AR shop "));

                    shopAdapter = new ShopAdapter(this, tianJinBuyShops);
                    listView.setAdapter(shopAdapter);
                    break;

                case 2:
                    ArrayList<Airport.Shop> tianJinEatShop = new ArrayList<Airport.Shop>();
                    tianJinEatShop.add(TianJin.new Shop("KFC"));
                    tianJinEatShop.add(TianJin.new Shop("McDonald"));

                    shopAdapter = new ShopAdapter(this, tianJinEatShop);
                    listView.setAdapter(shopAdapter);
                    break;

                case 3:
                    ArrayList<Airport.Shop> tianJinRestShop = new ArrayList<Airport.Shop>();
                    tianJinRestShop.add(TianJin.new Shop("Cinema"));
                    tianJinRestShop.add(TianJin.new Shop("Rest room"));
                    shopAdapter = new ShopAdapter(this, tianJinRestShop);
                    listView.setAdapter(shopAdapter);
                    break;

            }

        }
    }
}
