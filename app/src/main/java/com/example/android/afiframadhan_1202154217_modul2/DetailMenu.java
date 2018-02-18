package com.example.android.afiframadhan_1202154217_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    // untuk deklarasi objek
    TextView textview_food, textview_price, textview_composition;
    ImageView imageview_photo;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent(); // mengambil data dari activity sebeleumnya
        String food = intent.getStringExtra("food");    // Mendapatkan data makanan
        Integer price = intent.getIntExtra("price",0);      // Mendapatkan data harga
        Integer photo = intent.getIntExtra("photo",0);      // Mendapatkan data foto
        String composition = intent.getStringExtra("composition");      // Mendapatkan data komposisi

        Log.d("getIntExtra", ""+price+photo);   // Menampilkan Log di LogCat

        textview_food = (TextView)findViewById(R.id.tv_detailFood);     // Mendapatkan id TextView dan ditampung pada variabel
        textview_price = (TextView)findViewById(R.id.tv_detailPrice);   // Mendapatkan id TextView dan ditampung pada variabel
        imageview_photo = (ImageView)findViewById(R.id.iv_detailPhoto);     // Mendapatkan id ImageView dan ditampung pada variabel
        textview_composition = (TextView) findViewById(R.id.tv_composition);    // Mendapatkan id TextView dan ditampung pada variabel

        textview_food.setText(food);    // set TextView berdasarkan data yang didapatkan pada aktivitas sebelumnya
        textview_price.setText("Rp. "+price);   // set TextView berdasarkan data yang didapatkan pada aktivitas sebelumnya
        imageview_photo.setImageResource(photo);    // set ImageView berdasarkan data yang didapatkan pada aktivitas sebelumnya
        textview_composition.setText(composition);      // set TextView berdasarkan data yang didapatkan pada aktivitas sebelumnya
    }
}
