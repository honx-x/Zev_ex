package com.example.zev_ex;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Zev_Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zev_splash);

        Handler hd = new Handler();
        hd.postDelayed(new splashhandler(),3000);

    }

    private class splashhandler implements Runnable {
        public void run(){
            startActivity(new Intent(getApplication(), Zev_Login.class));

        }
    }

    @Override
    public void onBackPressed() {

    }
}