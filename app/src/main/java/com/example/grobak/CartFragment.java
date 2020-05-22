package com.example.grobak;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.BindView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends Fragment {

//    @BindView(R.id.img_udang)
//    ImageView udang;
//
//    @BindView(R.id.img_daging)
//    ImageView daging;
//
//    @BindView(R.id.img_ikan)
//    ImageView ikan;



    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        MaterialButton btn_checkout = view.findViewById(R.id.btn_checkout);

        btn_checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Checkout", "Checkout");
                Toast.makeText(getContext(), "ke checkout", Toast.LENGTH_SHORT).show();
                Fragment fragment = new
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView udang = getView().findViewById(R.id.img_udang);
        ImageView ikan = getView().findViewById(R.id.img_ikan);
        ImageView daging = getView().findViewById(R.id.img_daging);

        udang.setImageResource(R.drawable.jerbung);
        daging.setImageResource(R.drawable.chuck);
        ikan.setImageResource(R.drawable.tongkol);
    }
}
