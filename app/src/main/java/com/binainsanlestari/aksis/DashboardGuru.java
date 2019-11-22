package com.binainsanlestari.aksis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.binainsanlestari.aksis.Helper.PreferenceHelperGuru;

public class DashboardGuru extends AppCompatActivity {
    private TextView tvname, tvNamaSekolah;
    private PreferenceHelperGuru preferenceHelperGuru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_guru);
        preferenceHelperGuru = new PreferenceHelperGuru(this);

        tvname = (TextView) findViewById(R.id.nama_login);
        tvNamaSekolah = (TextView) findViewById(R.id.nama_sekolah);

        tvname.setText(preferenceHelperGuru.getName());
        tvNamaSekolah.setText(preferenceHelperGuru.getSekolah());
    }
}
