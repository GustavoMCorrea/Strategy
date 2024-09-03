package org.example;

public class Multimetro {

    private float valor1;
    private float valor2;

    public Multimetro(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float calcular(Medicao medicao) {
        return medicao.medir(valor1, valor2);
    }

}
