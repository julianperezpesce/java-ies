package com.company;

public class Calcular {
    int base;
    int altura;

    public Calcular(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }



    public static void CalcularArea(int base, int altura) {
        int result = base * altura;
        System.out.println("El area es: " + result);
    }
}
