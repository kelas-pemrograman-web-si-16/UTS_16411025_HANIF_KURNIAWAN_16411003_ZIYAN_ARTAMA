package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import butterknife.OnClick;
import butterknife.ButterKnife;

public class raport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raport);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnkembali)
    void btnkembali(){;
        Intent a = new Intent(raport.this, menu.class);
        startActivity(a);
        finish();
    }
}
