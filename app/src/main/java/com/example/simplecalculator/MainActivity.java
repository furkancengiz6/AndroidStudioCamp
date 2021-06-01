package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText edit1Text;
    EditText edit2Text;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1Text= findViewById(R.id.edit1Text);
        edit2Text=findViewById(R.id.edit2Text);
        resultText = findViewById(R.id.resultText);
    }

    public void total(View view){
        if(edit1Text.getText().toString().matches("" )|| edit2Text.getText().toString().matches("")){
            Toast.makeText(getApplicationContext(),"Enter number!!",Toast.LENGTH_LONG).show();
        }else{
            double edit1= Double.parseDouble(edit1Text.getText().toString());
            double edit2= Double.parseDouble(edit1Text.getText().toString());

            double result = edit1+edit2;
            resultText.setText("Toplamı = "+result);
        }



    }
    public void impact(View view){
        if(edit1Text.getText().toString().matches("" )|| edit2Text.getText().toString().matches("")){
            Toast.makeText(getApplicationContext(),"Enter number!!",Toast.LENGTH_LONG).show();
        }else{
            double edit1= Double.parseDouble(edit1Text.getText().toString());
            double edit2= Double.parseDouble(edit1Text.getText().toString());

            double result = edit1*edit2;
            resultText.setText("Carpımı = "+result);
        }

    }
    public void chamber(View view){
        if(edit1Text.getText().toString().matches("" )|| edit2Text.getText().toString().matches("")){
            Toast.makeText(getApplicationContext(),"Enter number!!",Toast.LENGTH_LONG).show();
        }else{
            double edit1= Double.parseDouble(edit1Text.getText().toString());
            double edit2= Double.parseDouble(edit1Text.getText().toString());

            double result = edit1/edit2;
            resultText.setText("Bolum = "+result);
        }


    }

    public void sour(View view){
        if(edit1Text.getText().toString().matches("" )|| edit2Text.getText().toString().matches("")){
            Toast.makeText(getApplicationContext(),"Enter number!!",Toast.LENGTH_LONG).show();
        }else{
            double edit1= Double.parseDouble(edit1Text.getText().toString());
            double edit2= Double.parseDouble(edit1Text.getText().toString());

            double result = edit1-edit2;
            resultText.setText("Cıkan = "+result);
        }


    }

    public void rectangle(View view){
        if(edit1Text.getText().toString().matches("" )|| edit2Text.getText().toString().matches("")){
            Toast.makeText(getApplicationContext(),"Enter number!!",Toast.LENGTH_LONG).show();
        }else{
            double edit1= Double.parseDouble(edit1Text.getText().toString());
            double edit2= Double.parseDouble(edit1Text.getText().toString());

            double result = 2*(edit1+edit2);
            resultText.setText("Dikdortgen Cevresi="+result);
        }
    }

}