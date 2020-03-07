package com.example.grobak.Navbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.grobak.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class Navbar extends AppCompatActivity {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigationView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            String tag = "";
            switch(item.getItemId())
            {
                case R.id.home:
                    fragment = new HomeFragment();
                    tag = "Home";
                    break;
                case R.id.resep:
                    break;
                case R.id.produk:
                    break;
                case R.id.menu:
                    break;
                default:
                    break;
            }
            return loadFrag(getVisibleFragment(), fragment, tag);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);
        ButterKnife.bind(this);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFrag(null, new HomeFragment(), "Home");
    }

    public Fragment getVisibleFragment() {
        FragmentManager fragmentManager = Navbar.this.getSupportFragmentManager();
        List<Fragment> fragments = fragmentManager.getFragments();
        for(Fragment fragment : fragments)
        {
            if(fragment != null && fragment.isVisible())
                return fragment;
        }
        return null;
    }

    public boolean loadFrag(Fragment currFragment,Fragment goFragment, String tag){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction;
        fragmentTransaction = fragmentManager.beginTransaction();
        if(currFragment!=null){
            fragmentTransaction.hide(currFragment);
        }
        if(fragmentManager.findFragmentByTag(tag)!=null){
            fragmentTransaction.show(fragmentManager.findFragmentByTag(tag));
        }
        else{
            fragmentTransaction.add(R.id.navbar,goFragment,tag);
        }
        fragmentTransaction.commit();
        return true;
    }
}
