package com.arquitetura.hexagonal.application.usecase.produto;

import com.arquitetura.hexagonal.application.port.in.produto.ListarProdutoPorPedidoUseCase;
import com.arquitetura.hexagonal.application.port.out.PedidoRepositoryPort;
import com.arquitetura.hexagonal.application.port.out.ProdutosRepositoryPort;
import com.arquitetura.hexagonal.domain.model.Pedido;
import com.arquitetura.hexagonal.domain.model.Produto;

import java.util.List;

public class ListarProdutoPorPedidoService implements ListarProdutoPorPedidoUseCase {
    private final PedidoRepositoryPort pedidoRepositoryPort;
    private final ProdutosRepositoryPort produtoRepositoryPort; // Novo Port Out para buscar os produtos

    public ListarProdutoPorPedidoService(PedidoRepositoryPort pedidoRepositoryPort,
                                         ProdutosRepositoryPort produtosRepositoryPort) {
        this.pedidoRepositoryPort = pedidoRepositoryPort;
        this.produtoRepositoryPort = produtosRepositoryPort;
    }

    @Override
    public List<Produto> listarProdutoPorPedido(Long pedidoId) {
        // Buscar o pedido pelo ID
        Pedido pedido = pedidoRepositoryPort.buscarPedidoPorId(pedidoId);
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido não encontrado!");
        }

        // Buscar os IDs dos produtos associados ao pedido
        List<Long> idsProdutos = pedido.getProdutos();

        // Buscar os objetos Produto correspondentes aos IDs
        return produtoRepositoryPort.buscarProdutosPorIds(idsProdutos);
    }
}



