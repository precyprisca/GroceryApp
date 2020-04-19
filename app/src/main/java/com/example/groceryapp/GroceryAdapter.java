package com.example.groceryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryAdapter.GroceryViewHolder> {
    private ArrayList<Grocery> mGroceryList;
        public static class  GroceryViewHolder extends RecyclerView.ViewHolder{
        public TextView mTitle;
        public TextView mDescription;
        public TextView mPrice;
        public ImageView mImageView;

        public GroceryViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.tvTitle);
            mImageView = itemView.findViewById(R.id.image);
            mDescription = itemView.findViewById(R.id.tvDescription);
            mPrice =itemView.findViewById(R.id.tvPrice);

        }
    }

    public GroceryAdapter(ArrayList<Grocery> groceryList){
        mGroceryList = groceryList;
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        GroceryViewHolder gvh = new GroceryViewHolder(view);
        return (gvh);
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        Grocery currentItem = mGroceryList.get(position);

        holder.mImageView.setImageResource(currentItem.getmImageResource());
        holder.mTitle.setText(currentItem.getmTitle());
        holder.mDescription.setText(currentItem.getmDescription());
        holder.mPrice.setText(currentItem.getmPrice());




    }

    @Override
    public int getItemCount() {
        return mGroceryList.size();
    }

}
