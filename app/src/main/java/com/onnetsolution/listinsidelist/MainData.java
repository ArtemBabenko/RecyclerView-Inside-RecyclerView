package com.onnetsolution.listinsidelist;

import java.util.ArrayList;

public class MainData {
    private int sl;
    private String title;
    private ArrayList<SubData> list;

    public MainData() {
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<SubData> getList() {
        return list;
    }

    public void setList(ArrayList<SubData> list) {
        this.list = list;
    }
}
