package com.example.moneymanage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.Minggu)
    Button Minggu;
    @BindView(R.id.Bulan)
    Button Bulan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button, R.id.Minggu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent Bulan = new Intent(this, Bulan.class);
                startActivity(Bulan);
                break;
            case R.id.Minggu:
                Intent Minggu = new Intent(this, Minggu.class);
                startActivity(Minggu);
                break;
        }
    }
}
