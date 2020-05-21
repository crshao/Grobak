package com.example.grobak.Navbar;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.grobak.Data.DataResep;
import com.example.grobak.Data.Resep;
import com.example.grobak.HomeResepRecyclerViewAdapter;
import com.example.grobak.R;
import com.example.grobak.ResepResepRecyclerViewAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResepFragment extends Fragment {

    private ArrayList<Resep> mResep = new ArrayList<>();
    public ResepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resep, container, false);
        mResep.addAll(DataResep.getListData());

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.resepResepRecyclerView);
        recyclerView.setLayoutManager(layoutManager);
        ResepResepRecyclerViewAdapter adapter = new ResepResepRecyclerViewAdapter(mResep,getActivity());

        recyclerView.setAdapter(adapter);

        return view;
    }

}
