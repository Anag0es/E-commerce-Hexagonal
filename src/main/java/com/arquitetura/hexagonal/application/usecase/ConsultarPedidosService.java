package com.arquitetura.hexagonal.application.usecase;

import com.arquitetura.hexagonal.application.port.in.ListarPedidoUseCase;
import com.arquitetura.hexagonal.application.port.out.PedidoRepositoryPort;
import com.arquitetura.hexagonal.domain.model.Pedido;

import java.util.List;

public class ConsultarPedidosService implements ListarPedidoUseCase {

    private PedidoRepositoryPort pedidoRepositoryPort;

    public ConsultarPedidosService(PedidoRepositoryPort pedidoRepositoryPort) {
        this.pedidoRepositoryPort = pedidoRepositoryPort;
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepositoryPort.listarPedidos();
    }

    public List<Pedido> listarPedidosCliente(Long clienteId) {
        return pedidoRepositoryPort.listarPedidosCliente(clienteId);
    }
}
