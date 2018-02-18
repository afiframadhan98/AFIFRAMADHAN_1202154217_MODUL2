package com.example.android.afiframadhan_1202154217_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash extends Activity {

    // Method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this, "AFIF RAMADHAN_1202154217", Toast.LENGTH_SHORT).show(); // Akan menampilkan pesan AFIF RAMADHAN_1202154217
        final Handler handler = new Handler();  // Digunakan untuk memproses Objek Message Toast
        handler.postDelayed(new Runnable() {    // Menjalankan Message Toast dengan delay

            // Method untuk mengarahkan ke aktivitas MainActivity class
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));     // Menjalankan Aktivitas Intent
                finish();   // Method finish Splash and Toast
            }
        }, 4000L); //4000 L = 4 second
    }
}
