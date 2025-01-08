package com.arquitetura.hexagonal.application.usecase;

import com.arquitetura.hexagonal.application.port.in.ConsultarClienteUseCase;
import com.arquitetura.hexagonal.application.port.out.ClienteRepositoryPort;
import com.arquitetura.hexagonal.domain.model.Cliente;

public class ConsultarClienteService implements ConsultarClienteUseCase {

    private ClienteRepositoryPort clienteRepositoryPort;

    public ConsultarClienteService(ClienteRepositoryPort clienteRepositoryPort) {
        this.clienteRepositoryPort = clienteRepositoryPort;
    }

    public Cliente consultarCliente(Long clienteId) {
        return clienteRepositoryPort.consultarCliente(clienteId);
    }
}
