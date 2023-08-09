package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        double vetor[] = {1.3,30,50};
        int vetorInt[] = {1,2,3};
        //vetor=vetorInt; //não consegue converter vetor int para double como acontece nos tipos primitivos
        System.out.println(Arrays.toString(vetor));
        vetor[0]=2;
        System.out.println("Posicao 0: " + vetor[0]);
        for(double item:vetor){
            System.out.println("item: " + item);
        }
        int vetor3[] = new int[4];
        vetor3[0]=100;
        vetor3[1]=200;
        vetor3[2]=300;
        vetor3[3]=400;
        System.out.println(Arrays.toString(vetor3));
        double matriz[][] = {{10,20,30},{40,50,60}};
        matriz[0][1]=50;
        //matriz[0]={1,2,3}; não funciona como na inicialização
        //tem que instanciar novo vetor
        matriz[0] = new double[]{1,2};//não precisa ser linhas de mesmo tamnho

        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
        


    }
}
