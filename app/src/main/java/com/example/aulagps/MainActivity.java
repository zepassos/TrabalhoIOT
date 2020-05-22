package com.example.aulagps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarPortugues(View view) {
        setLocale("pt");
    }

    public void mudarIngles(View view) {
        setLocale("en");
    }

    public void mudarEspanhol(View view) {
        setLocale("es");
    }

    private void setLocale(String localeName) {

        Locale locale = new Locale(localeName);
        Locale.setDefault(locale);

        Configuration config = getResources().getConfiguration();
        config.locale = locale;
        getResources().updateConfiguration(config, getResources().getDisplayMetrics());

        Intent intent = new Intent(this, ActivityGPS.class);//Chama a tela
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

}
