package com.arquitetura.hexagonal.infra.adapter.in.web;

import com.arquitetura.hexagonal.application.dto.CriarPedidoDto;
import com.arquitetura.hexagonal.application.port.in.pedido.CriarPedidoUseCase;
import com.arquitetura.hexagonal.application.port.in.pedido.ListarPedidosClienteUseCase;
import com.arquitetura.hexagonal.domain.model.Pedido;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final CriarPedidoUseCase criarPedidoUseCase;
    private final ListarPedidosClienteUseCase listarPedidosClienteUseCase;

    public PedidoController(CriarPedidoUseCase criarPedidoUseCase, ListarPedidosClienteUseCase listarPedidosClienteUseCase) {
        this.criarPedidoUseCase = criarPedidoUseCase;
        this.listarPedidosClienteUseCase = listarPedidosClienteUseCase;
    }

    @GetMapping
    public List<Pedido> getPedidos() {
        return listarPedidosClienteUseCase.listarPedidos();
    }

    @GetMapping("/{clienteId}")
    public List<Pedido> getPedidosCliente(@PathVariable Long clienteId) {
        return listarPedidosClienteUseCase.listarPedidosCliente(clienteId);
    }

    @PostMapping
    public void criarPedido(@RequestBody CriarPedidoDto criarPedidoDto) {
        criarPedidoUseCase.criarPedido(criarPedidoDto);
    }
}
