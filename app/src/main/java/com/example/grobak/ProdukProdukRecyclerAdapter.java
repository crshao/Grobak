package com.example.grobak;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grobak.Data.BarangSatuan;
import com.example.grobak.Data.Resep;

import java.util.ArrayList;

public class ProdukProdukRecyclerAdapter extends RecyclerView.Adapter<ProdukProdukRecyclerAdapter.ViewHolder> {

    private ArrayList<BarangSatuan> mBarangSatuan = new ArrayList<>();
    private Context mContext;

    public ProdukProdukRecyclerAdapter(ArrayList<BarangSatuan> mBarangSatuan, Context mContext) {
        this.mBarangSatuan = mBarangSatuan;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ProdukProdukRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_semua_list_item, parent, false); // Pakai Layout yang sama kaya home aja sama persis soalnya
        return new ProdukProdukRecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdukProdukRecyclerAdapter.ViewHolder holder, int position) {
        holder.image_barang.setImageResource(mBarangSatuan.get(position).getImage());
        holder.namaBarang.setText(mBarangSatuan.get(position).getNama());
        holder.kuantitas.setText(mBarangSatuan.get(position).getKuantitas());
        holder.hargaBarang.setText(mBarangSatuan.get(position).getHarga());

    }

    @Override
    public int getItemCount() {
        return mBarangSatuan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image_barang;
        TextView namaBarang;
        TextView kuantitas;
        TextView hargaBarang;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_barang = itemView.findViewById(R.id.image);
            namaBarang = itemView.findViewById(R.id.namaBarang);
            kuantitas  = itemView.findViewById((R.id.kuantitasBarang));
            hargaBarang = itemView.findViewById(R.id.hargaMakanan);
        }
    }
}
