package com.example.amodate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.amodate.adapter.ViewPagerAdapter;
import com.example.amodate.fragment.SignInFragment;
import com.example.amodate.fragment.SignUpFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private TabLayout mTabs;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager=findViewById(R.id.viewPager);
        mTabs=findViewById(R.id.tabLayout);

        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SignInFragment(),"Sign In");
        adapter.addFragment(new SignUpFragment(),"Sign Up");
        mViewPager.setAdapter(adapter);
        mTabs.setupWithViewPager(mViewPager);







    }
}