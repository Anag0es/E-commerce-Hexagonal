package com.arquitetura.hexagonal.application.usecase.produto;

import com.arquitetura.hexagonal.application.dto.CriarProdutoDto;
import com.arquitetura.hexagonal.application.port.out.ProdutosRepositoryPort;

public class CriarProdutoService {

    private final ProdutosRepositoryPort produtosRepositoryPort;

    public CriarProdutoService(ProdutosRepositoryPort produtosRepositoryPort) {
        this.produtosRepositoryPort = produtosRepositoryPort;
    }

    public void criarProduto(CriarProdutoDto criarProdutoDto) {
        produtosRepositoryPort.criarProduto(criarProdutoDto);
    }

}
