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
import com.example.grobak.Data.DataDaging;
import com.example.grobak.Data.DataSayur;
import com.example.grobak.R;
import com.example.grobak.RecyclerViewAdapter;

import java.util.ArrayList;

public class SayurFragment extends Fragment {
    public static final String TAG = "SayurFragment";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sayur_fragment, container, false);


        return view;
    }
}
