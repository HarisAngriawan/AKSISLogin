package com.binainsanlestari.aksis.Helper;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelperGuru {
    private final String INTRO = "intro";
    private final String NAME = "name";
    private final String NAMA_SEKOLAH = "nama_sekolah";
    private SharedPreferences app_prefs;
    private Context context;

    public PreferenceHelperGuru(Context context) {
        app_prefs = context.getSharedPreferences("shared",
                Context.MODE_PRIVATE);
        this.context = context;
    }

    public void putIsLogin(boolean loginorout) {
        SharedPreferences.Editor edit = app_prefs.edit();
        edit.putBoolean(INTRO, loginorout);
        edit.commit();
    }

    public boolean getIsLogin() {
        return app_prefs.getBoolean(INTRO, false);
    }

    public void putName(String loginorout) {
        SharedPreferences.Editor edit = app_prefs.edit();
        edit.putString(NAME, loginorout);
        edit.commit();
    }

    public String getName() {
        return app_prefs.getString(NAME, "");
    }

    public void putNama_Sekolah(String loginorout) {
        SharedPreferences.Editor edit = app_prefs.edit();
        edit.putString(NAMA_SEKOLAH, loginorout);
        edit.commit();
    }

    public String getSekolah() {
        return app_prefs.getString(NAMA_SEKOLAH, "");
    }


}
