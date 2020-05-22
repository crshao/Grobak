package com.example.grobak.Navbar;


import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.grobak.Data.BarangSatuan;
import com.example.grobak.Data.DataDaging;
import com.example.grobak.Data.DataResep;
import com.example.grobak.Data.DataSayur;
import com.example.grobak.Data.DataSeafood;
import com.example.grobak.Data.Resep;
import com.example.grobak.ProdukProdukRecyclerAdapter;
import com.example.grobak.R;
import com.example.grobak.RecyclerViewAdapter;
import com.example.grobak.ResepResepRecyclerViewAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProdukFragment extends Fragment {

    private ArrayList<BarangSatuan> mBarang = new ArrayList<>();
    public ProdukFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_produk, container, false);
        mBarang.addAll(DataDaging.getDataDaging());
        mBarang.addAll(DataSayur.getDataSayur());
        mBarang.addAll(DataSeafood.getDataSeafood());

//        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.produkProdukRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
//        recyclerView.setLayoutManager(layoutManager);
        ProdukProdukRecyclerAdapter adapter = new ProdukProdukRecyclerAdapter(mBarang,getActivity());

        DividerItemDecoration itemDecoration = new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL);
        DividerItemDecoration itemDecoration1 = new DividerItemDecoration(getActivity(),DividerItemDecoration.HORIZONTAL);
        itemDecoration1.setDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.divider));
        itemDecoration.setDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.divider_vertical  ));
        recyclerView.addItemDecoration(itemDecoration1);
        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setAdapter(adapter);

        return view;
    }

}
