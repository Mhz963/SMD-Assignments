package com.example.assignment2;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

class SectionsPageAdapter extends FragmentPagerAdapter {
    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

private ArrayList<Fragment> mFragmentList = new ArrayList<Fragment>();
private ArrayList<String> mFragmentTitleList = new ArrayList<String>();

        void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
        }

        @Override
        public Fragment getItem(int position){
        return mFragmentList.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
        }

        @Override
        public int getCount() {
        return mFragmentList.size();
        }

        }