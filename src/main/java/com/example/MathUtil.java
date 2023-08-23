package com.example;

public class MathUtil {
    static int mdc(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        
        int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //P1
        if(b > 0 && a % b == 0)
            return b;
        
        if(b==0)
            return Math.abs(a);
        
        return mdc(a-b,b);
        //throw new UnsupportedOperationException("Não é possível calcular MDC");
    }

    static int mdc(int ...valores){
        if(valores == null){
            throw new NullPointerException("É necessário passar um valor diferente de nulo");
        }
        if(valores.length == 0){
            throw new IllegalArgumentException("É necessário ao menos um valor para calcular mdc");
        }
        int a = valores[0];
        for (int b : valores){
            a=mdc(a,b);
        }

 //       for(int i=1;i<valores.length;i++){
 //           a = mdc(a,valores[i]);
  //      }
        return a;
    }
}
