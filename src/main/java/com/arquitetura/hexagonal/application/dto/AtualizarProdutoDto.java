package com.arquitetura.hexagonal.application.dto;

public class AtualizarProdutoDto {

        private String nome;
        private String descricao;
        private Double preco;

        public AtualizarProdutoDto(String nome, String descricao, Double preco) {
            this.nome = nome;
            this.descricao = descricao;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public Double getPreco() {
            return preco;
        }
}
