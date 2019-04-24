package com.example.webservice;

import android.content.Context;

import com.example.model.Ads;
import com.example.model.IMessageListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WebServiceCaller {
    Context context;
    I3vioHandler apiInterface;
    Ads adsList=new Ads();

    public WebServiceCaller(Context context){

        this.context=context;
        apiInterface=ApiClinet.getClinet().create(I3vioHandler.class);

    }

    public void register(final IMessageListener iMessageListener,String appTitle, String userName,String
            date) throws Exception{

        Call<List<Ads>> register=apiInterface.registerAds(appTitle,userName,date);
        register.enqueue(new Callback<List<Ads>>() {
            @Override
            public void onResponse(Call<List<Ads>> call, Response<List<Ads>> response) {
                iMessageListener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<List<Ads>> call, Throwable t) {
                iMessageListener.onError(t.getMessage());
            }
        });


    }




}
