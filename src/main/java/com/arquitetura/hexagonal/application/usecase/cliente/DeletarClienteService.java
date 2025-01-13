package com.arquitetura.hexagonal.application.usecase.cliente;

import com.arquitetura.hexagonal.application.port.in.cliente.DeletarClienteUseCase;
import com.arquitetura.hexagonal.application.port.out.ClienteRepositoryPort;

public class DeletarClienteService implements DeletarClienteUseCase {

    private final ClienteRepositoryPort clienteRepositoryPort;

    public DeletarClienteService(ClienteRepositoryPort clienteRepositoryPort) {
        this.clienteRepositoryPort = clienteRepositoryPort;
    }

    public void deletarCliente(Long clienteId) {
        clienteRepositoryPort.deletarCliente(clienteId);
    }
}