package com.example;

import java.util.Arrays;

import com.example.model.Cliente;
import com.example.model.Sexo;


public class AppClasses {
    
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente();
        cliente.setSexo(Sexo.Femenino);
        cliente.setRenda(-10000);
        cliente.setAnoNascimento(1980);
        cliente.setNome("    Alessandro    ");
        cliente.setNome("     ");
        cliente.setCpf("999999999");
        cliente.setCidade("FRANCA");
        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Especial: " + cliente.isEspecial());

        Cliente cliente2 = new Cliente(-1000,Sexo.Masculino);
        cliente2.setNome("Manoel Campos");
        cliente2.setCidade("Franca");

        if(cliente.getCidade().equalsIgnoreCase(cliente2.getCidade())){
            System.out.println("Moram mesma cidade");
        }else
            System.out.println("Mora cidades diferentes");

        String vetorNome[] = cliente2.getNome().split(" ");
        System.out.println(Arrays.toString(vetorNome));
        
        System.out.println("Primeiro caracter no nome: " + cliente2.getNome().charAt(0));

        cliente2.setCpf("999999999");
        cliente2.setCpf(new String("999999999")); //força cpf estar em posição de memoria distanta da anterior
        System.out.println("Nome cliente2: " + cliente2.getNome());
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Especial: " + cliente2.isEspecial());

        if(cliente.getCpf().equals(cliente2.getCpf()))
            System.out.println("Cpf repetido");
        else
            System.out.println("Cpf ok");
    }

}
