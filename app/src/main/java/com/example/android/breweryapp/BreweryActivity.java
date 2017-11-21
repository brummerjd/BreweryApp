package com.example.android.breweryapp;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.content.Context;

        import java.util.ArrayList;

public class BreweryActivity extends AppCompatActivity {
    private TextView mBreweryTextView;
    private ListView mBeerList;
    private ImageView mBreweryLogo;
    private Brewery mBrewery;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brewery);
        mBreweryTextView = (TextView)findViewById(R.id.brewery_name);
        mBeerList = (ListView) findViewById(R.id.beer_list);

        mBreweryLogo = (ImageView) findViewById(R.id.brewery_logo);
/*
        Picasso.with(context)
                .load("https://s3.amazonaws.com/brewerydbapi/brewery/0KVoaE/upload_8065SX-squareLarge.png")
                .placeholder(R.mipmap.ic_launcher)
                .into(mBreweryLogo);
                */

        String breweryID = (String) getIntent().getExtras().get("breweryID");
        mBreweryTextView.setText(breweryID);

        mBrewery = BreweryCatalog.getInstance().getBrewery(breweryID);

        ArrayAdapter<Beer> adapter = new ArrayAdapter<Beer>(
                this,
                android.R.layout.simple_list_item_1,
                mBrewery.getBeers()
        );

        mBeerList.setAdapter(adapter);

    }
}