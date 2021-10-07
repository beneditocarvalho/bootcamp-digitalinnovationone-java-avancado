package Aula2;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio = String::isEmpty; //this method reference

        //or this Predicate<String> estaVazio = text -> text.isEmpty();

        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Benedito"));
        System.out.println(estaVazio.test("Carvalho"));
    }
}