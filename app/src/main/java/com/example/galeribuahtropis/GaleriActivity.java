package com.example.galeribuahtropis;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.galeribuahtropis.Model.Buah;

import java.util.List;

public class GaleriActivity extends AppCompatActivity {

    List<Buah> buahs;
    int indeksTampil = 0;
    String warnaBuah;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txNama,txJenis,txDeskripsi,txJudul;
    ImageView ivFotoBuah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_nama);
        Intent intent = getIntent();
        warnaBuah = intent.getStringExtra(MainActivity.WARNA_GALERI_KEY);
        buahs = DataProvider.getBuahsByTipe(this,warnaBuah);
        inisialisasiView();
        tampilkanProfil();
    }
    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> buahPertama());
        btnTerakhir.setOnClickListener(view -> buahTerakhir());
        btnSebelumnya.setOnClickListener(view -> buahSebelumnya());
        btnBerikutnya.setOnClickListener(view -> buahBerikutnya());

        txNama = findViewById(R.id.txNama);
        txJenis = findViewById(R.id.txJenis);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoBuah = findViewById(R.id.gambarBuah);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Berbagai Macam Buah " + warnaBuah);
    }
    private void tampilkanProfil() {
        Buah k = buahs.get(indeksTampil);
        Log.d("ORANGE","Menampilkan orange "+k.getWarna());
        txNama.setText(k.getNama());
        txJenis.setText(k.getJenis());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoBuah.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }
    private void buahPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }
    private void buahTerakhir() {
        int posAkhir = buahs.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }
    private void buahBerikutnya() {
        if (indeksTampil == buahs.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void buahSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}
