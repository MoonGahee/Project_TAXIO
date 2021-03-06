package com.example.project_taxio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class Epilogue_listAdapter extends BaseAdapter {

    Context context;
    ArrayList<Epilogue_list_item> list_itemArrayList;

    ImageView image_imageView;
    TextView driver_textView;
    RatingBar rating_ratingBar;
    TextView distinction_textView;
    TextView reviews_textView;

    @Override
    public int getCount() {
        return this.list_itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return list_itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.epliogue_list, null);

            image_imageView = (ImageView)convertView.findViewById(R.id.image);
            driver_textView = (TextView)convertView.findViewById(R.id.driver);
            rating_ratingBar = (RatingBar)convertView.findViewById(R.id.rating);
            distinction_textView = (TextView)convertView.findViewById(R.id.distinction);
            reviews_textView = (TextView)convertView.findViewById(R.id.reivews);

        }

        image_imageView.setImageResource(list_itemArrayList.get(position).getImage());
        driver_textView.setText(list_itemArrayList.get(position).getDriver());
        rating_ratingBar.setRating(list_itemArrayList.get(position).getRating());
        distinction_textView.setText(list_itemArrayList.get(position).getDistinction());
        reviews_textView.setText(list_itemArrayList.get(position).getReviews());

        return convertView;
    }

    public Epilogue_listAdapter(Context context, ArrayList<Epilogue_list_item> list_itemArrayList) {
        this.context = context;
        this.list_itemArrayList = list_itemArrayList;
    }
}
