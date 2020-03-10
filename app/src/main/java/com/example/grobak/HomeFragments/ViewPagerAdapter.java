package com.example.grobak.HomeFragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new DagingFragment(); //ChildFragment1 at position 0
            case 1:
                return new SeafoodFragment(); //ChildFragment2 at position 1
            case 2:
                return new SayurFragment(); //ChildFragment3 at position 2
        }
        return null; //does not happen
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = getItem(position).getClass().getName();
        String Ctitle = title.replace("Fragment","");
        return Ctitle.subSequence(Ctitle.lastIndexOf(".") + 1, Ctitle.length());
    }
}
