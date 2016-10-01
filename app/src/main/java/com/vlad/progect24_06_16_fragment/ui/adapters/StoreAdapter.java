package com.vlad.progect24_06_16_fragment.ui.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vlad.progect24_06_16_fragment.R;
import com.vlad.progect24_06_16_fragment.model.Store;
import com.vlad.progect24_06_16_fragment.ui.fragment.ToolFragment;

import java.util.ArrayList;

/**
 * Created by Влад on 24.09.2016.
 */
public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.StoreHolder> {
    private Context mContext;
    private ArrayList mStoreData;

    public StoreAdapter(Context context, ArrayList storeData) {
        this.mContext = context;
        this.mStoreData = storeData;

    }

    static class StoreHolder extends RecyclerView.ViewHolder {
        public CardView cardStore;
        public TextView textNameStore;
        public TextView textAddressStore;
        public TextView textPhoneStore;
        public TextView textLocationStore;

        public StoreHolder(View itemView) {
            super(itemView);
            this.cardStore = (CardView) itemView.findViewById(R.id.card_view_store);
            this.textNameStore = (TextView) itemView.findViewById(R.id.txt_name_store);
            this.textAddressStore = (TextView) itemView.findViewById(R.id.txt_address_store);
            this.textPhoneStore = (TextView) itemView.findViewById(R.id.txt_phone_store);
            this.textLocationStore = (TextView) itemView.findViewById(R.id.txt_location);
        }
    }

    @Override
    public StoreHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_store, parent, false);
        StoreHolder storeViewHolder = new StoreHolder(view);
        return storeViewHolder;
    }

    @Override
    public void onBindViewHolder(StoreHolder holder, int position) {
        final Store store = (Store) mStoreData.get(position);
        holder.textNameStore.setText(store.getName());
        holder.textAddressStore.setText(store.getAddress());
        holder.textPhoneStore.setText(store.getPhone());

        holder.cardStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToolFragment tollFragment = new ToolFragment();
                FragmentTransaction fragmentTransaction = getActivityFromContext(v.getContext()).getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, tollFragment);
                fragmentTransaction.commit();


            }
        });

    }

    @Override
    public int getItemCount() {
        return mStoreData.size();
    }

    public static AppCompatActivity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (AppCompatActivity) context;
        }
        if (context instanceof ContextWrapper &&
                ((ContextWrapper) context).getBaseContext() instanceof Activity) {
            return (AppCompatActivity) ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
