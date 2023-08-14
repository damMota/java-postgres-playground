package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        double vetor[] = {1.3,30,50};
        int vetorInt[] = {1,2,3};
        //vetor=vetorInt; //não consegue converter vetor int para double como acontece nos tipos primitivos
        //System.out.println(Arrays.toString(vetor));
        vetor[0]=2;
        //System.out.println("Posicao 0: " + vetor[0]);
        for(double item:vetor){
            //System.out.println("item: " + item);
        }
        int vetor3[] = new int[5];
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i]=100*(i+1);
        }
        //System.out.println(Arrays.toString(vetor3));
        double matriz[][] = {{10,20,30},{40,50,60}};
        matriz[0][1]=50;
        //matriz[0]={1,2,3}; não funciona como na inicialização
        //tem que instanciar novo vetor
        matriz[0] = new double[]{1,2};//não precisa ser linhas de mesmo tamnho
        //System.out.println(Arrays.toString(matriz[0]));
        //System.out.println(Arrays.toString(matriz[1]));

        double matriz2[][] = new double[3][4];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (i * matriz2[i].length +j + 1)*10; 
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.printf("%5.1f ", matriz2[i][j]);
            }
            System.err.println();
        }

    }
}
