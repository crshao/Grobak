package com.example.grobak;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grobak.Data.BarangSatuan;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecycleView Called";

    //Variabel
    private ArrayList<BarangSatuan> mBarangSatuan = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context mContext, ArrayList<BarangSatuan> mBarangSatuan) {
        this.mBarangSatuan = mBarangSatuan;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_semua_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG,"OnBindViewHolderCalled : ");

        holder.namaBarang.setText(mBarangSatuan.get(position).getNama());
        holder.kuantitas.setText(mBarangSatuan.get(position).getKuantitas());
        holder.harga.setText(mBarangSatuan.get(position).getHarga());
        holder.image.setImageResource(mBarangSatuan.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mBarangSatuan.size();
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
