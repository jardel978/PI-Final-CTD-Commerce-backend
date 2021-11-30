package com.dh.projetofinal.CTDCommerce.entity;

public enum NomeCategoria {

    ELETRONICOS("eletronicos",0),

    ELETRODOMESTICOS("eletrodomesticos",1),

    INFORMATICA("informatica",2),

    BEBE("bebe",3),

    ESPORTE("esporte",4),

    GAMES("games",5);

    String nomeCategoria = "";
    int index;

    NomeCategoria(String nomeCategoria, int index) {
        this.nomeCategoria = nomeCategoria;
        this.index = index;
    }
}

