package com.example.city.Model;

import java.util.Date;

public class Data {
    private String name;

    public Data(){

    }

    public Data(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
