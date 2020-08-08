package com.example.project_taxio;

import android.widget.RatingBar;

public class Epilogue_list_item {

    private int image;
    private String driver;
    private float rating;
    private String distinction;
    private String reviews;

    public Epilogue_list_item(int image, String driver, float rating, String distinction, String reviews) {
        this.image = image;
        this.driver = driver;
        this.rating = rating;
        this.distinction = distinction;
        this.reviews = reviews;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDistinction() {
        return distinction;
    }

    public void setDistinction(String distinction) {
        this.distinction = distinction;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }
}
