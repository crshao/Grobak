package com.example.grobak;

import android.content.Context;
import android.content.Intent;
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

public class ResepResepRecyclerViewAdapter extends RecyclerView.Adapter<ResepResepRecyclerViewAdapter.ViewHolder> {

    private ArrayList<Resep> mResep = new ArrayList<>();
    private Context mContext;

    public ResepResepRecyclerViewAdapter(ArrayList<Resep> mBarangSatuan, Context mContext) {
        this.mResep = mBarangSatuan;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ResepResepRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resep_resep_list_item, parent, false);
        return new ResepResepRecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResepResepRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.image_resep.setImageResource(mResep.get(position).getImage());
        holder.namaResep.setText(mResep.get(position).getNama());
        holder.deskripsiResep.setText(mResep.get(position).getDetail());
    }

    @Override
    public int getItemCount() {
        return mResep.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image_resep;
        TextView namaResep;
        TextView deskripsiResep;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_resep = itemView.findViewById(R.id.image);
            namaResep = itemView.findViewById(R.id.namaResep);
            deskripsiResep = itemView.findViewById((R.id.deskripsiResep));
            itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    Intent intent = new Intent(v.getContext(),DetailResep.class);
                    intent.putExtra("pos",pos);
                    v.getContext().startActivity(intent);
                }
            });

        }
    }
}