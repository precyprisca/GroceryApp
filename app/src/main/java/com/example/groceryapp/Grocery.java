package com.example.groceryapp;

public class Grocery {
    private String mTitle;
    private String mDescription;
    private int mImageResource;
    private String mPrice;

    public Grocery(String mTitle, String mDescription, String mPrice, int mImageResource) {
        this.setmTitle(mTitle);
        this.setmDescription(mDescription);
        this.setmPrice(mPrice);
        this.setmImageResource(mImageResource);
    }


    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }


    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getmPrice() {
        return mPrice;
    }

    public void setmPrice(String mPrice) {
        this.mPrice = mPrice;
    }
}
