package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityOutraOutraPagBinding;


import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityOutraTelaBinding;

    public class OutraOutraPag extends AppCompatActivity {


        private EditText editIdade;
        private TextView textResultado;

        private Button botaoVoltar;



        @SuppressLint("MissingInflatedId")

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_outra_outra_pag);

            setTitle("Outra tela solicitada");

            botaoVoltar=findViewById(R.id.bntVoltar);

            botaoVoltar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

            editIdade = findViewById(R.id.editIdade);
            textResultado = findViewById(R.id.textResultado);

        }

        public void cacularIdade(View view) {

            int idade = Integer.parseInt(editIdade.getText().toString());

            int resultado =  idade*7;

            textResultado.setText("idade igual a: "+resultado+" anos");

        }

    }
