package com.arquitetura.hexagonal.application.usecase.cliente;

import com.arquitetura.hexagonal.application.port.in.cliente.ConsultarClienteUseCase;
import com.arquitetura.hexagonal.application.port.out.ClienteRepositoryPort;
import com.arquitetura.hexagonal.domain.model.Cliente;

import java.util.List;

public class ConsultarClienteService implements ConsultarClienteUseCase {

    private ClienteRepositoryPort clienteRepositoryPort;

    public ConsultarClienteService(ClienteRepositoryPort clienteRepositoryPort) {
        this.clienteRepositoryPort = clienteRepositoryPort;
    }

    public Cliente consultarCliente(Long clienteId) {
        return clienteRepositoryPort.consultarCliente(clienteId);
    }

    public List<Cliente> listarClientes() {
        return clienteRepositoryPort.listarClientes();
    }
}
