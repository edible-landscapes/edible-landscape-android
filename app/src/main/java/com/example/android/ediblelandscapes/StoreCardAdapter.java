package com.example.android.ediblelandscapes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StoreCardAdapter extends ArrayAdapter<Store> {

    public StoreCardAdapter(Context context, ArrayList<Store> cards) {
        super(context, 0, cards);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.store_card, parent, false);
        }

        Store currentStore = getItem(position);
        ImageView storeImage = gridItemView.findViewById(R.id.store_image);
        TextView storeTitle = gridItemView.findViewById(R.id.store_title);
        TextView storeSubTitle = gridItemView.findViewById(R.id.store_sub_title);

        storeImage.setImageResource(currentStore.getImageResource());
        storeTitle.setText(currentStore.getName());
        storeSubTitle.setText(currentStore.getAddress());

        return gridItemView;
    }
}
