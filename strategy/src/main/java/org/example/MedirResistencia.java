package org.example;

public class MedirResistencia implements Medicao {

    public float medir(float tensao, float corrente) {
        if (corrente == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
        else {
            return tensao / corrente;
        }
    }
}
