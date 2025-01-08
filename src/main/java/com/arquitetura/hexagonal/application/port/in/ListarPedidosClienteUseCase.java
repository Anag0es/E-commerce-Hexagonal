package com.arquitetura.hexagonal.application.port.in;

import com.arquitetura.hexagonal.domain.model.Pedido;

import java.util.List;

public interface ListarPedidosClienteUseCase {

    List<Pedido> listarPedidosCliente(Long clienteId);
}
