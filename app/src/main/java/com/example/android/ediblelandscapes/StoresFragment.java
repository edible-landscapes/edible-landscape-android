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
        cards.add(new Store("Fresh", "W. Johnson", R.mipmap.ic_launcher));
        cards.add(new Store("Whole Foods", "S. University Avenue", R.mipmap.ic_launcher));
        cards.add(new Store("Target", "W. Mills Street", R.mipmap.ic_launcher));
        cards.add(new Store("Fresh", "W. Johnson", R.mipmap.ic_launcher));
        cards.add(new Store("Whole Foods", "S. University Avenue", R.mipmap.ic_launcher));
        cards.add(new Store("Target", "W. Mills Street", R.mipmap.ic_launcher));
        cards.add(new Store("Fresh", "W. Johnson", R.mipmap.ic_launcher));
        cards.add(new Store("Whole Foods", "S. University Avenue", R.mipmap.ic_launcher));
        cards.add(new Store("Target", "W. Mills Street", R.mipmap.ic_launcher));
        cards.add(new Store("Fresh", "W. Johnson", R.mipmap.ic_launcher));
        cards.add(new Store("Whole Foods", "S. University Avenue", R.mipmap.ic_launcher));
        cards.add(new Store("Target", "W. Mills Street", R.mipmap.ic_launcher));

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
