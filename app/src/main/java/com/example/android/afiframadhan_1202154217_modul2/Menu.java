package com.example.android.afiframadhan_1202154217_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private final LinkedList<String> composition = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos, composition);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        // agar membuat dummy data dari data dibawah ini yang akan mengkopi data per iterasi
        for (int i = 0;i < 2; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Rendang");
            foods.add("Dendeng");
            foods.add("Gulai Ikan");
            foods.add("Gulai Ayam");
            foods.add("Gulai Cancang");
            foods.add("Mie Pical");
            foods.add("Lontong Sayur");
            foods.add("Lado Mudo");
            foods.add("Bubur Kampiun");

            // mamanggil harga
            priceses.add(15000);
            priceses.add(15000);
            priceses.add(12000);
            priceses.add(12000);
            priceses.add(8000);
            priceses.add(10000);
            priceses.add(10000);
            priceses.add(3000);
            priceses.add(5000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.rendang);
            photos.add(R.drawable.dendeng);
            photos.add(R.drawable.gulai_ikan);
            photos.add(R.drawable.ayam_gulai);
            photos.add(R.drawable.cancang);
            photos.add(R.drawable.pical);
            photos.add(R.drawable.lontong_sayur);
            photos.add(R.drawable.lado_mudo);
            photos.add(R.drawable.bubur_kampiun);

            // membuat komposisi
            composition.add("Daging Sapi, Lengkuas, Cabai, Bawang Merah, Bawang Putih, Jahe, Kunyit, Pala, Santan, Garam");
            composition.add("Daging Sapi Penyet, Cabai, Lengkuas, Bawang Merah, Bawang Putih, Garam");
            composition.add("Ikan, Kunyit, Cabai, Garam, Santan");
            composition.add("Daging Ayam, Kunyit, Cabai, Garam, Santan, Bawang Putih, Bawang Merah");
            composition.add("Daging Kambing, Kunyit, Cabai, Garam, Santan");
            composition.add("Mie, Bumbu Kacang, Air, Cabai, Toge, Kerupuk, Garam");
            composition.add("Lontong, Sayur Bayam, Toge, Kerupuk Santan, Air, Cabai");
            composition.add("Cabai Hijau Muda, Garam, Bawang Merah");
            composition.add("Surabi, Ketan Hitam, Santan, Gula, Air, Es, Kacang Hijau");

        }
    }
}
