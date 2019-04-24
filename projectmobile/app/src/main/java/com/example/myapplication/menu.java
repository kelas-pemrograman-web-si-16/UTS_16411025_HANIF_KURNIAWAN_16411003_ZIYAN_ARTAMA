package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import butterknife.OnClick;
import butterknife.ButterKnife;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnraport)
    void btnabsen(){;
        Intent a = new Intent(menu.this, raport.class);
        startActivity(a);
        finish();
    }

    @OnClick(R.id.btnlogout)
    void btnlogout(){;
        Intent a = new Intent(menu.this, login.class);
        startActivity(a);
        finish();
    }
}

