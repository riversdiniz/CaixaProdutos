package com.caixa;

public class Caixa {
    public static void main(String[] args) {

        int qtdProdutos = 5;
        int registro = 0;

        while (registro < qtdProdutos) {
            registro++;
            System.out.println("O produto número " + registro + " Foi registrado");
        }
    }
}
