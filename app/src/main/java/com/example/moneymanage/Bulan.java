package com.example.moneymanage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Bulan <TabLayout> extends AppCompatActivity {

    ViewPager MyPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulan);

        MyPage =(ViewPager)findViewById(R.id.MyPage);
        SetUpViewPager(MyPage);

    }

    public void SetUpViewPager (ViewPager viewPager){
        Minggu.MyViewAdapter Adapter = new Minggu.MyViewAdapter(getSupportFragmentManager());

        Adapter.AddFragmentPage(new Week_1(),"Week 1");
        Adapter.AddFragmentPage(new Week_2(),"Week 2");
        Adapter.AddFragmentPage(new Week_3(),"Week 3");
        Adapter.AddFragmentPage(new Week_4(),"Week 4");
        //We Need Fragment class now

        viewPager.setAdapter(Adapter);
    }

    public class MyViewAdapter extends FragmentPagerAdapter implements com.example.moneymanage.MyViewAdapter {
        private List<Fragment> MyFragment = new ArrayList<>();
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


