package com.array.prove;

public class hotel {
    String nome;
    int camere;

    hotel(String nome, int camere) {
        this.nome = nome;
        this.camere = camere;
    }

    public int getCamere() {
        return camere;
    }

    public String getNome() {
        return nome;
    }
}
