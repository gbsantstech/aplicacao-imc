package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        botao = findViewById(R.id.botao);

        botao.setOnClickListener(v ->{
            String valorPeso = editPeso.getText().toString();
            String valorAltura = editAltura.getText().toString();

            float total = Float.parseFloat(valorPeso)/(Float.parseFloat(valorAltura) * Float.parseFloat(valorAltura));
            String resultadoImc = String.valueOf(total);

            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", resultadoImc);
            startActivity(intent);
            finish();
        });

    }


}