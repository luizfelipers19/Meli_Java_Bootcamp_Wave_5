package com.company;

// Exercício 1

public class Pessoa {
    private String nome;
    private Integer idade;
    private String id;
    private float peso;
    private float altura;


// Exercício 2

    public Pessoa() {

    }

    public Pessoa(String nome, Integer idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, Integer idade, String id, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }
}