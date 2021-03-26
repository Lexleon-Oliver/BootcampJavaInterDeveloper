package com.teste;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void somar() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5,soma);
    }
}