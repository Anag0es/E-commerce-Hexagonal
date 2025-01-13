package com.arquitetura.hexagonal.application.usecase.pedido;

import com.arquitetura.hexagonal.application.port.in.pedido.ListarPedidosClienteUseCase;
import com.arquitetura.hexagonal.application.port.out.PedidoRepositoryPort;
import com.arquitetura.hexagonal.domain.model.Pedido;

import java.util.List;

public class ListarPedidosClienteService implements ListarPedidosClienteUseCase {

    private PedidoRepositoryPort pedidoRepositoryPort;

    public ListarPedidosClienteService(PedidoRepositoryPort pedidoRepositoryPort) {
        this.pedidoRepositoryPort = pedidoRepositoryPort;
    }

    public List<Pedido> listarPedidosCliente(Long clienteId) {
        return pedidoRepositoryPort.listarPedidosCliente(clienteId);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepositoryPort.listarPedidos();
    }
}
