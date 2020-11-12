package com.example.kampoeskitaid;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ListViewHolder> {
    private ArrayList<Products> listProduct;
    /**
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }
     */
    public ProductAdapter(ArrayList<Products> listProduct){
        this.listProduct =listProduct;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_product, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder productViewHolder, int i) {
        final Products products = listProduct.get(i);
        productViewHolder.imgPhoto.setImageResource(products.getPhoto());
        productViewHolder.lsName.setText(products.getName());
        productViewHolder.lsDetail.setText(products.getDetail());
        productViewHolder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra("pImage", products.getPhoto());
                intent.putExtra("pName", products.getName());
                intent.putExtra("pCode", products.getKode());
                intent.putExtra("pBahan", products.getBahan());
                intent.putExtra("pSize", products.getUkuran());
                intent.putExtra("pColor", products.getWarna());
                intent.putExtra("pPrice", products.getHarga());
                intent.putExtra("pRating", products.getRating());
                view.getContext().startActivity(intent);
            }
        });
    }
    /**
    public interface OnItemClickCallback {
        void onItemClicked(Products data);
    }
    */

    @Override
    public int getItemCount() {
        return listProduct.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imgPhoto;
        TextView lsName, lsDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            lsName = itemView.findViewById(R.id.ls_item_name);
            lsDetail = itemView.findViewById(R.id.ls_item_detail);
        }
    }

}
