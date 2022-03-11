package com.company;

// Exercício 1

public class Pessoa {
    private String nome;
    private Integer idade;
    private String id;
    private double peso;
    private double altura;


// Exercício 2

    public Pessoa() {

    }

    public Pessoa(String nome, Integer idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, Integer idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }
}
