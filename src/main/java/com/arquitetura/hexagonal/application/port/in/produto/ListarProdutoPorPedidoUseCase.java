package com.arquitetura.hexagonal.application.port.in.produto;

import com.arquitetura.hexagonal.domain.model.Produto;

import java.util.List;

public interface ListarProdutoPorPedidoUseCase {

    List<Produto> listarProdutoPorPedido(Long pedidoId);
}
