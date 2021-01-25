package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNumero1This, etNumero2This, etResultadoThis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero1This = (EditText)findViewById(R.id.etNumero1);
        etNumero2This = (EditText)findViewById(R.id.etNumero2);
        etResultadoThis = (EditText)findViewById(R.id.etResultado);
    }

    public void suma(View view)
    {
        int numero1, numero2;

        numero1 = Integer.parseInt(etNumero1This.getText().toString());
        numero2 = Integer.parseInt(etNumero2This.getText().toString());
        int resultado = numero1 + numero2;
        etResultadoThis.setText(String.valueOf(resultado));
    }

    public void resta(View view)
    {
        int numero1, numero2;

        numero1 = Integer.parseInt(etNumero1This.getText().toString());
        numero2 = Integer.parseInt(etNumero2This.getText().toString());
        int resultado = numero1 - numero2;
        etResultadoThis.setText(String.valueOf(resultado));
    }

    public void multiplicacion(View view)
    {
        int numero1, numero2;

        numero1 = Integer.parseInt(etNumero1This.getText().toString());
        numero2 = Integer.parseInt(etNumero2This.getText().toString());
        int resultado = numero1 * numero2;
        etResultadoThis.setText(String.valueOf(resultado));
    }

    public void division(View view)
    {
        int numero1, numero2;

        numero1 = Integer.parseInt(etNumero1This.getText().toString());
        numero2 = Integer.parseInt(etNumero2This.getText().toString());
        float resultado = numero1 / numero2;
        etResultadoThis.setText(String.valueOf(resultado));
    }
}