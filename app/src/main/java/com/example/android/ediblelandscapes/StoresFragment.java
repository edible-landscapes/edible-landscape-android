package com.example.android.ediblelandscapes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class StoresFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.store_grid, container, false);

        // list of store cards
        final ArrayList<Store> cards = new ArrayList<>();
        cards.add(new Store("Store 1", "Address 1", R.mipmap.ic_launcher));
        cards.add(new Store("Store 2", "Address 2", R.mipmap.ic_launcher));
        cards.add(new Store("Store 3", "Address 3", R.mipmap.ic_launcher));
        cards.add(new Store("Store 4", "Address 4", R.mipmap.ic_launcher));
        cards.add(new Store("Store 5", "Address 5", R.mipmap.ic_launcher));
        cards.add(new Store("Store 6", "Address 6", R.mipmap.ic_launcher));
        cards.add(new Store("Store 7", "Address 7", R.mipmap.ic_launcher));
        cards.add(new Store("Store 8", "Address 8", R.mipmap.ic_launcher));
        cards.add(new Store("Store 9", "Address 9", R.mipmap.ic_launcher));
        cards.add(new Store("Store 10", "Address 10", R.mipmap.ic_launcher));
        cards.add(new Store("Store 11", "Address 11", R.mipmap.ic_launcher));
        cards.add(new Store("Store 12", "Address 12", R.mipmap.ic_launcher));

        StoreCardAdapter storeCardAdapter = new StoreCardAdapter(getActivity(), cards);
        GridView gridView = rootView.findViewById(R.id.grid);
        gridView.setAdapter(storeCardAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Store store = cards.get(position);
            }
        });

        return rootView;
    }

}
