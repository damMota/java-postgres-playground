package com.example.model;


public class Cliente {
    String nome;
    String cpf;
    private double renda;
    private Sexo sexo;
    private int anoNascimento;
    private boolean especial;
    private String cidade;
    private boolean jogador;
     
    public Cliente(){ // construtor não volta nada
        super();        
        double aleatorio = Math.random();
        this.especial = (aleatorio >= 0.5) ? true : false;
        System.out.println("Construindo Cliente");
    }
    public Cliente(double renda, Sexo sexo){
        this();
        setRenda(renda);
        this.sexo = sexo;
        //double aleatorio = Math.random();
        //this.especial = (aleatorio >= 0.5) ? true : false;
        System.out.println("Construindo Cliente predefinido");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome.isBlank()){ //veriifca se 
            System.out.println("Nome é obrigatório");
        }else
            this.nome = nome.trim().toUpperCase();
    }
    
    public double getRenda() {
        return renda;
    }
    
    public void setRenda(double renda) {
        if(renda>0)
            this.renda = renda;
        else
            System.out.println("Renda deve ser maior ou igual a 0");
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public boolean isJogador() {
        return jogador;
    }
    public void setJogador(boolean jogador) {
        this.jogador = jogador;
    }

    
}