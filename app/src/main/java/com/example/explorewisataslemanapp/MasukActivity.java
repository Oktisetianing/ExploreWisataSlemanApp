package com.example.explorewisataslemanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MasukActivity extends AppCompatActivity {
    private Handler handler= new Handler();
    private SharePrevManager sharePrevManager;
    private EditText etusername, etpassword;
    private Button btnmasuk;
    private ProgressBar pbLogin;
    private ImageView ivlogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);

        sharePrevManager = new SharePrevManager(this);
        if(sharePrevManager.getIsLogin()){
            //kondisi jika user sudah log in
            startHomeUI();
        } else {
            //kondisi jika user belum login
            etusername = findViewById(R.id.etusername);
            etpassword = findViewById(R.id.etpassword);
            btnmasuk = findViewById(R.id.btnMasuk);
            pbLogin = findViewById(R.id.pblogin);
            ivlogo= findViewById(R.id.ivlogo);

            masuk();
        }
    }

    private void startHomeUI() {
        Intent i = new Intent(MasukActivity.this,
                BerandaActivity.class);

        startActivity(i);
        finishAffinity();
    }
    public void masuk(){
        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil value dari edit text
                final String username = etusername.getText().toString();
                final String password = etpassword.getText().toString();

                pbLogin.setVisibility(View.VISIBLE);
                ivlogo.setVisibility(View.GONE);

                if (username.isEmpty() || password.isEmpty()){
                    pbLogin.setVisibility(View.GONE);
                    ivlogo.setVisibility(View.VISIBLE);
                    Toast.makeText(MasukActivity.this,
                            "Username dan password tidak boleh kosong",
                            Toast.LENGTH_LONG).show();
                } else {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            String SpUsername = sharePrevManager.getUsername();
                            String SpPassword = sharePrevManager.getPassword();

                            Log.d("username","user"+username);
                            Log.d("password","password"+password);
                            if (username.equals(SpUsername) && password.equals(SpPassword)){
                                Intent i = new Intent(
                                        MasukActivity.this,
                                        BerandaActivity.class);
                                sharePrevManager.saveIsLogin(true);
                                startActivity(i);
                            } else {
                                pbLogin.setVisibility(View.GONE);
                                ivlogo.setVisibility(View.VISIBLE);
                                Toast.makeText(
                                        MasukActivity.this,
                                        "Username dan Password benar",
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                    }, 3000);
                }
            }
        });
    }

}