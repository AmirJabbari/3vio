package com.example.util;

import android.app.Service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ConnectionDetector {


    Context contex;
    public ConnectionDetector(Context contex){
        this.contex = contex;

    }

    public boolean isConnected(){

        ConnectivityManager connectivityManager =
                (ConnectivityManager) contex.getSystemService(Service.CONNECTIVITY_SERVICE);
        if(connectivityManager != null){
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if(networkInfo != null){
                if(networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }

                }

            }
            return false;
        }
    }


