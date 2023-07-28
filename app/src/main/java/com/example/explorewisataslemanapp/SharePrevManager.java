package com.example.explorewisataslemanapp;

import android.content.Context;
import android.content.SharedPreferences;

public class SharePrevManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public SharePrevManager(Context context) {
        sharedPreferences = context.getSharedPreferences("com.example.explorewisatasleman", context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        setAsDefaultValue();
    }

    private void setAsDefaultValue() {
        setUsername("sleman");
        setPassword("sembada");
    }

    private void setPassword(String s) {
        editor.putString("sp_password", s);
        editor.commit();
    }

    private void setUsername(String admin) {
        editor.putString("sp_username", admin);
        editor.commit();
    }

    public void saveIsLogin(Boolean value) {
        editor.putBoolean("sp_isLogin", value);
        editor.commit();
    }

    //mendapatkan value shared Preference
    public String getUsername(){return sharedPreferences.getString("sp_username","");}
    public String getPassword(){return sharedPreferences.getString("sp_password","");}
    public Boolean getIsLogin(){return sharedPreferences.getBoolean("sp_isLogin",false);}
}
