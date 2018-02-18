package com.example.android.afiframadhan_1202154217_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

    // untuk deklarasi objek
    private final LinkedList<String> mFoodList;     // mFoodList untuk menampung Object LinkedList berupa nama makanan
    private final LinkedList<Integer> mPriceList;   // mPriceList untuk menampung Object LinkedList berupa harga makanan
    private final LinkedList<Integer> mPhotoList;   // mPhotoList untuk menampung Object LinkedList berupa foto (Image source)
    private final LinkedList<String> mCompositionList;  // mCompositionList untuk menampung Object LinkedList berupa nama komposisi
    private LayoutInflater mInflater;   // Menampung LayoutInflater

    public MenuAdapter(Context context, LinkedList<String> foodList, LinkedList<Integer> priceList, LinkedList<Integer> photoList, LinkedList<String> compositionList) {
        mInflater = LayoutInflater.from(context);
        this.mFoodList = foodList;      // Assign mFoodList
        this.mPriceList = priceList;    // Assign mPriceList
        this.mPhotoList = photoList;    // Assign mPhotoList
        this.mCompositionList = compositionList;    // Assign mCompositionList
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.list_menu, parent, false);  // Menassign nilai LayoutInflater
        return new MenuViewHolder(mItemView, this);     // Mengembalikan MenuViewHolder
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        String mCurrentFood = mFoodList.get(position);      // memberikan posisi pada LinkedList mFoodList
        Integer mCurrentPrice = mPriceList.get(position);   // memberikan posisi pada LinkedList mPriceList
        Integer mCurrentPhoto = mPhotoList.get(position);   // memberikan posisi pada LinkedList mPhotoList
        String mCurrentComposition = mCompositionList.get(position);    // memberikan posisi pada LinkedList mCompositionList
        holder.foodItemView.setText(mCurrentFood);      // Set Text Makanan
        holder.priceItemView.setText("Rp."+mCurrentPrice.toString());   // Set Text Harga
        holder.photoItemView.setImageResource(mCurrentPhoto);   // Set Photo
    }

    @Override
    public int getItemCount() {
        return mFoodList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView foodItemView;     // Membuat variabel penampung TextView Makanan
        public final TextView priceItemView;    // Membuat variabel penampung TextView Harga
        public final ImageView photoItemView;   // Membuat variabel penampung TextView Foto Makanan
        public final TextView compositionItemView;  // Membuat variabel penampung TextView Komposisi

        final MenuAdapter mAdapter;
        public MenuViewHolder(final View itemView, MenuAdapter adapter) {
            super(itemView);
            foodItemView = (TextView)itemView.findViewById(R.id.tv_food);   // Menampung value dari Textview tv_food
            priceItemView = (TextView)itemView.findViewById(R.id.tv_price);     // Menampung value dari Textview tv_price
            photoItemView = (ImageView)itemView.findViewById(R.id.iv_photo);    // Menampung value dari Textview tv_photo
            compositionItemView = (TextView) itemView.findViewById(R.id.tv_composition);    // Menampung value dari Textview tv_composition
            photoItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Dapatkan posisi item yang diklik
                    int mPosition = getLayoutPosition();    // Mengatur Layout Position
                    // Gunakan itu untuk mengakses item yang terpengaruh di mWordList.
                    String food = mFoodList.get(mPosition);     // Mendapatkan posisi untuk nama Makanan
                    Integer price = mPriceList.get(mPosition);      // Mendapatkan posisi untuk Harga
                    Integer photo = mPhotoList.get(mPosition);      // Mendapatkan posisi untuk Foto
                    String composition = mCompositionList.get(mPosition);       // Mendapatkan posisi untuk Komposisi
                    Intent intent = new Intent(itemView.getContext(),DetailMenu.class);     // Membuat Intent yang diarahkan ke class Detail Menu
                    intent.putExtra("food",food);   // Mengirimkan data makanan
                    intent.putExtra("price",price);     // Mengirimkan data harga
                    intent.putExtra("photo",photo);     // Mengirimkan data foto
                    intent.putExtra("composition",composition);     // Mengirimkan data komposisi
                    itemView.getContext().startActivity(intent);    // Jalankan Activity
                }
            });
            this.mAdapter = adapter;
        }

        @Override
        public void onClick(View view) {    // Method kosong agar tidak terjadi error pada class ini
        }
    }
}
