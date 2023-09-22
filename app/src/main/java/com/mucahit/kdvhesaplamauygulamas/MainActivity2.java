package com.mucahit.kdvhesaplamauygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText editTextNumber1;
    EditText editTextNumber2;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextNumber1=findViewById(R.id.editTextNumber1);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        textView4=findViewById(R.id.textView4);

    }
    public void hesapla(View view){
        int kdvlifiyat = Integer.parseInt(editTextNumber1.getText().toString());
        int kdv = Integer.parseInt(editTextNumber2.getText().toString());
        int kdvsizfiyat = ((kdvlifiyat*100)/(kdv+100));
        textView4.setText("Sonuç:" + kdvsizfiyat);
    }


    public void sayfa2gecis(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity2.class);
        startActivity(intent);
    }

    public void sayfa1gecis(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}