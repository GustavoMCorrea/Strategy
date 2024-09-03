package org.example;

public class MedirVolts implements Medicao{
    @Override
    public float medir(float resistencia, float corrente) {
        return resistencia*corrente;
    }
}
