package com.arquitetura.hexagonal.application.port.in;

import com.arquitetura.hexagonal.domain.model.Cliente;

import java.util.List;

public interface ConsultarClienteUseCase {

    Cliente consultarCliente(Long clienteId);

    List<Cliente> listarClientes();
}
