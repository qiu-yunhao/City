package com.example.city;

import com.example.city.Model.Data;

import java.util.ArrayList;
import java.util.List;

public class ItemStore {
    private final int MAX = 20;
    private List<Data> list = new ArrayList<>();

    public ItemStore(){
        for(int i = 0 ;i < MAX ; i++){
            list.add(new Data("实景图片" + (i+1)));
        }
    }

    public List<Data> getList(){
        return this.list;
    }
}
