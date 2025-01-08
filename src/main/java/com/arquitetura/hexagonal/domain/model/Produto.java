package com.arquitetura.hexagonal.domain.model;

public class Produto {

    private long id;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(long id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
