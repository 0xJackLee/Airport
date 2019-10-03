package com.example.jacklee.airport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        final String airportName = bundle.getString("airportName", "");
        //Log.v("CategoryActivity", "airportName: " + airportName);

 /*       if(airportName == "TianJIn"){
            Airport TianJin = new Airport(airportName);
            ArrayList<Airport.BuyShop> tianJinBuyShop = new ArrayList<Airport.BuyShop>();
            tianJinBuyShop.add(TianJin.new BuyShop("NIKE"));
            tianJinBuyShop.add(TianJin.new BuyShop("ADIDAS"));
        }*/

        TextView buyshop_text_view = (TextView)findViewById(R.id.buyshop_text_view);
        buyshop_text_view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ShopActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("airportName", airportName);
                bundle.putInt("category", 1);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        TextView eatshop_text_view = (TextView)findViewById(R.id.eatshop_text_view);
        eatshop_text_view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ShopActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("airportName", airportName);
                bundle.putInt("category", 2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        TextView restshop_text_view = (TextView)findViewById(R.id.restshop_text_view);
        restshop_text_view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ShopActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("airportName", airportName);
                bundle.putInt("category", 3);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
