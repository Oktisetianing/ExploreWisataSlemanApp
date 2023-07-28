package com.example.explorewisataslemanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class WisataAlamActivity extends AppCompatActivity {

    RecyclerView recyclerviewwisataalam;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam);

        //menambahkan data untuk item list
        WisataalamModel [] datawisataalam = new WisataalamModel[]{
                new WisataalamModel("Bukit Klangon", "24 jam","Bukit Klangon yang terletak di Desa Glagaharjo, Cangkringan, Sleman merupakan salah satu destinasi wisata lereng Merapi yang banyak dikunjungi wisatawan terutama anak muda. Bukit ini menjadi spot foto yang sangat instagramable.","Kalitengah Lor, Glagaharjo, Kec. Cangkringan", R.drawable.bukitklangon),
                new WisataalamModel("Taman Nasional G. Merapi", "08.00","Taman Nasional Gunung Merapi adalah sebuah taman nasional yang terletak di Jawa bagian tengah. Secara administrasi kepemerintahan, wilayah taman nasional ini masuk ke dalam wilayah dua provinsi, yakni Jawa Tengah dan Yogyakarta.","Hargobinangun, Pakem", R.drawable.kaliurang),
                new WisataalamModel("Nawang Jagat", "06.00","Nawang Jagad merupakan tempat perkemahan dengan suasana alam asri. Wisatawan dapat menikmati panorama alam yang membentang di sekeliling bumi perkemahan tersebut.","Hargobinangun, Kec. Pakem", R.drawable.nawangjagad),
                new WisataalamModel("Telaga Putri", "07.00","Tlogo Putri Kaliurang merupakan sebuah destinasi liburan dengan spot danau dan berbagai wahana seru. Obyek wisata telaga tersebut memiliki pemandangan alam Kaliurang yang indah dengan pepohonan rimbun nan hijau disekelilingnya. Lokasi wisata ini tepatnya berada di lereng Gunung Merapi, sehingga berada dekat dengan tempat rekreasi lainnya.","Hargobinangun, Kec. Pakem", R.drawable.tlogoputri),
        };

        recyclerviewwisataalam = findViewById(R.id.recycleviewwisataalam);
        WisataalamAdapter wisataadpter = new WisataalamAdapter(datawisataalam);
        recyclerviewwisataalam.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerviewwisataalam.setAdapter(wisataadpter);

    }
}