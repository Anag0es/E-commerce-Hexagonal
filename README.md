# 📢 Sistema de Gerenciamento de Pedidos com Arquitetura Hexagonal ⚡️⚙️

**Sistema de Gerenciamento de Pedidos**, um projeto desenvolvido para explorar e consolidar conhecimentos sobre arquitetura hexagonal e boas práticas de design de software em Java com Spring Boot. ✨📦

---

## 🔍 Sobre o Projeto

O objetivo principal deste projeto é compreender a **estrutura hexagonal** em uma aplicação Java. O projeto foi desenhado para:

- 🌟 Explorar a **arquitetura hexagonal** e suas camadas de domínio, aplicação e infraestrutura.
- ⚙️ Consolidar conhecimentos em **Java** e sua **estrutura de dados**.
- 🔧 Demonstrar boas práticas na separação de responsabilidades e organização de camadas.
- 📚 Utilizar ferramentas como **JUnit** e **Mockito** para criação de testes unitários eficazes.

O sistema simula um gerenciamento básico de pedidos para uma loja online, com funcionalidades simples de clientes, produtos e pedidos. O foco está na organização e no entendimento das dependências entre as camadas.

---

## 💡 Recursos Principais

- **Cadastro de Clientes**: Gerencie informações de clientes no domínio da aplicação.
- **Gerenciamento de Produtos**: Adicione, edite e visualize produtos disponíveis.
- **Criação de Pedidos**: Associe pedidos aos clientes, incluindo os produtos selecionados.
- **Separação de Camadas**:
  - **Domínio**: Representa o coração da aplicação, onde estão as regras de negócio.
  - **Aplicação**: Contém os casos de uso e orquestra as interações entre as camadas.
  - **Infraestrutura**: Lida com detalhes técnicos, como persistência de dados (PostgreSQL).
- **Testes Unitários**: Garante a confiabilidade do sistema com cobertura eficaz de código.

---

## ⚛️ Tecnologias Utilizadas

- **Java 21**: Linguagem principal para desenvolvimento do projeto.
- **Spring Boot**: Framework para desenvolvimento de aplicações backend organizadas e escaláveis.
- **PostgreSQL**: Banco de dados relacional para persistência de dados.
- **Arquitetura Hexagonal**: Padrão para criar sistemas flexíveis e de fácil manutenção.
- **JUnit e Mockito**: Ferramentas para criação e execução de testes unitários.
---

## 📃 Estrutura do Projeto

- **/domain**: Classes que representam as entidades e regras de negócio.
- **/application**: Casos de uso e serviços que conectam as camadas.
- **/infrastructure**: Implementações técnicas como repositórios, configurações e adaptadores externos.
- **/tests**: Testes unitários com cobertura para as principais funcionalidades do sistema.
