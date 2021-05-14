package com.company;

public class Triangulo extends Figura{

    public Triangulo(Float altura, Float base, Float superficie) {
        super(altura, base, superficie);
    }

    public float calcularSuperficie () {
        return (this.getBase() * this.getAltura()) / 2;
    }
}
