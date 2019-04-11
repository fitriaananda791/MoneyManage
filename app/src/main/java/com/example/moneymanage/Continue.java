package com.example.moneymanage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Continue extends Activity {
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.txtDaftar)
    TextView txtDaftar;
    @BindView(R.id.login)
    RelativeLayout login;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lanjut);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.button, R.id.txtDaftar})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent login = new Intent(this, LoginActivity.class);
                startActivity(login);
                break;
            case R.id.txtDaftar:
                Intent daftar =  new Intent(this, DaftarActivity.class);
                startActivity(daftar);
                break;
        }
    }
}
