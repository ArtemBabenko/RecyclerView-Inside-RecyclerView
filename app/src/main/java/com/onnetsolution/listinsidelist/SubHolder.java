package com.onnetsolution.listinsidelist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class SubHolder extends RecyclerView.ViewHolder {
    TextView sl,name;
    public SubHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        sl = itemView.findViewById(R.id.sl);
    }
}
