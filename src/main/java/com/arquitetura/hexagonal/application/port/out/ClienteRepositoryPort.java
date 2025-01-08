package com.arquitetura.hexagonal.application.port.out;

import com.arquitetura.hexagonal.domain.model.Cliente;

public interface ClienteRepositoryPort {

    public Cliente salvarCliente(Long clienteId);

    public Cliente atualizarCliente(Long clienteId);

    public void deletarCliente(Long clienteId);

    public Cliente consultarCliente(Long clienteId);
}
