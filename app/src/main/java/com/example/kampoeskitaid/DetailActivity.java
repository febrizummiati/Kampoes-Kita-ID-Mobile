package com.example.kampoeskitaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    RatingBar ratingBar;
    TextView txtName, txtCode, txtBahan, txtSize, txtColor, txtPrice, txtRating;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Detail Produk");

        Button btnCall = findViewById(R.id.btn_call);
        btnCall.setOnClickListener(this);

        image = findViewById(R.id.product_image);
        txtName = findViewById(R.id.product_name);
        txtCode = findViewById(R.id.product_code);
        txtBahan = findViewById(R.id.product_bahan);
        txtSize = findViewById(R.id.product_size);
        txtColor = findViewById(R.id.product_color);
        txtPrice = findViewById(R.id.product_price);
        txtRating = findViewById(R.id.ratingDetail);
        ratingBar = findViewById(R.id.ratingbar);

        Intent intent = getIntent();
        image.setImageResource(intent.getIntExtra("pImage", 0));
        txtName.setText(intent.getStringExtra("pNama"));
        txtCode.setText(intent.getStringExtra("pCode"));
        txtBahan.setText(intent.getStringExtra("pBahan"));
        txtSize.setText(intent.getStringExtra("pSize"));
        txtColor.setText(intent.getStringExtra("pColor"));
        txtPrice.setText(intent.getStringExtra("pPrice"));
        txtRating.setText(intent.getStringExtra("pRating"));

        float rate = Float.parseFloat(intent.getStringExtra("pRating"));
        rate = rate/2;
        ratingBar.setRating(rate);
    }

    @Override
    public void onClick(View v) {
        String phone = "082385005138";
        Intent intentPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+phone));
        startActivity(intentPhone);
    }
}
