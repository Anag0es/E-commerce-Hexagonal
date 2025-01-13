package com.arquitetura.hexagonal.infra.adapter.in.web;

import com.arquitetura.hexagonal.application.dto.AtualizarProdutoDto;
import com.arquitetura.hexagonal.application.dto.CriarProdutoDto;
import com.arquitetura.hexagonal.application.port.in.produto.*;
import com.arquitetura.hexagonal.domain.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final AtualizarProdutoUseCase atualizarProdutoUseCase;
    private final CriarProdutoUseCase criarProdutoUseCase;
    private final ListarProdutoPorPedidoUseCase listarProdutoPorPedidoUseCase;
    private final ListarProdutosUseCase listarProdutosUseCase;
    private final ListarProdutoPorIDUseCase listarProdutoPorIDUseCase;

    public ProdutoController(AtualizarProdutoUseCase atualizarProdutoUseCase,
                             CriarProdutoUseCase criarProdutoUseCase,
                             ListarProdutoPorPedidoUseCase listarProdutoPorPedidoUseCase,
                             ListarProdutosUseCase listarProdutosUseCase,
                             ListarProdutoPorIDUseCase listarProdutoPorIDUseCase) {
        this.atualizarProdutoUseCase = atualizarProdutoUseCase;
        this.criarProdutoUseCase = criarProdutoUseCase;
        this.listarProdutoPorPedidoUseCase = listarProdutoPorPedidoUseCase;
        this.listarProdutosUseCase = listarProdutosUseCase;
        this.listarProdutoPorIDUseCase = listarProdutoPorIDUseCase;
    }

    @GetMapping
    public List<Produto> getProdutos() {
        return listarProdutosUseCase.listarProdutos();
    }

    @GetMapping("/pedido/{pedidoId}")
    public List<Produto> listarProdutoPorPedido(@PathVariable Long pedidoId) {
        return listarProdutoPorPedidoUseCase.listarProdutoPorPedido(pedidoId);
    }

    @PostMapping
    public void criarProduto(@RequestBody CriarProdutoDto produto) {
        criarProdutoUseCase.criarProduto(produto);
    }

    @PutMapping("/{produtoId}")
    public void atualizarProduto(@PathVariable Long produtoId, @RequestBody AtualizarProdutoDto produto) {
        atualizarProdutoUseCase.atualizarProduto(produtoId, produto);
    }
}
