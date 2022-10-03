package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class sumar extends AppCompatActivity {
     private TextView tv1 ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);
        tv1 =(TextView)findViewById(R.id.tv1);
        String dato= getIntent().getStringExtra("datosuma");
        tv1.setText("el resultado de la suma es"+ dato);
    }
    public void REGRESAR(View view){
Intent i = new Intent(this,MainActivity.class);
startActivity(i);


    }
}