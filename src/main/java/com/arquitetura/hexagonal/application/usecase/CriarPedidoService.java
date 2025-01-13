package com.arquitetura.hexagonal.application.usecase;

import com.arquitetura.hexagonal.application.dto.CriarPedidoDto;
import com.arquitetura.hexagonal.application.port.in.CriarPedidoUseCase;
import com.arquitetura.hexagonal.application.port.out.ClienteRepositoryPort;
import com.arquitetura.hexagonal.application.port.out.PedidoRepositoryPort;
import com.arquitetura.hexagonal.domain.model.Pedido;

import java.time.LocalDateTime;

public class CriarPedidoService implements CriarPedidoUseCase{

    private final PedidoRepositoryPort pedidoRepositoryPort;

    private final ClienteRepositoryPort clienteRepositoryPort;

    public CriarPedidoService(PedidoRepositoryPort pedidoRepositoryPort, ClienteRepositoryPort clienteRepositoryPort) {
        this.pedidoRepositoryPort = pedidoRepositoryPort;
        this.clienteRepositoryPort = clienteRepositoryPort;
    }

    @Override
    public Pedido criarPedido(CriarPedidoDto request) {

        // 1. Validar dados de entrada
        if (request.getClienteId() == null) {
            throw new IllegalArgumentException("ClienteId é obrigatório");
        }

        // 2. Carregar cliente via clienteRepositoryPort
        var cliente = clienteRepositoryPort.consultarCliente(request.getClienteId());

        // 3. Criar objeto Pedido (domínio)
        var pedido = new Pedido(request.getClienteId(), cliente, request.getQuantidade(), request.getIdProdutos(), LocalDateTime.now());

        // 4. Salvar pedido via pedidoRepositoryPort
        return pedidoRepositoryPort.salvarPedido(pedido);
    }
}
