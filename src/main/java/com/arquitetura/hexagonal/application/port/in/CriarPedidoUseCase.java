package com.arquitetura.hexagonal.application.port.in;

import com.arquitetura.hexagonal.application.dto.CriarPedidoDto;
import com.arquitetura.hexagonal.domain.model.Pedido;

public interface CriarPedidoUseCase {

    Pedido criarPedido(CriarPedidoDto request);
}
