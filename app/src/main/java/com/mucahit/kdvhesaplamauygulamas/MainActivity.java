package com.mucahit.kdvhesaplamauygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber1;
    EditText editTextNumber2;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber1=findViewById(R.id.editTextNumber1);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        textView4=findViewById(R.id.textView4);
    }
    public void hesapla(View view){
        Double fiyat = Double.parseDouble(editTextNumber1.getText().toString());
        Double kdv = Double.parseDouble(editTextNumber2.getText().toString());
        Double kdvlifiyat = fiyat * (100 + kdv) / 100;
        textView4.setText("Sonuç:" + kdvlifiyat);
    }
    public void sayfa2gecis(View view){
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sayfa1gecis(View view){
        Intent intent=new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
    }
}