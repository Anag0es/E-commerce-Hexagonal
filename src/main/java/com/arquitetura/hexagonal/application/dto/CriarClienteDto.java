package com.arquitetura.hexagonal.application.dto;

public class CriarClienteDto {

    private String nome;
    private String email;
    private String cpf;

    public CriarClienteDto(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
