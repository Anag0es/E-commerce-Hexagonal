package com.arquitetura.hexagonal.application.port.in;

import com.arquitetura.hexagonal.domain.model.Produto;

import java.util.List;

public interface ListarProdutosUseCase {

    List<Produto> listarProdutos();
}
