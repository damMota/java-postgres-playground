package com.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
        Integer[] mat = {1,2,3,4};
        for(int value : mat){
            System.out.println(value);
        }
        //List<Integer> itens = Arrays.asList( 11, 10, 16, 5, 85 );
        List<Integer> itens = Arrays.asList( mat );
        itens.forEach(val -> System.out.println(val));
        itens.forEach(System.out::println);
        itens.set(1,20);//re´lace
        
        List<Integer> novaLista = itens.stream()
        .filter((obj)->obj>=10)
        .collect(Collectors.toList());

        for(Integer item:novaLista){
            System.out.printf("Filtro: %d",item);
        }
        char sexo = 'm'; //aspas simples
        String sexoStr = "ma scu lino";
        char[] teste = sexoStr.toCharArray();
        String nova = sexoStr.replace(' ','_');
        System.out.println(nova);
        var aprovado = true; //variavel local que o compilador descobre - a partir da versao 10 java (variavel local apenas)
        //aprovado=110; //Não permite reatribuir como no javascript
        System.out.println("Tipo atribuido dinamicamente. Resultado: " + aprovado);

        

    }
}
