package com.example;

class Cliente {
    private double renda;
    private Sexo sexo;
    private int anoNascimento;

    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        if(renda>0)
            this.renda = renda;
        else
            System.out.println("Renda menor que 0");
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
}