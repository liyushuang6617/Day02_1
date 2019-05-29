package com.example.day02.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.day02.R;
import com.example.day02.bean.WerBean;

import java.util.ArrayList;

public class RlvWerAdapter extends RecyclerView.Adapter<RlvWerAdapter.ViewHolder> {
    private Context context;
    private ArrayList<WerBean.ResultsBean> list;

    public RlvWerAdapter(Context context, ArrayList<WerBean.ResultsBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RlvWerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(context, android.R.layout.activity_list_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RlvWerAdapter.ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(list.get(i).getCreatedAt());
        Glide.with(context).load(list.get(i).getUrl()).into(viewHolder.iv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(android.R.id.icon);
            textView = itemView.findViewById(android.R.id.text1);
        }
    }
}
