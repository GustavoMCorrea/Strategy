package org.example;

public class Eletricista {

    private float valor;

    public float getNota() {
        return valor;
    }

    public void calcularTensao(float resistencia, float corrente) {
        Multimetro multimetro = new Multimetro(resistencia, corrente);
        this.valor = multimetro.calcular(new MedirVolts());
    }

    public void calcularResistencia(float tensao, float corrente) {
        Multimetro multimetro = new Multimetro(tensao, corrente);
        this.valor = multimetro.calcular(new MedirResistencia());
    }

    public void calcularCorrente(float tensao, float resistencia) {
        Multimetro multimetro = new Multimetro(tensao, resistencia);
        this.valor = multimetro.calcular(new MedirCorrente());
    }

}
