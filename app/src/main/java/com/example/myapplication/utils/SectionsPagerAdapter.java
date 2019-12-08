package com.example.myapplication.utils;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Owner on 14-Nov-17.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final List<Fragment> mFragmentList = new ArrayList<>();
    private static final List<String> mFragmentTitleList = new ArrayList<>();

    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1);
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        //return 2;
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
            /*switch (position) {
                case 0:
                    return "NEW STORY";
                case 1:
                    return "PREVIOUS STORY";
                            }
            return null;*/
        return mFragmentTitleList.get(position);
    }
}