package com.example.grobak.RecyclerViews;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grobak.R;

import java.util.ArrayList;

public class HomeListItemRecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    public static final String TAG = "RecyclerViewAdapter";

    //vars
    private ArrayList<String> mNamaBarang = new ArrayList<>();
    private ArrayList<String> mKuantitas = new ArrayList<>();
    private ArrayList<String> mHarga = new ArrayList<>();
    private ArrayList<Integer> mImages = new ArrayList<>();
    private Context mContext;

    public HomeListItemRecycleAdapter(ArrayList<String> mNamaBarang, ArrayList<String> mKuantitas, ArrayList<String> mHarga, ArrayList<Integer> mImages, Context mContext) {
        this.mNamaBarang = mNamaBarang;
        this.mKuantitas = mKuantitas;
        this.mHarga = mHarga;
        this.mImages = mImages;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG,"OnCreateViewHolder called");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_semua_list_item,parent,false);
        return new ViewHolder(view);
    } // Each Individual Layout

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) { // Get the Data for each Individual Layout
        Log.d(TAG,"OnBindViewHolder called");

    }

    @Override
    public int getItemCount() {
        return mNamaBarang.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView namaBarang,kuantitas,harga;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            namaBarang = itemView.findViewById(R.id.namaBarang);
            kuantitas = itemView.findViewById(R.id.kuantitasBarang);
            harga = itemView.findViewById(R.id.harga);
        }
    }

}
