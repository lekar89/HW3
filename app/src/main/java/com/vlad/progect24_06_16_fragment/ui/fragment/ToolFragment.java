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
import com.vlad.progect24_06_16_fragment.model.Tool;
import com.vlad.progect24_06_16_fragment.ui.adapters.ToolAdapter;

import java.util.ArrayList;

/**
 * Created by Влад on 24.09.2016.
 */
public class ToolFragment extends Fragment {


    private Context context = getActivity();
    private RecyclerView recycler;
    private ArrayList<Tool> tool;
    private ToolAdapter adapter;
    private final String TAG = "myLogs";

    public ToolFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tool, container, false);
        tool = new ArrayList<>();
        Config data = new Config();
        tool = data.getToolsData();
        recycler = (RecyclerView) v.findViewById(R.id.recycle_view_tool);
        recycler.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linearLayoutManager);
        adapter = new ToolAdapter(context , tool);
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