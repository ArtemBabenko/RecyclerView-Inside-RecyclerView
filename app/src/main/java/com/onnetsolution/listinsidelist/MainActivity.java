package com.onnetsolution.listinsidelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    MainAdapter adapter;
    ArrayList<MainData> mainList = new ArrayList<>();
    ArrayList<SubData> subList = new ArrayList<>();
    MainData m = new MainData();
    SubData s = new SubData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);

        populateData();

        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setItemAnimator(new DefaultItemAnimator());
        adapter = new MainAdapter(this,mainList);
        recycler.setAdapter(adapter);

    }

    private void populateData() {
        for(int i=0 ; i<5 ; i++)
        {
            s = new SubData();
            s.setSl(i);
            s.setName("Name"+i);
            subList.add(s);

            m = new MainData();
            m.setSl(i);
            m.setTitle("Title"+i);
            m.setList(subList);
            mainList.add(m);
        }
    }
}
