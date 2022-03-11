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

    // Exercício 5
    public int calcularIMC(){
        double imc = peso / Math.pow(peso, 2);
        if(imc < 20){
            return -1;
        }
        else if(20 < imc && imc < 25){
            return 0;
        }
        else {
            return 1;
            }

        }

        //Exercício 6
    public String imcLevel() {
        switch (calcularIMC()){
            case -1:
                return "Abaixo do peso";
            case 0:
                return "Peso saudavel";
            case 1:
                return "Sobre peso";
            default:
                return null;
        }
    }

    public boolean maiorDeIdade() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", id='" + id + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", IMC=" + calcularIMC() +
                ", IMC nivel=" + imcLevel() +
                ", Maior De Idade=" + maiorDeIdade() +
                '}';
    }


    }



