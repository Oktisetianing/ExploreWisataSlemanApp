package com.example.explorewisataslemanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailwisatalainnyaActivity extends AppCompatActivity {
    ImageView gambar;
    TextView tvnamawisata, tvjambuka, tvdeskripsi, tvalamat;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailwisatalainnya);

        gambar = findViewById(R.id.gambar);
        tvnamawisata = findViewById(R.id.tvnamawisata);
        tvjambuka = findViewById(R.id.tvjambuka);
        tvdeskripsi = findViewById(R.id.tvdeskripsi);
        tvalamat = findViewById(R.id.tvalamat);

        int gambarwst = getIntent().getIntExtra("Gambar", 0);
        gambar.setImageResource(gambarwst);
        tvnamawisata.setText(getIntent().getExtras().getString("Nama Wisata"));
        tvjambuka.setText(getIntent().getExtras().getString("Jam Buka"));
        tvdeskripsi.setText(getIntent().getExtras().getString("Deskripsi"));
        tvalamat.setText(getIntent().getExtras().getString("Alamat"));

    }
}