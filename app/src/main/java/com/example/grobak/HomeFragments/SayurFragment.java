package com.example.grobak.HomeFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grobak.Data.BarangSatuan;
import com.example.grobak.Data.DataDaging;
import com.example.grobak.Data.DataSayur;
import com.example.grobak.R;
import com.example.grobak.RecyclerViewAdapter;

import java.util.ArrayList;

public class SayurFragment extends Fragment {
    ArrayList<BarangSatuan> mBarangSatuan = new ArrayList<>();
    public static final String TAG = "SayurFragment";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sayur_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycle_view);
        mBarangSatuan.addAll(DataSayur.getDataSayur());

        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(),mBarangSatuan);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
