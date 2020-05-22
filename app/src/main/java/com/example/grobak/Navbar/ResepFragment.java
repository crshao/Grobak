package com.example.grobak.Navbar;


import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.grobak.Data.DataResep;
import com.example.grobak.Data.Resep;
import com.example.grobak.DetailResep;
import com.example.grobak.HomeResepRecyclerViewAdapter;
import com.example.grobak.R;
import com.example.grobak.ResepResepRecyclerViewAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResepFragment extends Fragment implements ResepResepRecyclerViewAdapter.OnNoteListener {

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
        ResepResepRecyclerViewAdapter adapter = new ResepResepRecyclerViewAdapter(mResep,getActivity(), this);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.divider_vertical  ));
        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void OnNoteClick(int position) {
        Resep currResep = new Resep();
        currResep = mResep.get(position);
        Intent intent = new Intent(getActivity(), DetailResep.class);
        Toast.makeText(getContext(),"dor",Toast.LENGTH_SHORT);
        intent.putExtra("nama",currResep.getNama());
        intent.putExtra("detail",currResep.getDetail());
        intent.putExtra("bahan",currResep.getBahan());
        intent.putExtra("image",currResep.getImage());
        intent.putExtra("nutrition",currResep.getNut());
        intent.putExtra("url",currResep.getUrl());
        //startActivity(intent);

    }
}
