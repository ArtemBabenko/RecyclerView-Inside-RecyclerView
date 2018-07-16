package com.onnetsolution.listinsidelist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainHolder> {

    Context c;
    ArrayList<MainData> list;

    public MainAdapter(Context c, ArrayList<MainData> list) {
        this.c = c;
        this.list = list;
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_list,null);
        MainHolder holder = new MainHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
        holder.list.setLayoutManager(new LinearLayoutManager(c));
        holder.list.setItemAnimator(new DefaultItemAnimator());
        SubAdapter adapter = new SubAdapter(c,list.get(position).getList());
        holder.list.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
