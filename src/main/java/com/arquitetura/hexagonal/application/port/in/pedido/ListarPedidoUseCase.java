package com.arquitetura.hexagonal.application.port.in.pedido;

import com.arquitetura.hexagonal.domain.model.Pedido;

import java.util.List;

public interface ListarPedidoUseCase {

    List<Pedido> listarPedidos();

    List<Pedido> listarPedidosCliente(Long clienteId);
}
