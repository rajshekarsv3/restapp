package com.example.rajshekar.restapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.rajshekar.restapp.rest.ApiClient;
import com.example.rajshekar.restapp.rest.SampleAPI;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements Callback<JSONObject>{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleAPI sampleAPI = ApiClient.getClient().create(SampleAPI.class);
        Call<JSONObject> call = sampleAPI.getData();
        call.enqueue(this);



    }

    @Override
    public void onResponse(Call<JSONObject> call, Response<JSONObject> response) {

        Log.d("respone",response.message()+"");
    }

    @Override
    public void onFailure(Call<JSONObject> call, Throwable t) {
        Log.d("respone",t+"");

    }
}
