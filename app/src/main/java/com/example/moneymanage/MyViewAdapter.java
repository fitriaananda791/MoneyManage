package com.example.moneymanage;

import android.support.v4.app.Fragment;

interface MyViewAdapter {
    void AddFragmentPage (Fragment Frag, String Tittle);

    Fragment getItem(int position);

    CharSequence getPageTittle(int position);

    int getCount();
}
