package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoFinalizar;
    private Button botaoAbrirOutraTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoAbrirOutraTela=findViewById(R.id.bntAbrirOutraTela);
        botaoFinalizar=findViewById(R.id.bntFinalizar);

        botaoFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

        botaoAbrirOutraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent outraTela=new Intent(MainActivity.this, OutraTela.class);
                startActivity(outraTela);

            }
        });

    }
}