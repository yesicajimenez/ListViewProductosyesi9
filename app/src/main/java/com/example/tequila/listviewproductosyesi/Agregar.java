package com.example.tequila.listviewproductosyesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Agregar extends AppCompatActivity {

    private EditText edtxt;
    private Spinner mySpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);


        String categoria[] = {"Electronica","Hogar","Papeleria","Moda","Bebes",
                "Dulceria", "Farmacia", "Perfumeria", "Carnes Frias", "Panaderia"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,categoria);

        edtxt = (EditText) findViewById(R.id.edtxt);
        mySpinner = (Spinner) findViewById(R.id.Myspinner);
        mySpinner.setAdapter(adapter);


    }
    public  void  GuardarDatos(View w){
        Intent i = new Intent();
        i.putExtra("Producto",edtxt.getText().toString());
        i.putExtra("Categoria",mySpinner.getSelectedItem().toString());
        setResult(RESULT_OK,i);
        finish();
    }
}

