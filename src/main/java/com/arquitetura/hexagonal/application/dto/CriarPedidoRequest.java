package com.arquitetura.hexagonal.application.dto;

import java.util.List;

public class CriarPedidoRequest {

    private Long clienteId;
    private List<Long> idProdutos;
    private int quantidade;

    public Long getClienteId() {
        return clienteId;
    }

    public List<Long> getIdProdutos() {
        return idProdutos;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
