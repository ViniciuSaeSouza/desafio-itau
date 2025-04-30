# Desafio Técnico - API de Transações e Estatísticas

Este projeto foi desenvolvido como solução para o desafio técnico proposto no repositório [desafio-itau-vaga-99-junior](https://github.com/rafaellins-itau/desafio-itau-vaga-99-junior). Ele consiste em uma API RESTful para gerenciar transações financeiras e calcular estatísticas baseadas nas transações realizadas nos últimos 60 segundos.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3**
- **Maven**
- **Jakarta Validation**
- **Lombok**

## Funcionalidades

A API implementa as seguintes funcionalidades:

### Transações (`/transacao`)
- **`GET /transacao`**: Retorna todas as transações registradas.
- **`POST /transacao`**: Registra uma nova transação. O corpo da requisição deve conter os dados da transação no formato JSON.
- **`DELETE /transacao`**: Remove todas as transações registradas.

### Estatísticas (`/estatistica`)
- **`GET /estatistica`**: Retorna estatísticas das transações realizadas nos últimos 60 segundos, incluindo:
  - Soma dos valores (`sum`)
  - Média dos valores (`avg`)
  - Valor mínimo (`min`)
  - Valor máximo (`max`)
  - Quantidade de transações (`count`)

## Estrutura do Projeto

- **`controller`**: Contém os controladores REST responsáveis por expor os endpoints da API.
- **`repository`**: Implementa a lógica de armazenamento e manipulação de dados em memória.
- **`model`**: Define os modelos de dados utilizados na aplicação.
- **`exception`**: Gerencia o tratamento de exceções e erros de validação.

## Como Executar o Projeto

1. Certifique-se de ter o **Java 21** e o **Maven** instalados em sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/ViniciuSaeSouza/desafio-itau
   ```
3. Navegue até o diretório do projeto:
   ```bash
   cd desafio-itau
   ```
4. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```
5. A API estará disponível em `http://localhost:8080`.

## Exemplos de Requisições

### Criar uma Transação
**`POST /transacao`**
```json
{
  "valor": 100.50,
  "dataHora": "2023-10-01T12:00:00Z"
}
```

### Consultar Estatísticas
**`GET /estatistica`**
```json
{
  "sum": 200.00,
  "avg": 100.00,
  "min": 50.00,
  "max": 150.00,
  "count": 2
}
```

## Tratamento de Erros

- **400 Bad Request**: Quando o corpo da requisição está malformado.
- **422 Unprocessable Entity**: Quando os dados enviados não atendem às validações.

## Melhorias Futuras
- Documentação da API com Swagger.
- Containerização com Docker.
- Logs
- Persistência de dados relacional
- Persistência de dados em um banco de dados relacional ou NoSQL.

## Autor

Este projeto foi desenvolvido por **[ViniciuSaeSouza](https://github.com/ViniciuSaeSouza)** como parte do desafio técnico.
