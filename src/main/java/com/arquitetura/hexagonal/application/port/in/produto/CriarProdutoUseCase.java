package com.arquitetura.hexagonal.application.port.in.produto;

import com.arquitetura.hexagonal.application.dto.CriarProdutoDto;

public interface CriarProdutoUseCase {

    void criarProduto(CriarProdutoDto criarProdutoDto);
}
