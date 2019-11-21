package com.binainsanlestari.aksis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartUp extends AppCompatActivity {

    private Button BtnGuru,BtnSiswa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_up);
        BtnGuru = (Button) findViewById(R.id.masukGuru);
        BtnSiswa = findViewById(R.id.masukSiswa);


        BtnGuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mGuru = new Intent(StartUp.this, LoginGuru.class);
                startActivity(mGuru);
            }
        });

        BtnSiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mSiswa = new Intent(StartUp.this, LoginSiswa.class);
                startActivity(mSiswa);
            }
        });

    }


}