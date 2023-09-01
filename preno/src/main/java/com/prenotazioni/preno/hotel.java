package com.prenotazioni.preno;

class Hotel {
    private String nome;
    private int camere;

    Hotel(String nome, int camere) {
        this.nome = nome;
        this.camere = camere;
    }

    public String getNome() {
        return nome;
    }

    public int getCamere() {
        return camere;
    }
}
