package com.example.grobak;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConfirmationFragment extends Fragment {


    public ConfirmationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_confirmation, container, false);
        MaterialButton button = view.findViewById(R.id.btn_place_order);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Confirmation", "Confirmation");
                Intent intent = new Intent(getActivity(), AfterPlaceOrderFragment.class);
                startActivity(intent);
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
