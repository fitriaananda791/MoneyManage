package com.example.moneymanage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Day_2  extends Fragment {

    //Constructor default
    public Day_2(){};

    @Nullable
    public View OnCreateView (LayoutInflater inflanter, ViewGroup container, Bundle savedInstanceState){
        View day2 = inflanter.inflate(R.layout.day2,container,false);

        return day2;
    }
}

