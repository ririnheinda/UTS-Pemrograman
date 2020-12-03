package com.example.galeribuahtropis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    ImageButton btnPutih,btnOrange,btnHitam;
    public static final String WARNA_GALERI_KEY = "WARNA_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnPutih = findViewById(R.id.btn_buka_nama_putih);
        btnOrange = findViewById(R.id.btn_buka_nama_orange);
        btnHitam = findViewById(R.id.btn_buka_nama_hitam);
        btnPutih.setOnClickListener(view -> bukaGaleri("Putih"));
        btnOrange.setOnClickListener(view -> bukaGaleri("Orange"));
        btnHitam.setOnClickListener(view -> bukaGaleri("Hitam"));
    }
    private void bukaGaleri(String warnaBuah) {
        Log.d("MAIN","Buka activity putih");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(WARNA_GALERI_KEY, warnaBuah);
        startActivity(intent);
    }
}