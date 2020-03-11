package com.example.grobak.HomeFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grobak.Data.BarangSatuan;
import com.example.grobak.Data.DataSayur;
import com.example.grobak.Data.DataSeafood;
import com.example.grobak.R;
import com.example.grobak.RecyclerViewAdapter;

import java.util.ArrayList;

public class SeafoodFragment extends Fragment {

    ArrayList<BarangSatuan> mBarangSatuan = new ArrayList<>();

    public static final String TAG = "SeafoodFragment";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.seafood_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.seafoodRecyclerView);
        mBarangSatuan.addAll(DataSeafood.getDataSeafood());

        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);


        //Item Decoration
        DividerItemDecoration itemDecoration = new DividerItemDecoration(getActivity(),DividerItemDecoration.HORIZONTAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.divider));
        recyclerView.addItemDecoration(itemDecoration);


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(),mBarangSatuan);
        recyclerView.setAdapter(adapter);


        return view;
    }
}
