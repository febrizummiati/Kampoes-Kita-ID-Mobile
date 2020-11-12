package com.example.kampoeskitaid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvProducts;
    private ArrayList<Products> list;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(aboutIntent);
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProducts = findViewById(R.id.rv_products);
        list = new ArrayList<>();

        ProductAdapter productAdapter = new ProductAdapter(list);
        rvProducts.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rvProducts.setAdapter(productAdapter);
        list.addAll(ProductsData.getListData());
    }
}
        /**
    private void showRecyclerList() {
        rvProducts.setLayoutManager(new LinearLayoutManager(this));
        ListProductAdapter listProductAdapter = new ListProductAdapter(list);
        rvProducts.setAdapter(listProductAdapter);

        listProductAdapter.setOnItemClickCallback(new ListProductAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Products data) {
                showSelectedProduct(data);
            }
        });
    }

    private void showSelectedProduct(Products products){
        Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(detailIntent);
    }
     */
