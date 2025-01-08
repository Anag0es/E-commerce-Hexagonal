package com.arquitetura.hexagonal.application.port.in;

import com.arquitetura.hexagonal.application.dto.CriarPedidoRequest;
import com.arquitetura.hexagonal.domain.model.Cliente;
import com.arquitetura.hexagonal.domain.model.Pedido;

import java.util.List;

public interface CriarPedidoUseCase {

    Pedido criarPedido(CriarPedidoRequest request);
}
