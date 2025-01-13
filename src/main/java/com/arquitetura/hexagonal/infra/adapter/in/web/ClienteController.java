package com.arquitetura.hexagonal.infra.adapter.in.web;

import com.arquitetura.hexagonal.application.port.in.cliente.ConsultarClienteUseCase;
import com.arquitetura.hexagonal.application.port.in.cliente.CriarClienteUseCase;
import com.arquitetura.hexagonal.application.dto.CriarClienteDto;
import com.arquitetura.hexagonal.application.port.in.cliente.DeletarClienteUseCase;
import com.arquitetura.hexagonal.domain.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ConsultarClienteUseCase consultarClienteUseCase;
    private final CriarClienteUseCase criarClienteUseCase;
    private final DeletarClienteUseCase deletarClienteUseCase;


    public ClienteController(ConsultarClienteUseCase consultarClienteUseCase,
                             CriarClienteUseCase criarClienteUseCase, DeletarClienteUseCase deletarClienteUseCase) {
        this.consultarClienteUseCase = consultarClienteUseCase;
        this.criarClienteUseCase = criarClienteUseCase;
        this.deletarClienteUseCase = deletarClienteUseCase;
    }

    @GetMapping
    public List<Cliente> getClientes() {
        return consultarClienteUseCase.listarClientes();
    }

    @GetMapping("/{clienteId}")
    public Cliente consultarCliente(@PathVariable Long clienteId) {
        return consultarClienteUseCase.consultarCliente(clienteId);
    }

    @PostMapping
    public void cadastrarCliente(@RequestBody CriarClienteDto criarClienteDto) {
        criarClienteUseCase.criarCliente(criarClienteDto);
    }

    @DeleteMapping
    public void deletarCliente(@PathVariable Long clienteId) {
        deletarClienteUseCase.deletarCliente(clienteId);
    }
}
