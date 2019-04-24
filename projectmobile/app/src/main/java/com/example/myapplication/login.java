package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class login extends AppCompatActivity {

    @BindView(R.id.edNpm)
    EditText edNpm;
    @BindView(R.id.edPw)
    EditText edPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin)
    void btnLogin(){
        String strNpm, strPw;

        strNpm = edNpm.getText().toString();
        strPw = edPw.getText().toString();

        if(strNpm.isEmpty() && strPw.isEmpty()){
            Toast.makeText(getApplicationContext(),
                    "Lengkapi Data", Toast.LENGTH_LONG).show();
        }else {
            Intent a = new Intent(login.this, menu.class);
            a.putExtra("npm", strNpm);
            a.putExtra("nama", strPw);
            startActivity(a);
            finish();
        }
    }

}
