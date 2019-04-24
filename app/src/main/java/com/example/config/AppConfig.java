package com.example.config;


import android.content.Context;
import android.content.SharedPreferences;

public class AppConfig {

    SharedPreferences sh ;
    SharedPreferences.Editor editor;

    public AppConfig(Context context){
        sh = context.getSharedPreferences("Config",Context.MODE_PRIVATE);
        editor = sh.edit();
    }

    public void saveData(String username){
        editor.putString("name",username);
        editor.commit();
    }

    public String getUser(){
        return sh.getString("name","defult");
    }


}
