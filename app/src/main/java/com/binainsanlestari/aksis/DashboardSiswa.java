package com.binainsanlestari.aksis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.binainsanlestari.aksis.Helper.PreferenceHelperSiswa;

public class DashboardSiswa extends AppCompatActivity {
    private TextView tvname, tvNamaSekolah;

    private PreferenceHelperSiswa preferenceHelperSiswa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_siswa);

        preferenceHelperSiswa = new PreferenceHelperSiswa(this);

        tvname = (TextView) findViewById(R.id.nama_siswa);
        tvNamaSekolah = (TextView) findViewById(R.id.nama_sekolah_siswa);

        tvname.setText(preferenceHelperSiswa.getName());
        tvNamaSekolah.setText(preferenceHelperSiswa.getSekolah());
    }
}
