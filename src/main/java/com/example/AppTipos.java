package com.example;
import java.util.Arrays;
import java.util.List;
public class AppTipos {
    public enum EstacoesDoAno{
        PRIMAVERA,
        VERAO,
        OUTONO,
        INVERNO
    }
    public enum sexo{
        M(1,"masculino"),
        F(2,"feminino");
        
        private final int valor;
        private final String descricao;
 
        sexo(int valor, String descricao) {
            this.valor = valor;
            this.descricao = descricao;
        }
 
        public int getValor() {
            return this.valor;
        }
        public String getDescricao() {
            return this.descricao;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello my friends");
        byte idade = (byte)10.1;
        int pesoInt = 85;
        double peso = pesoInt;
        //erro de estouro
        int nota = 2000;
        byte notaB = (byte) nota;
        System.out.println("Idade: " + idade + " Peso: " + peso + " estouro: " + notaB);
        for(EstacoesDoAno estacao:EstacoesDoAno.values()){
               System.out.println(estacao); 
        }
        int[] mat = {1,2,3,4};
        for(int value : mat){
            System.out.println(value);
        }
        List<Integer> itens = Arrays.asList( 11, 10, 16, 5, 85 );
        itens.forEach(val -> System.out.println(val));
        itens.forEach(System.out::println);
        
        char sexo = 'm';
        var aprovado = true; //variavel local que o compilador descobre - a partir da versao 10 java (variavel local apenas)
        //aprovado=110; //Não permite reatribuir como no javascript
        System.out.println("Tipo atribuido dinamicamente. Resultado: " + aprovado);

        

    }
}
