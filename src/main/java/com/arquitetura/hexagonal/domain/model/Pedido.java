package com.arquitetura.hexagonal.domain.model;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private long id;
    private Cliente cliente;
    private int quantidade;
    private List<Long> produtos;
    private LocalDateTime dataPedido;

    public Pedido(long id, Cliente cliente, int quantidade, List<Long> produtos, LocalDateTime dataPedido) {
        this.id = id;
        this.cliente = cliente;
        this.quantidade = quantidade;
        this.produtos = produtos;
        this.dataPedido = dataPedido;
    }

    public long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public List<Long> getProdutos() {
        return produtos;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }
}
