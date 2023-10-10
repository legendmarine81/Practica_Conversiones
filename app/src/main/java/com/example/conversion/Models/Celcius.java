package com.example.conversion.Models;

public class Celcius extends Grados {

    public Celcius parse(Fahreinheit F)
    {
        Celcius C = new Celcius();
        C.setValor((F.getValor()*1.8)+32);
        return C;
    }

    public Celcius parse(Kelvin K)
    {
        Celcius C = new Celcius();
        C.setValor((K.getValor()-273.15));
        return C;
    }
}
