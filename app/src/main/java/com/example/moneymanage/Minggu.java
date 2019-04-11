package com.example.moneymanage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Minggu<TabLayout> extends AppCompatActivity {


    ViewPager MyPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minggu);


        MyPage =(ViewPager)findViewById(R.id.MyPage);
        SetUpViewPager(MyPage);

    }

    public void SetUpViewPager (ViewPager viewPager){
        MyViewAdapter Adapter = new MyViewAdapter(getSupportFragmentManager());

        Adapter.AddFragmentPage(new Day_1(),"Day 1");
        Adapter.AddFragmentPage(new Day_2(),"Day 2");
        Adapter.AddFragmentPage(new Day_3(),"Day 3");
        Adapter.AddFragmentPage(new Day_4(),"Day 4");
        Adapter.AddFragmentPage(new Day_5(),"Day 5");
        Adapter.AddFragmentPage(new Day_6(),"Day 6");
        Adapter.AddFragmentPage(new Day_7(),"Day 7");
        //We Need Fragment class now

        viewPager.setAdapter(Adapter);
    }

    public static class MyViewAdapter extends FragmentPagerAdapter implements com.example.moneymanage.MyViewAdapter {
        private List <Fragment> MyFragment = new ArrayList<>();
        private List <String> MyPagerTittle = new ArrayList<>();

        public MyViewAdapter (FragmentManager manager){
            super(manager);
        }

        @Override
        public void AddFragmentPage(Fragment Frag, String Tittle){
            MyFragment.add(Frag);
            MyPagerTittle.add(Tittle);
        }

        @Override
        public Fragment getItem(int position) {
            return MyFragment.get(position);
        }

        @Override
        public CharSequence getPageTittle(int position) {
            return MyPagerTittle.get(position);
        }



        @Override
        public int getCount() {
            return 3;

        }
    }
}
