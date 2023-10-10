package com.example.conversion.Models;

public class Fahreinheit extends Grados {

    public Fahreinheit parse(Kelvin K)
    {
        Fahreinheit F = new Fahreinheit();
        F.setValor((K.getValor()-273.15)*9/5+32);
        return F;
    }

    public Fahreinheit parse(Celcius C)
    {
        Fahreinheit F = new Fahreinheit();
        F.setValor((C.getValor()*1.8)+32);
        return F;
    }

}
