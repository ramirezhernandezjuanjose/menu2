package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class multiplicar extends AppCompatActivity {
    private TextView tv3 ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar2);
        tv3 =(TextView)findViewById(R.id.tv3);
        String dato= getIntent().getStringExtra("datomulti");
        tv3.setText("el resultado de la multiplicacion es"+ dato);
    }
    public void Regresar(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);


    }
}