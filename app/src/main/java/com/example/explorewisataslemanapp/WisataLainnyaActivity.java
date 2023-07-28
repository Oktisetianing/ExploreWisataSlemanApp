package com.example.explorewisataslemanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class WisataLainnyaActivity extends AppCompatActivity {

    RecyclerView recyclerviewwisatlainnya;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_lainnya);

        //menambahkan data untuk item list
        WisatalainnyaModel [] datawisatalainnya = new WisatalainnyaModel[]{
                new WisatalainnyaModel("Bhumi Merapi", "09.00", "Taman pertanian tempat pengunjung bisa memerah susu kambing, memberi makan kelinci & selfie di Santorini mini.", " Sawungan, Hargobinangun, Kec. Pakem", R.drawable.bhumimerapi),
                new WisatalainnyaModel("Museum Ullen", "08.30", "Museum Ullen Sentalu, terletak di Kecamatan Pakem, Kabupaten Sleman, Daerah Istimewa Yogyakarta, adalah museum yang menampilkan budaya dan kehidupan para bangsawan Dinasti Mataram beserta koleksi bermacam-macam batik.", "Hargobinangun, Pakem", R.drawable.museumullen),
                new WisatalainnyaModel("Waterboom Jogja", "09.00", "Salah satu waterpark terbesar di asia tenggara yang berlokasi di kota wisata terbesar kedua di Indonesia yaitu Yogyakarta. Waterboom Jogja telah tersertifikasi CHSE (Clean, Health, Safety, & Enviroment) dengan score 100% dari Kemenparekraf RI dan Sucofindo. Keunikan Waterboom Jogja terdapat taman yang penuh dengan tanaman hijau dan thematic park.Selain itu di Waterboom Jogja juga terdapat 19 wahana seru yang bisa dimainkan.", "Jenengan, Maguwoharjo, Kec. Depok", R.drawable.waterboomjogja),
        };

        recyclerviewwisatlainnya = findViewById(R.id.recycleviewwisatalainnya);
        WisatalainnyaAdapter wisataadpter = new WisatalainnyaAdapter(datawisatalainnya);
        recyclerviewwisatlainnya.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerviewwisatlainnya.setAdapter(wisataadpter);

    }
}