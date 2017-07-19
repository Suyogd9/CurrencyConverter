package com.suyog.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 public void dollar(View view){
     EditText rupeesdollar=(EditText) findViewById(R.id.Rupeesdollar);
     Double rupees=Double.parseDouble(rupeesdollar.getText().toString());
     Double dollars=rupees/64.39;
     Log.i("amount",rupeesdollar.getText().toString());
     Toast.makeText(this, "$"+ String.format("%.2f",dollars), Toast.LENGTH_SHORT).show();
 }
    public void euros(View view){
        EditText rupeeseuros=(EditText) findViewById(R.id.RupeesEuros);
        Double rupees=Double.parseDouble(rupeeseuros.getText().toString());
        Double euro=rupees/72.09;
        Log.i("amount",rupeeseuros.getText().toString());
        Toast.makeText(this, "euros"+ String.format("%.2f",euro), Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
