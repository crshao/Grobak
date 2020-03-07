package com.example.grobak.Navbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.grobak.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Navbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);

        private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                String tag = "";
                switch(item.getItemId())
                {
                    case R.id.home:

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
        }
    }
}
