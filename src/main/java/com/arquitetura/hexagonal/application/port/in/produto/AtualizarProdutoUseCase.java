package com.arquitetura.hexagonal.application.port.in.produto;

import com.arquitetura.hexagonal.application.dto.AtualizarProdutoDto;

public interface AtualizarProdutoUseCase {

    void atualizarProduto(Long produtoId, AtualizarProdutoDto atualizarProdutoDto);
}
