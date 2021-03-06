package com.example.groceryapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemActivity extends AppCompatActivity{

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public ItemActivity() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        final ArrayList<Grocery> groceryList = new ArrayList<>();
        groceryList.add(new Grocery("Rice", "A bag of rice ", "\u20a6 20000", R.drawable.rice));
        groceryList.add(new Grocery("Chocolate", "A packet of chocolate", "\u20a6 3000", R.drawable.chocolate ));
        groceryList.add(new Grocery("Eggs", "A crate of eggs", "\u20a6 2000", R.drawable.eggs ));
        groceryList.add(new Grocery("Tomatoes", "A basket of tomatoes", "\u20a6 5000", R.drawable.tomato ));
        groceryList.add(new Grocery("Olive oil", "A bottle of olive oil", "\u20a6 800", R.drawable.oliveoil ));
        groceryList.add(new Grocery("Doughnuts", "A box of doughnuts", "\u20a6 2000", R.drawable.snacks ));
        groceryList.add(new Grocery("Meat", "A kilogram of meat", "\u20a6 2200", R.drawable.meat ));
        groceryList.add(new Grocery("Onions", "A basket of onions", "\u20a6 1000", R.drawable.onions ));
        groceryList.add(new Grocery("Banana", "A bunch of bananas", "\u20a6 500", R.drawable.bananas ));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new GroceryAdapter(groceryList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        Button button = findViewById(R.id.btnBuy);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(Intent.ACTION_SENDTO);
                intent1.setData(Uri.parse("mailto:precyprisca@gmail.com")); // only email apps should handle this
                intent1.putExtra(Intent.EXTRA_SUBJECT, "Place your order ");
                intent1.putExtra(Intent.EXTRA_TEXT, "What are you placing order for ?\n " + groceryList);
                if (intent1.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);
                }
            }
        });




    }
}
