# AulasSpringBoot
Projeto de estudo com Spring Boot.

## Como rodar
1. Clone o repositório
2. Execute `mvn spring-boot:run`

## Endpoints disponíveis
### Cliente
| Método   | Caminho    | Descrição                                                                                             |
| -------- |------------|-------------------------------------------------------------------------------------------------------|
| `POST`   | `/cliente` | Cadastra um novo cliente. Exemplo de corpo JSON: `{ "cpf": "", "nome": "", "email", "telefone": ""}` |
| `GET`    | `/cliente/all` | Lista todos os clientes cadastrados.                                                                  |
| `GET`    | `/cliente` | Busca clientes filtrando por `cpf`, `nome`, `email` ou `telefone`.                                    |
| `DELETE` | `/cliente/{cpf}` | Remove um cliente pelo CPF.                                                                           |

### Vendedor
| Método   | Caminho           | Descrição                                                                                                                                  |
| -------- | ----------------- |--------------------------------------------------------------------------------------------------------------------------------------------|
| `POST`   | `/vendedor`       | Cadastra um novo vendedor. Exemplo de corpo JSON: `{ "cpf": "", "nome": "", "email": "", "telefone": "", "salario": 0.0, "comissao": 0.0}` |
| `GET`    | `/vendedor/all`   | Lista todos os vendedores cadastrados.                                                                                                     |
| `GET`    | `/vendedor`       | Busca vendedores filtrando por `cpf`, `nome`, `email`, `telefone`, `salario`, `comissao`.                                                  |
| `DELETE` | `/vendedor/{cpf}` | Remove um vendedor pelo CPF.                                                                                                               |

## Tecnologias
- Java 21
- Spring Boot
- Maven
