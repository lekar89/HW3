package com.vlad.progect24_06_16_fragment.ui.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vlad.progect24_06_16_fragment.Config;
import com.vlad.progect24_06_16_fragment.R;
import com.vlad.progect24_06_16_fragment.model.Store;
import com.vlad.progect24_06_16_fragment.ui.adapters.StoreAdapter;

import java.util.ArrayList;

/**
 * Created by Влад on 24.09.2016.
 */
public class StoreFragment extends Fragment {

    private Context context = getActivity();
    private RecyclerView recycler;
    private ArrayList<Store> stores;
    private StoreAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_store, container, false);

        stores = new ArrayList<>();
        Config config = new Config();
        stores = config.getStoreData();

        recycler = (RecyclerView) v.findViewById(R.id.recycle_view_store);
        recycler.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linearLayoutManager);
        adapter = new StoreAdapter(context, stores);
        recycler.setAdapter(adapter);

        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}


