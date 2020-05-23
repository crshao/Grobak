package com.example.grobak;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.grobak.Data.DataResep;
import com.example.grobak.Data.Resep;

import java.util.ArrayList;

public class DetailResep extends AppCompatActivity {

    ArrayList<Resep> resepArrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resep_detail);

        Intent intent = getIntent();
        int pos = intent.getIntExtra("pos",1);
        resepArrayList.addAll(DataResep.getListData());
        Resep resep = resepArrayList.get(pos);

        TextView nama = findViewById(R.id.namaResep);
        ImageView gambarMakanan = findViewById(R.id.gambarMakanan);
        TextView deskripsiResep = findViewById(R.id.deskripsiResep);
        TextView bahanResep = findViewById(R.id.bahanResep);
        String[] nutrition = resep.getNut();
        TextView jumlahKarbo = findViewById(R.id.jumlahKarbo);
        TextView jumlahKalori = findViewById(R.id.jumlahKalori);
        TextView jumlahProtein = findViewById(R.id.jumlahProtein);
        Button button = findViewById(R.id.linkVideo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(resep.getUrl()));
                startActivity(intent);
            }
        });

        nama.setText(resep.getNama());
        deskripsiResep.setText(resep.getDetail());
        bahanResep.setText(resep.getBahan());
        gambarMakanan.setImageResource(resep.getImage());
        jumlahKarbo.setText(nutrition[0]);
        jumlahKalori.setText(nutrition[1]);
        jumlahProtein.setText(nutrition[2]);






    }
}
