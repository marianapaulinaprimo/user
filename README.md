# Sistema de Usuários
Este projeto é uma aplicação Java baseada no framework Spring Boot, que fornece endpoint para o gerenciamento de usuários. Utiliza banco de dados H2 para armazenamento, Lombok para redução de boilerplate.


## Documentação da API

#### Retornar todos os usuários

```http
  GET /users
```


#### Retornar um usuário

```http
  GET /users/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do usuário que você quer consultar|

#### Criar um usuário 

```http
  POST /users
```

| Parâmetro   | Retorno | Observação                                   |
| :---------- | :--------- | :------------------------------------------ |
| `Objeto UserCreateRequest no corpo da requisição`   | Retorna um objeto UserCreateRequest indicando que o usuário foi criado com sucesso |**Verificar os campos Obrigatório**. |

#### Atualizar um usuário

```http
  PUT /users
```

| Parâmetro   | Retorno | Observação                                   |
| :---------- | :--------- | :------------------------------------------ |
| `Objeto UserUpdateRequest no corpo da requisição`   | Retorna um objeto DetailsUserRequest com as informações atualizadas do usuário |**Verificar os campos Obrigatório**. |




## Rodando localmente

Clone o repositório Execute a aplicação usando sua IDE ou ferramenta de build preferida Configurações Adicionais Certifique-se de ter o Java instalado Configure corretamente as dependências no arquivo de configuração

### Para clonar o projeto

```bash
  git clone https://github.com/marianapaulinaprimo/user.git
```

## Melhorias

Que melhorias você fez no seu código? Ex: refatorações, melhorias de performance, acessibilidade, etc. Sinta-se à vontade para contribuir.


## Stack utilizada

**Back-end:** 

![Java](https://img.shields.io/badge/java-%23ec63a1.svg?style=for-the-badge&logo=openjdk&logoColor=black) 
![Spring](https://img.shields.io/badge/spring-%23ec63a1.svg?style=for-the-badge&logo=spring&logoColor=black)
![H2 DATABASE](https://img.shields.io/badge/H2DATABASE-ec63a1?style=for-the-badge&logo=h2database&logoColor=black)





