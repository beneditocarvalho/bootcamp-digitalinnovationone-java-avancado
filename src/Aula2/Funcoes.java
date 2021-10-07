package Aula2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String,String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converterStringParaInteiroECalcularODobro = string -> Integer.valueOf(string) * 2;

        System.out.println(retornarNomeAoContrario.apply("Benedito"));
        System.out.println(converterStringParaInteiroECalcularODobro.apply("21"));

        //Exemplo usando 2 parâmetros no lambda
        BiFunction<String, Integer, String> retornaNomeIdade = (nome, idade) -> new StringBuilder(nome).append("-" + idade).toString();
        System.out.println(retornaNomeIdade.apply("Benedito José de Carvalho Nunes", 1978));
    }
}