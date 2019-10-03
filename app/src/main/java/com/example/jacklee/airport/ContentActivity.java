package com.example.jacklee.airport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String ShopName = bundle.getString("ShopName", "");

        TextView shop_text_view = (TextView) findViewById(R.id.shop_text_view);
        shop_text_view.setText(ShopName);
    }
}
