package com.arquitetura.hexagonal.application.port.in;

import com.arquitetura.hexagonal.domain.model.Cliente;

public interface ConsultarClienteUseCase {

    Cliente consultarCliente(Long clienteId);
}
