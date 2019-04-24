package com.example.webservice;

import com.example.model.Ads;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface I3vioHandler {



    @POST("register.php")
    @FormUrlEncoded
    public Call<List<Ads>> registerAds(@Field("app_title") String appTitle,@Field("username") String userName,
                                       @Field("dateTime") String date);

}
