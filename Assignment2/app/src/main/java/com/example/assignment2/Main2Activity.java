package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;

import com.google.android.material.tabs.TabLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setTitle("15L-4245");

        SectionsPageAdapter sectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabs = findViewById(R.id.tabs);
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());

        adapter.addFragment(new OneFragment(),"Relative");
        adapter.addFragment(new TwoFragment(),"Const");
        adapter.addFragment(new ThreeFragment(),"Frame");
        adapter.addFragment(new FourFragment(),"Linear");

        viewPager.setAdapter(adapter);

        tabs.setupWithViewPager(viewPager);

        tabs.getTabAt(0).setIcon(R.drawable.ic_favorite_black_24dp);
        tabs.getTabAt(1).setIcon(R.drawable.ic_call_white);
        tabs.getTabAt(2).setIcon(R.drawable.ic_group_black_24dp);
        tabs.getTabAt(3).setIcon(R.drawable.ic_airplanemode_active_black_24dp);

    }
}
