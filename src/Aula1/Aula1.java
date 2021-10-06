package Aula1;

public class Aula1{
    public static void main(String[] args) {
            Funcao1 funcao1 = valor -> valor;

        System.out.println(funcao1.gerar("Benedito"));
    }
}

interface Funcao1 {
    String gerar(String valor);
}