package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private EditText et1,et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 =(EditText)findViewById(R.id.editTextNumber5) ;
        et2 =(EditText)findViewById(R.id.editTextNumber6) ;
        spinner1 = (Spinner)findViewById(R.id.spinner) ;



        String [] opciones = {"Sumar","Restar","Multiplicar"};

        ArrayAdapter <String>  adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones);
        spinner1.setAdapter(adapter);


    }
    //metodo del boton
    public void calcular(View view)
    {
     String valor1_Strign = et1.getText().toString();
        String valor2_Strign = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_Strign);
        int valor2_int = Integer.parseInt(valor2_Strign);


        String seleccion = spinner1.getSelectedItem().toString();
        if (seleccion.equals("Sumar")){
            int suma = (valor1_int + valor2_int);
            String resultado =String.valueOf(suma);
            Intent i = new Intent(this,sumar.class);
            i.putExtra("datosuma",resultado);
            startActivity(i);

        }else if (seleccion.equals("Restar")){
            int resta = (valor1_int - valor2_int);
            String resultado =String.valueOf(resta);
            Intent i = new Intent(this,restar.class);
            i.putExtra("datoresta",resultado);
            startActivity(i);

        }else if (seleccion.equals("Multiplicar")){
        int multi = (valor1_int * valor2_int);
        String resultado =String.valueOf(multi);
            Intent i = new Intent(this,multiplicar.class);
            i.putExtra("datomulti",resultado);
            startActivity(i);

        }

    }
}