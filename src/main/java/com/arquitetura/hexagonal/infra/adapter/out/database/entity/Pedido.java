package com.arquitetura.hexagonal.infra.adapter.out.database.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @Column(name = "cliente_id")
    private Cliente clienteId;

    @ManyToMany
    @JoinTable(
            name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produtos;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;

    public Pedido() {
    }

    public Pedido(Cliente clienteId, List<Produto> produtoId, Integer quantidade, LocalDateTime dataPedido) {
        this.clienteId = clienteId;
        this.produtos = produtoId;
        this.quantidade = quantidade;
        this.dataPedido = dataPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }

    public List<Produto> getProdutoId() {
        return produtos;
    }

    public void setProdutoId(List<Produto> produtoId) {
        this.produtos = produtoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }
}
