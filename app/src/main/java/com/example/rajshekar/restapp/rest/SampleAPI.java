package com.example.rajshekar.restapp.rest;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rajshekar on 27/07/16.
 */
public interface SampleAPI {
    @GET("/")
    Call<JSONObject> getData();

}
