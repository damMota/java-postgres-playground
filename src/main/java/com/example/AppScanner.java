package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class AppScanner {
    
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Disigite o neme: ");
        cliente.setNome(scanner.nextLine());

        System.out.println("Disigite o cpf: ");
        cliente.setCpf(scanner.nextLine());

        System.out.println("Disigite a cidade: ");
        cliente.setCidade(scanner.nextLine());

        System.out.println("Disigite a renda: ");
        cliente.setRenda(scanner.nextDouble());

        System.out.println("Disigite o ano nascimento: ");
        cliente.setAnoNascimento(scanner.nextInt());

        scanner.nextLine(); //necessário quando anteriormente não pega uma string e vai entrar com uma agora

        System.out.println("Disigite o sexo (F ou M): ");
        String sexoStr = scanner.nextLine();
        char sexo_ = sexoStr.charAt(0);

        cliente.setSexo(sexo_ == 'M' ? Sexo.Masculino : Sexo.Femenino);
        
        
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Especial: " + cliente.isEspecial());

       // scanner.Al
    }
}
