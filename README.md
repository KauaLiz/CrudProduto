# 🛒 CRUD de Produtos - Spring Boot + PostgreSQL

Este projeto é uma API REST para gerenciamento de produtos, desenvolvida em **Java 24 + Spring Boot**.  
Ele implementa operações básicas de **CRUD (Create, Read, Update, Delete)** utilizando **Spring Data JPA** e o banco de dados **PostgreSQL**.

---

## 🚀 Tecnologias Utilizadas
- **Java 24**
- **Spring Boot**
- **Spring Data JPA**
- **Maven**
- **Jakarta Validation**
- **PostgreSQL** 
---

## 📦 Estrutura do Projeto

src/main/java/com/example/crud 
│ <br>
├── controllers <br>
│ └── ProductController.java # Controlador REST
│  <br>
├── domain/product <br>
│ ├── Product.java # Entidade JPA <Br>
│ ├── ProductRepository.java # Repositório Spring Data JPA <br>
│ └── RequestProduct.java # DTO para requisições <Br>
│  <br>
└── resources <Br>
├── application.properties # Configurações do banco <Br>
└── schema.sql # Script de criação da tabela <br>


---

## 📌 Endpoints da API

### 🔹 Listar todos os produtos
`GET /product`

**Exemplo:**

```
[
  {
    "id": "1a2b3c",
    "name": "Mouse Gamer",
    "price_in_cents": 15999,
    "active": true
  }
]
```

### Cadastrar Produto
`POST /product`

**Exemplo:**

```
{
  "name": "Mouse Gamer",
  "price_in_cents": 15999
}
```

### Atualizar Produto
`PUT /product`

**Exemplo:**

```
{
  "id": "1a2b3c",
  "name": "Teclado Mecânico",
  "price_in_cents": 29999,
}
```

### Deletar Produto 
`DELETE /product/{id}`

**Exemplo:**

```
{
  "id": "1a2b3c",
  "name": "Teclado Mecânico",
  "price_in_cents": 29999,
  "active": false
}
```
---

## Instruções de Uso

Para  testar no seu computador, é necessário ter um banco de dados PostgreSQL e uma ferramenta que realize os testes
das requisições HTTP, como o Postman e Insomnia.

**Na pasta "application.properties" é necessário colocar as configurações do banco.**

```
spring.application.name=crud
spring.datasource.url=jdbc:postgresql://localhost:5432/NomeBanco
spring.datasource.username=postgres
spring.datasource.password=SUASENHA
spring.jpa.hibernate.ddl-auto=update
```

Tendo feito isso, dentro do Postman/Insomnia, digita-se os endpoints conforme a requisição HTTP que deseja efetuar. Os exemplos a seguir utilizam a porta padrão do Spring Boot (8080).
Caso você altere essa configuração no `application.properties`, lembre-se de ajustar o endpoint ao fazer a requisição.

### Exemplo do GET dentro do Insomnia:

<img width="1019" height="509" alt="image" src="https://github.com/user-attachments/assets/f7a4ddb8-f9ee-40a2-9852-67e6bd676971" />

### Exemplo do POST dentro do Insomnia:

<img width="1019" height="500" alt="image" src="https://github.com/user-attachments/assets/b4a71a72-04b4-454c-bf65-9240f236faf4" />

### Exemplo do DELETE dentro do Insomnia:

<img width="1029" height="494" alt="image" src="https://github.com/user-attachments/assets/c0a838ee-5701-4fb4-9e50-be00be645720" />

*No endpoint do delete, é necessário colocar o ID do produto: http://localhost:8080/product/{id}*

### Exemplo do PUT dentro do Insomnia:

<img width="1030" height="526" alt="image" src="https://github.com/user-attachments/assets/a76dc858-4422-46ff-ba6e-eb53b2a85c97" />

## Futuras Melhorias

<ul>
<li>Criar uma interface gráfica para facilitar o uso da API.</li>
<li>Tratar exceções e realizar aprimoramentos no código.</li>
<li>Implementar mais tecnologias e funcionalidades no mesmo.</li>
</ul>




