package com.company;

public class Figura {
    public Float altura;
    public Float base;
    private Float superficie;

    public Figura(Float altura, Float base, Float superficie) {
        this.altura = altura;
        this.base = base;
        this.superficie = superficie;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Float superficie) {
        this.superficie = superficie;
    }
}
