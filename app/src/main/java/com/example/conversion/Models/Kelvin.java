package com.example.conversion.Models;

public class Kelvin extends Grados {

    public Kelvin parse(Fahreinheit F)
    {
        Kelvin K = new Kelvin();
        K.setValor((F.getValor()-32)*5/9+273.15);
        return K;
    }

    public Kelvin parse(Celcius C)
    {
        Kelvin K = new Kelvin();
        K.setValor((C.getValor()+273.15));
        return K;
    }


}
