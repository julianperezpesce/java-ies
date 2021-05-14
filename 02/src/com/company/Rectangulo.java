package com.company;

public class Rectangulo extends Figura{

    public Rectangulo() {
        super();
    }

    public float calcular(){
        return (this.getBase() * this.getAltura());
    }
}
