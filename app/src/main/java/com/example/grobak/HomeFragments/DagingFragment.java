package com.example.grobak.HomeFragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grobak.Data.BarangSatuan;
import com.example.grobak.Data.DataDaging;
import com.example.grobak.R;
import com.example.grobak.RecyclerViewAdapter;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class DagingFragment extends Fragment {

    ArrayList<BarangSatuan> mBarangSatuan = new ArrayList<>();

    public static final String TAG = "DagingFragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.daging_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.dagingRecyclerView);
        mBarangSatuan.addAll(DataDaging.getDataDaging());

        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(),mBarangSatuan);
        recyclerView.setAdapter(adapter);


        return view;
    }
}
