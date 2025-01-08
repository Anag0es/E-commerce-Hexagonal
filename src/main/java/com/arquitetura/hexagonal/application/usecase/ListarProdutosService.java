package com.arquitetura.hexagonal.application.usecase;

import com.arquitetura.hexagonal.application.port.out.ProdutosRepositoryPort;
import com.arquitetura.hexagonal.domain.model.Produto;

import java.util.List;

public class ListarProdutosService {

    private ProdutosRepositoryPort produtosRepositoryPort;

    public ListarProdutosService(ProdutosRepositoryPort produtosRepositoryPort) {
        this.produtosRepositoryPort = produtosRepositoryPort;
    }

    public List<Produto> listarProdutos() {
        return produtosRepositoryPort.listarProdutos();
    }
}
