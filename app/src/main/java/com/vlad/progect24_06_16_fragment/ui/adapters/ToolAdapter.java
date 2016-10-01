package com.vlad.progect24_06_16_fragment.ui.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vlad.progect24_06_16_fragment.R;
import com.vlad.progect24_06_16_fragment.model.Tool;

import java.util.ArrayList;

/**
 * Created by Влад on 24.09.2016.
 */
public class ToolAdapter extends RecyclerView.Adapter<ToolAdapter.ToolHolder> {

    private Context mContext;
    private ArrayList mToolData;

    public ToolAdapter(Context context, ArrayList toolData) {
        this.mContext = context;
        this.mToolData = toolData;
    }

    static class ToolHolder extends RecyclerView.ViewHolder {
        public CardView cardTool;
        public ImageView imageTool;
        public TextView textIdTool;
        public TextView textBrandTool;
        public TextView textModelTool;
        public TextView textTypeTool;
        public TextView textPriceTool;
        public TextView textQuantityTool;

        public ToolHolder(View itemView) {
            super(itemView);
            this.cardTool = (CardView) itemView.findViewById(R.id.card_view_instrument);
            this.imageTool = (ImageView) itemView.findViewById(R.id.image_view_image_url);
            this.textIdTool = (TextView) itemView.findViewById(R.id.txt_id);
            this.textBrandTool = (TextView) itemView.findViewById(R.id.txt_brand);
            this.textModelTool = (TextView) itemView.findViewById(R.id.txt_model);
            this.textTypeTool = (TextView) itemView.findViewById(R.id.txt_type);
            this.textPriceTool = (TextView) itemView.findViewById(R.id.txt_price);
            this.textQuantityTool = (TextView) itemView.findViewById(R.id.txt_quantity);
        }
    }

    @Override
    public ToolHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tool, parent, false);
        ToolHolder toolViewHolder = new ToolHolder(view);
        return  toolViewHolder;
    }

    @Override
    public void onBindViewHolder(ToolHolder holder, int position) {
        final Tool tool = (Tool) mToolData.get(position);
//        Picasso
//                .with(mContext)
//                .load(instruments.getImageUrl())
//                .into(holder.mImageViewUrl);
        holder.imageTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holder.textIdTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.textBrandTool.setText(tool.getBrand());
        holder.textBrandTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.textModelTool.setText(tool.getModel());
        holder.textModelTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.textTypeTool.setText(tool.getType());
        holder.textTypeTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.textPriceTool.setText(String.valueOf(tool.getPrice()));
        holder.textPriceTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.textQuantityTool.setText(String.valueOf(tool.getQuantity()));
        holder.textQuantityTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {return mToolData.size();}

    public static AppCompatActivity getActivityFromContext(Context context) {
        if(context instanceof Activity) {
            return (AppCompatActivity) context;
        }
        if(context instanceof ContextWrapper &&
                ((ContextWrapper)context).getBaseContext() instanceof Activity) {
            return  (AppCompatActivity) ((ContextWrapper)context).getBaseContext();
        }
        return null;
    }



}