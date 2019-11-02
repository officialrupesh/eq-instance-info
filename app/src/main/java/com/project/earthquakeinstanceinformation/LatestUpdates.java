package com.project.earthquakeinstanceinformation;


//v7
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.earthquakeinstanceinformation.models.DataAdapter;
import com.project.earthquakeinstanceinformation.models.EarthquakeRequestInterface;
import com.project.earthquakeinstanceinformation.models.EarthquakeResponse;
import com.project.earthquakeinstanceinformation.models.Feature;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LatestUpdates extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Feature> featureList;
    private DataAdapter adapter;


    Button click;
    public  static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquakeupdates);


        recyclerView = findViewById(R.id.earthquake_recycler);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://earthquake.usgs.gov/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        EarthquakeRequestInterface requestInterface = retrofit.create(EarthquakeRequestInterface.class);
        Call<EarthquakeResponse> responseCall =requestInterface.getJSON("geojson","earthquake","time",10,4.0);
        responseCall.enqueue(new Callback<EarthquakeResponse>() {
            @Override
            public void onResponse(Call<EarthquakeResponse> call, Response<EarthquakeResponse> response) {
                if (response.isSuccessful()){
                    EarthquakeResponse earthquakeResponse = response.body();
                    adapter = new DataAdapter(earthquakeResponse.getFeatures());
                    recyclerView.setAdapter(adapter);

                }
                else {
                    Toast.makeText(getApplicationContext(),"No data Found",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<EarthquakeResponse> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });

    }




    }



