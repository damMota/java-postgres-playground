package com.example;
 
enum Sexo {
    Masculino,
    Femenino,
}
public class AppClasses {
    
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente();
        cliente.setSexo(Sexo.Femenino);
        cliente.setRenda(10000);
        cliente.setAnoNascimento(1980);

        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Nasc: " + cliente.getAnoNascimento());

    }

}
