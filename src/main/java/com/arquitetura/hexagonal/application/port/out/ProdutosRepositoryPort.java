package com.arquitetura.hexagonal.application.port.out;

import com.arquitetura.hexagonal.application.dto.CriarProdutoDto;
import com.arquitetura.hexagonal.domain.model.Produto;

import java.util.List;

public interface ProdutosRepositoryPort {

    public Produto criarProduto(CriarProdutoDto produto);

    public Produto atualizarProduto(Long produtoId);

    public void deletarProduto(Long produtoId);

    public Produto consultarProduto(Long produtoId);

    public List<Produto> listarProdutos();

    List<Produto> buscarProdutosPorIds(List<Long> idsProdutos);

}
