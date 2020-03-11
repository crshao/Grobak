package com.example.grobak;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import butterknife.BindView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends Fragment {

    @BindView(R.id.img_udang)
    ImageView udang;

    @BindView(R.id.img_daging)
    ImageView daging;

    @BindView(R.id.img_ikan)
    ImageView ikan;


    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        udang.setImageResource(R.drawable.jerbung);
        daging.setImageResource(R.drawable.chuck);
        ikan.setImageResource(R.drawable.tongkol);
        return inflater.inflate(R.layout.fragment_cart, container, false);
    }

}
