package com.example.grobak.Navbar;


import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.grobak.Data.BarangSatuan;
import com.example.grobak.Data.DataDaging;
import com.example.grobak.HomeFragments.ViewPagerAdapter;
import com.example.grobak.R;
import com.example.grobak.RecyclerViewAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private ArrayList<BarangSatuan> mBarangSatuan = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //View Pager
        ViewPager viewPager = view.findViewById(R.id.view_pager);
        viewPager.setAdapter(new ViewPagerAdapter(getChildFragmentManager()));
        //TabLayout
        TabLayout tabLayout = view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

//        //RecyclerView
//        mBarangSatuan.addAll(DataDaging.getDataDaging());
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
//        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(layoutManager);
//        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(),mBarangSatuan);
//
//        //Item Decoration
//        DividerItemDecoration itemDecoration = new DividerItemDecoration(getActivity(),DividerItemDecoration.HORIZONTAL);
//        itemDecoration.setDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.divider));
//        recyclerView.addItemDecoration(itemDecoration);
//
//        recyclerView.setAdapter(adapter);

        return view;

    }


}
