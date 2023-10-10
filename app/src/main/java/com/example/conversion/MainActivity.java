package com.example.conversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.conversion.Models.Celcius;
import com.example.conversion.Models.Fahreinheit;
import com.example.conversion.Models.Kelvin;

public class MainActivity extends AppCompatActivity {

    //VARIABLES CELSIUS
    private EditText editTextCelsius;
    private Button buttonConvertCelsius;
    private TextView textViewResultCelsiusToFahrenheit;
    private TextView textViewResultCelsiusToKelvin;

    //VARIABLES KELVIN
    private EditText gradosKelvin;
    private Button buttonConvertKelvins;
    private TextView KelvinToFahrenheit;
    private TextView KelvinToCelsius;

    //VARIABLES FAHRENHEIT
    private EditText gradosFahrenheit;
    private Button buttonConvertFahrenheit;
    private TextView FahrenheitToKelvin;
    private TextView FahrenheitToCelsius;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //celcius parte 1
        editTextCelsius = findViewById(R.id.editTextCelsius);
        buttonConvertCelsius = findViewById(R.id.buttonConvertCelsius);
        textViewResultCelsiusToFahrenheit = findViewById(R.id.textViewResultCelsiusToFahrenheit);
        textViewResultCelsiusToKelvin = findViewById(R.id.textViewResultCelsiusToKelvin);

        //kelvin parte 1
        gradosKelvin = findViewById(R.id.gradosKelvin);
        buttonConvertKelvins = findViewById(R.id.buttonConvertKelvins);
        KelvinToFahrenheit = findViewById(R.id.KelvinToFahrenheit);
        KelvinToCelsius = findViewById(R.id.KelvinToCelsius);

        //fahrenheit
        gradosFahrenheit = findViewById(R.id.gradosFahrenheit);
        buttonConvertFahrenheit = findViewById(R.id.buttonConvertFahrenheit);
        FahrenheitToKelvin = findViewById(R.id.FahrenheitToKelvin);
        FahrenheitToCelsius = findViewById(R.id.FahrenheitToCelsius);

        buttonConvertCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertCelsius();
            }
        });

        buttonConvertKelvins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertirKelvins();
            }
        });

        buttonConvertFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertirFahrenheit();
            }
        });

    }

    private void convertCelsius()
    {
        // Obtener el valor ingresado en Celsius
        double celsiusValue = Double.parseDouble(editTextCelsius.getText().toString());

        // Crear una instancia de Celsius
        Celcius c = new Celcius();
        c.setValor(celsiusValue);

        // Realizar las conversiones
        Fahreinheit fhr = new Fahreinheit().parse(c);
        Kelvin kel = new Kelvin().parse(c);

        // Mostrar los resultados en las TextViews
        textViewResultCelsiusToFahrenheit.setText("Fahrenheit: " + fhr.getValor());
        textViewResultCelsiusToKelvin.setText("Kelvin: " + kel.getValor());
    }

    private void convertirKelvins()
    {
        // Obtener el valor ingresado en Celsius
        double kelvinsValue = Double.parseDouble(gradosKelvin.getText().toString());

        // Crear una instancia de Celsius
        Kelvin k = new Kelvin();
        k.setValor(kelvinsValue);

        // Realizar las conversiones
        Fahreinheit fhr = new Fahreinheit().parse(k);
        Celcius cel = new Celcius().parse(k);

        // Mostrar los resultados en las TextViews
        KelvinToFahrenheit.setText("Fahrenheit: " + fhr.getValor());
        KelvinToCelsius.setText("Celsius: " + cel.getValor());
    }

    private void convertirFahrenheit()
    {

        // Obtener el valor ingresado en Celsius
        double fahrenheitValue = Double.parseDouble(gradosFahrenheit.getText().toString());

        // Crear una instancia de Celsius
        Fahreinheit f = new Fahreinheit();
        f.setValor(fahrenheitValue);

        // Realizar las conversiones
        Kelvin kel = new Kelvin().parse(f);
        Celcius cel = new Celcius().parse(f);

        // Mostrar los resultados en las TextViews
        FahrenheitToKelvin.setText("Kelvin: " + kel.getValor());
        FahrenheitToCelsius.setText("Celsius: " + cel.getValor());
    }
}