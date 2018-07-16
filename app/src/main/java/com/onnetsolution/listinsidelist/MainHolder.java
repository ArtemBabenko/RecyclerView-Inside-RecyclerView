package com.onnetsolution.listinsidelist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MainHolder extends RecyclerView.ViewHolder{
    TextView title;
    RecyclerView list;
    public MainHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        list = itemView.findViewById(R.id.list);
    }
}
