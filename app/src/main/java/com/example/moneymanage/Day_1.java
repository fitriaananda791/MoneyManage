package com.example.moneymanage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Day_1 extends Fragment {

    //Constructor default
     public Day_1(){};

        @Nullable
        public View OnCreateView (LayoutInflater inflanter, ViewGroup container, Bundle savedInstanceState){
           View day1 = inflanter.inflate(R.layout.day1,container,false);

           return day1;
        }
}

