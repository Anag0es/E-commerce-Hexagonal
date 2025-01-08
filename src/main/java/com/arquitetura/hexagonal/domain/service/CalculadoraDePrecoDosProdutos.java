package com.arquitetura.hexagonal.domain.service;

import com.arquitetura.hexagonal.domain.model.Produto;

import java.util.List;

public class CalculadoraDePrecoDosProdutos {

    public double somar(List<Produto> produtos) {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

}
