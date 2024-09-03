package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EletricistaTest {

    @Test
    void calcularTensao() {
        Eletricista eletricista = new Eletricista();
        eletricista.calcularTensao(100.0f, 2.0f);
        assertEquals(200.0f, eletricista.getNota());
    }

    @Test
    void calcularResistencia() {
        Eletricista eletricista = new Eletricista();
        eletricista.calcularResistencia(100.0f, 2.0f);
        assertEquals(50.0f, eletricista.getNota());
    }

    @Test
    void calcularCorrente() {
        Eletricista eletricista = new Eletricista();
        eletricista.calcularCorrente(100.0f, 2.0f);
        assertEquals(50.0f, eletricista.getNota());
    }

    @Test
    void naoDevecalcularCorrente() {
        try {
            Eletricista aluno = new Eletricista();
            aluno.calcularCorrente(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void naoDevecalcularResistencia() {
        try {
            Eletricista aluno = new Eletricista();
            aluno.calcularResistencia(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

}