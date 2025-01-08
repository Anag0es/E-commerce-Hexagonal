package com.arquitetura.hexagonal.application.port.out;

import com.arquitetura.hexagonal.domain.model.Pedido;

import java.util.List;

public interface PedidoRepositoryPort {

    public Pedido salvarPedido(Pedido pedido);

    public Pedido atualizarPedido(Long pedidoId);

    public void deletarPedido(Long pedidoId);

    public Pedido consultarPedido(Long pedidoId);

    public List<Pedido> listarPedidosCliente(Long clienteId);
}
