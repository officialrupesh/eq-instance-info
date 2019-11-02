package com.project.earthquakeinstanceinformation.models;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EarthquakeRequestInterface {

    //https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&eventtype=earthquake&orderby=time&limit=10&minmag=6

    @GET("fdsnws/event/1/query")
    Call<EarthquakeResponse> getJSON(
            @Query("format") String format,
            @Query("eventtype") String eventtype,
            @Query("orderby") String orderby,
            @Query("limit") Integer limit,
            @Query("minmag") Double minmag);
}
