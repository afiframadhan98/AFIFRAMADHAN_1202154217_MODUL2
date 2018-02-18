package com.example.android.afiframadhan_1202154217_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    // Method untuk Mengarahkan ke Aktivitas selanjutnya jika tombol "PILIH PESANAN"
     public void onClickOrder(View view) {
        Intent intent = new Intent(this,Menu.class);    // Membuat Intent Baru yang mereferensi ke class Menu
        startActivity(intent);  // Menjalankan Activity of Intent
    }
}
