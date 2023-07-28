package com.example.explorewisataslemanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class WisataCandiActivity extends AppCompatActivity {

    RecyclerView recyclerviewwisatacandi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_candi);

        //menambahkan data untuk item list
        WisatacandiModel [] datawisata = new WisatacandiModel[]{
                new WisatacandiModel("Candi Prambanan", "06.30","Candi Prambanan adalah bangunan candi bercorak agama hindu terbesar di Indonesia yang dibangun pada abad ke-9 Masehi.","Bokoharjo, Kec. Prambanan", R.drawable.candiprambanan),
                new WisatacandiModel("Candi Ratu Boko", "07.00","Situs Ratu Boko atau Istana Raja Baka adalah situs purbakala yang merupakan kompleks sejumlah sisa bangunan yang berada kira-kira 3 km di sebelah selatan dari kompleks Candi Prambanan.","Gatak, Bokoharjo, Kec. Prambanan", R.drawable.wisatacandiratuboko),
                new WisatacandiModel("Candi Sambisari", "07.00","Candi Sambisari adalah candi Hindu yang berada di Purwomartani, Kalasan, Sleman, Daerah Istimewa Yogyakarta. Posisinya kira-kira 12 km di sebelah timur kota Yogyakarta ke arah kota Solo atau kira-kira 4 km sebelah barat kompleks Candi Prambanan.","Sambisari, Purwomartani, Kec. Kalasan", R.drawable.candisambisari),
                new WisatacandiModel("Candi Ijo", "07.00","Candi Ijo adalah sebuah kompleks percandian bercorak Hindu, berada 4 kilometer arah tenggara dari Candi Ratu Boko atau kira-kira 18 kilometer di sebelah timur kota Yogyakarta. Candi ini diperkirakan dibangun antara abad ke-10 sampai dengan ke-11 Masehi pada saat zaman Kerajaan Medang periode Mataram.","Nglengkong, Sambirejo, Kec. Prambanan", R.drawable.candiijo),
        };

        recyclerviewwisatacandi = findViewById(R.id.recycleviewwisatacandi);
        WisatacandiAdapter wisataadpter = new WisatacandiAdapter(datawisata);
        recyclerviewwisatacandi.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerviewwisatacandi.setAdapter(wisataadpter);

    }
}