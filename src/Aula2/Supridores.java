package Aula2;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        //this
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        //or this method reference
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;

        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;
    private String otherProperty;

    public Pessoa() {
        nome = "Benedito";
        idade = 43;
        otherProperty = "Java Jr Developer";
    }

    @Override
    public String toString() {
        return String.format("nome : %s, idade: %d, Other Property: %s",nome,idade, otherProperty) ;
    }

}