package com.onnetsolution.listinsidelist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SubAdapter extends RecyclerView.Adapter<SubHolder> {

    Context c;
    ArrayList<SubData> itemlist;

    public SubAdapter(Context c, ArrayList<SubData> itemlist) {
        this.c = c;
        this.itemlist = itemlist;
    }

    @NonNull
    @Override
    public SubHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sub_list,null);
        SubHolder subHolder = new SubHolder(v);
        return subHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SubHolder subHolder, int position) {
        subHolder.sl.setText(String.valueOf(itemlist.get(position).getSl()));
        subHolder.name.setText(itemlist.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

    @Override
    public int getItemViewType(int position) {
        return  position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
