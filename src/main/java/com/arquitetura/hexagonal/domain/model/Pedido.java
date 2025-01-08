package com.arquitetura.hexagonal.domain.model;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private long id;
    private Cliente cliente;
    private List<Produto> quantidade;
    private List<Produto> produtos;
    private LocalDateTime dataPedido;
}
