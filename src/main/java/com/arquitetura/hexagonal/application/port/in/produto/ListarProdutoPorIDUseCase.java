package com.arquitetura.hexagonal.application.port.in.produto;

import com.arquitetura.hexagonal.domain.model.Produto;

public interface ListarProdutoPorIDUseCase {

    Produto listarProdutoPorID(Long produtoId);
}
