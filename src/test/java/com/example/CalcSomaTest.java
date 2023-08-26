package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcSomaTest {
    
    @Test
    void testaSomaPositiva(){
        CalcSoma soma = new CalcSoma(10,20);
        double esperado = 30;
        double resultado = soma.calculaSoma();
        assertEquals(resultado, esperado);
    }
    @Test
    void testaSomaNegativo(){
        CalcSoma soma = new CalcSoma(-10,20);
        double esperado = 10;
        double resultado = soma.calculaSoma();
        assertEquals(resultado, esperado);
    }
    @Test
    void testaSomaDoisNeg(){
        CalcSoma soma = new CalcSoma(-10, -50);
        double esperado=-60;
        double resultado=soma.calculaSoma();
        assertEquals(resultado, esperado);
    }
}
