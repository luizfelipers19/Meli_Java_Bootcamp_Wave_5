package com.company;

// Exercício 3
public class Main {

    public static void main(String[] args) {
	// write your code here

        // Exercício 4
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Luiz", 26, "2");
        Pessoa pessoa3 = new Pessoa("Felipe", 26, "2", 76.5, 1.90);

        // won't work, because the constructor differs in length
        // Pessoa pessoaTeste = new Pessoa("Pessoa teste", 27);

        System.out.println(pessoa3.calcularIMC());
    }
}
