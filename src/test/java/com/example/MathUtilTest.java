package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static com.example.MathUtil.mdc;

//import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Test;

public class MathUtilTest {
    @Test
    void testMdcP1Impar() {
        int a = 3, b = 3;
        int esperado = 3;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testMdcP1Par() {   
        int a = 6, b = 2;
        int esperado = 2;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testMdcP3Negativo() {
        int a = -6, b = 0;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testMdcP3Positivo() {
        int a = 6, b = 0;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testMdcP5Crescente() {
        int a = 6, b = 2;
        int esperado = MathUtil.mdc(b, a);
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testMdcP5Decrescente() {
        int a = 2, b = 6;
        int esperado = MathUtil.mdc(b, a);
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testMdcP6() {
        int a = 2, b = 6;
        int esperado = MathUtil.mdc(-b, a);
        int obtido = MathUtil.mdc(-a, -b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testMdcP8(){
        int a = 6;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, a);
        assertEquals(esperado,obtido);
    }
    @Test
    void testMdcP8Negativo(){
        int a = -6;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, a);
        assertEquals(esperado,obtido);
    }
    @Test
    void testMdcP12DoisPrimos(){
        int p= 7, a = p;
        int esperado = p;
        int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado,obtido);
    }
    @Test
    void testMdcP12UmPrimos(){
        int p= 7, a = 2;
        int esperado = 1;
        int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado,obtido);
    }
    @Test
    void testMdcP12PrimoEUm(){
        int p= 7, a = 1;
        int esperado = 1;
        int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado,obtido);
    }
    @Test
    void testMdcCasoGeral30e12(){
        int p= 30, a = 12;
        int esperado = 6;
        int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado,obtido);
    }  
    @Test
    void testMdcCasoGeral12e9(){
        int p= 12, a = 9;
        int esperado = 3;
        int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado,obtido);
    }      
    @Test
    void testMdcP4(){
        int m = 2, a= 6, b = 3;
        /* mdc(12,6) = 2*mdc(6,3)
         * 6 = 2*3
         * 
        */
        int esperado = MathUtil.mdc(m*a,m*b);
        int obtido = m*MathUtil.mdc(a, b);
        assertEquals(esperado,obtido);
    }      
    @Test
    void testMdcP9() {
        int a = 6, b = 3, c=2;
        int esperado = 3;
        int obtido = mdc(a, b);
        assertTrue(mdc(a,mdc(b,c)) == mdc(mdc(a,b),c) && mdc(mdc(a,b),c) == mdc(a,b,c));
    }
    @Test
    void testMdc3Valores() {
        int a = 12, b = 6, c=4;
        int esperado = 2;
        int obtido = mdc(a, b, c);
        assertEquals(esperado,obtido);
    }
    @Test
    void testMdcNenhumValor() {
        //var exception = assertThrows(IllegalArgumentException.class, () -> mdc());
        var exception = assertThrows(IllegalArgumentException.class, MathUtil::mdc);

        System.out.println(exception.getMessage());
    }
    @Test
    void testMdcNull() {
       var exception = assertThrows(NullPointerException.class, () -> mdc(null));
       var megEsperado = "É necessário passar um valor diferente de nulo";
       assertEquals(megEsperado,exception.getMessage());
    }

}
