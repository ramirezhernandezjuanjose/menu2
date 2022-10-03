package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class restar extends AppCompatActivity {
    private TextView tv2 ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);
        setContentView(R.layout.activity_multiplicar2);
        tv2 =(TextView)findViewById(R.id.tv3);
        String dato= getIntent().getStringExtra("datoresta");
        tv2.setText("el resultado de la resta es"+ dato);
    }
    public void REGRESAR(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);


    }
}