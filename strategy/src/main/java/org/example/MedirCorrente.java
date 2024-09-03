package org.example;

public class MedirCorrente implements Medicao{

    public float medir(float tensao, float resistencia) {
        if (resistencia == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
        else {
            return tensao / resistencia;
        }
    }
}
