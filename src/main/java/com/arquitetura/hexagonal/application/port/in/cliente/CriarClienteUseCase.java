package com.arquitetura.hexagonal.application.port.in.cliente;

import com.arquitetura.hexagonal.application.dto.CriarClienteDto;

public interface CriarClienteUseCase {

    void criarCliente(CriarClienteDto criarClienteDto);
}