package com.arquitetura.hexagonal.application.usecase.produto;

import com.arquitetura.hexagonal.application.port.out.ProdutosRepositoryPort;

public class ListarProdutoPorIDService {

    private final ProdutosRepositoryPort produtosRepositoryPort;

    public ListarProdutoPorIDService(ProdutosRepositoryPort produtosRepositoryPort) {
        this.produtosRepositoryPort = produtosRepositoryPort;
    }

    public void listarProdutoPorID(Long produtoId) {
        produtosRepositoryPort.consultarProduto(produtoId);
    }
}
