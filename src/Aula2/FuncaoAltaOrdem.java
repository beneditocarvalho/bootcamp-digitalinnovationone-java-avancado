package Aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA =  ( a, b) -> a+b;
        Calculo SUBTRACAO =  ( a, b) -> a-b;
        Calculo MULT =  ( a, b) -> a*b;
        Calculo DIVISAO =  ( a, b) -> a/b;

        System.out.println(executarOperacao(SOMA,2,3));//5
        System.out.println(executarOperacao(SUBTRACAO,10,3));//7
        System.out.println(executarOperacao(MULT,8,3));//24
        System.out.println(executarOperacao(DIVISAO,100,3));//33
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}

@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}

//POR PARAMETRO RECEBE OUTRA FUNÇÃO
//OU QUE ELA RETORNA UMA FUNÇÃO