package com.example.grobak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.grobak.Data.BarangSatuan;
import com.example.grobak.Data.DataDaging;
import com.example.grobak.RecyclerViews.HomeListItemRecycleAdapter;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private ArrayList<BarangSatuan> mBarangSatuan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mBarangSatuan.addAll(DataDaging.getDataDaging());
        initRecycle(mBarangSatuan);
    }
    private void initRecycle(ArrayList<BarangSatuan> mBarangSatuan){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(layoutManager);
        HomeListItemRecycleAdapter adapter = new HomeListItemRecycleAdapter(this,mBarangSatuan);

        //Item Decoration
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(this,R.drawable.divider));
        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setAdapter(adapter);
    }
}
