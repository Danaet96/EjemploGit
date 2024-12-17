package com.leslie.ejerciciosgit;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

   public EditText nombre,apellido;
   public TextView ress;
   public Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // :) :0
         nombre=findViewById(R.id.tv1);
         apellido=findViewById(R.id.tv2);
         ress=findViewById(R.id.tvres);
         boton=findViewById(R.id.btnSaludar);


//Esto es una prueba de commit sin push
        boton.setOnClickListener(v->{

            ress.setText("Hola "+nombre.getText()+" "+apellido.getText()+" Es un gusto!");

        });

    }
}

