package com.example.android.breweryapp;

public class Beer {

    private String mName;

    public Beer(String name) {
        mName = name;
    }

    @Override
    public String toString() {
        return mName;
    }
}
