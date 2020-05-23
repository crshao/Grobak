package com.example.grobak;


import android.location.Location;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LocationFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static Fragment newInstance(int index) {

        Fragment fragment;

        if (index == 0) //Artinya user menekan Location
        {
            fragment = new LocationFragment();
        }
        else if(index == 1) //User menekan Payment
        {
            fragment = new PaymentFragment();
        }
        else //User menekan Confirmation
        {
            fragment = new ConfirmationFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    public LocationFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int index = 0;

        TextView textView = view.findViewById(R.id.header_text);

        if(getArguments() != null)
        {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }

//        textView.setText(getString(R.string.test));
    }
}
