package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultado = findViewById(R.id.textViewResult);
        ImageView imageView = findViewById(R.id.imageView2);

        Intent intent = getIntent();
        String resultadoImc = intent.getStringExtra("result");
        resultado.setText(resultadoImc);
        double total = Double.parseDouble(resultadoImc);

        if (total < 17) {
            imageView.setImageResource(R.drawable.imc1);
        } else if (total > 17 && total < 18.49) {
            imageView.setImageResource(R.drawable.imc2);
        } else if (total > 18.50 && total < 24.99) {
            imageView.setImageResource(R.drawable.imc3);
        } else if (total > 25 && total < 29.99) {
            imageView.setImageResource(R.drawable.imc4);
        } else if(total > 30 && total < 34.99){
            imageView.setImageResource(R.drawable.imc5);
        } else if(total > 35 && total < 39.99){
            imageView.setImageResource(R.drawable.imc6);
        } else{
            imageView.setImageResource(R.drawable.imc7);
        }
    }
}