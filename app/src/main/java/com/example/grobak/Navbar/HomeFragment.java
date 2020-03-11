package com.example.grobak.Navbar;


import android.content.Intent;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.OnClick;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.grobak.CartFragment;
import com.example.grobak.Data.BarangSatuan;
import com.example.grobak.Data.DataDaging;
import com.example.grobak.HomeFragments.ViewPagerAdapter;
import com.example.grobak.R;
import com.example.grobak.RecyclerViewAdapter;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

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
        ImageView btnCart = (ImageView)view.findViewById(R.id.btn_cart);

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

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.btn_cart:
                Log.d("CART", "CART");
                Toast.makeText(getContext(),"KETEKAN", Toast.LENGTH_SHORT).show();
                Fragment fragment = new CartFragment();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.cart_fragment, fragment,"cart");
                ft.addToBackStack(null);
                ft.commit();
                break;
            default:
                break;
        }
    }
}
