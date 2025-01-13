package com.arquitetura.hexagonal.application.usecase.produto;

import com.arquitetura.hexagonal.application.port.out.ProdutosRepositoryPort;

public class ListarProdutoPedidoService {

    private final ProdutosRepositoryPort produtosRepositoryPort;

    public ListarProdutoPedidoService(ProdutosRepositoryPort produtosRepositoryPort) {
        this.produtosRepositoryPort = produtosRepositoryPort;
    }

    public void listarProdutoPedido(Long pedidoId) {
        produtosRepositoryPort.listarProdutosPorPedido(pedidoId);
    }
}
