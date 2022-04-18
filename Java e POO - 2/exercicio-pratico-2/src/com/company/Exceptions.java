package com.company;

public class Exceptions {

    public static int a = 0;
    public static int b = 300;

    public static void main(String[] args) {

        try{
            int razao = b/a;
        }
        catch (ArithmeticException ex){
            System.out.println("Ocorreu um erro");
            throw new IllegalArgumentException("O Java não permite divisões por zero");
        }

    }

}
