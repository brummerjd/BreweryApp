package com.example.android.breweryapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Brewery {

    private String mID = "";
    private String mName;
    private String mLogoSource;
    private ArrayList<Beer> mBeers;

    public Brewery(String name) {
        mName = name;
        mBeers = new ArrayList<Beer>();
    }

    public void addBeer (Beer b) {
        mBeers.add(b);
    }

    public String getName() { return mName; }
    public String getID() { return mID; }
    public ArrayList<Beer> getBeers() { return mBeers; }

    public void setID(String id) { mID = id; }

    @Override
    public String toString() {
        return mName;
    }
}
