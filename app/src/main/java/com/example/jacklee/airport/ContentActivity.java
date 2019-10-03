package com.example.jacklee.airport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String shopName = bundle.getString("ShopName", "");
        int shopImageResourceId = bundle.getInt("ShopImageResourceId");
        String shopContent = bundle.getString("ShopContent");

        ImageView content_image_view= (ImageView) findViewById(R.id.content_image_view);
        content_image_view.setImageResource(shopImageResourceId);

        TextView content_text_view = (TextView) findViewById(R.id.content_text_view);
        content_text_view.setText(shopContent);

        setTitle(shopName);
    }
}
