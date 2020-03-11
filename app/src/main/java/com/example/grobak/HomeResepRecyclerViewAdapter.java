package com.example.grobak;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grobak.Data.Resep;

import java.util.ArrayList;

public class HomeResepRecyclerViewAdapter extends RecyclerView.Adapter<HomeResepRecyclerViewAdapter.ViewHolder> {

    private ArrayList<Resep> mResep = new ArrayList<>();
    private Context mContext;

    public HomeResepRecyclerViewAdapter(ArrayList<Resep> mBarangSatuan, Context mContext) {
        this.mResep = mBarangSatuan;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_resep_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image_resep.setImageResource(mResep.get(position).getImage());
        holder.namaResep.setText(mResep.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return mResep.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image_resep;
        TextView namaResep;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_resep = itemView.findViewById(R.id.image);
            namaResep = itemView.findViewById(R.id.namaResep);

            itemView.setOnClickListener(v -> {
                int pos = getAdapterPosition();
                Resep resep = mResep.get(pos);
                Toast.makeText(mContext,"Detail" + resep.getNama(),Toast.LENGTH_SHORT).show();
            });


        }
    }

}
