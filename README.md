Sistema de Usuários
Este projeto é uma aplicação Java baseada no framework Spring Boot, que fornece endpoint para o gerenciamento de  usuários. Utiliza banco de dados H2 para armazenamento, Lombok para redução de boilerplate.

Estrutura do Projeto
O projeto possui um controlador (controllers):

User Controller
Responsável por operações relacionadas ao usuário.

Endpoints:

POST /users
Cria um novo usuário.
Parâmetros: Objeto UserCreateRequest no corpo da requisição.
Resposta: Retorna um objeto UserCreateRequest indicando que o usuário foi criado com sucesso.

GET /users/{id}
Obtém informações de um usuário pelo ID.
Parâmetros: ID do usuário na URL.
Resposta: Retorna informações do usuário.

GET /users
Listar usuários
Resposta: Retorna uma lista de usuários.

DELETE /users/{id}
Exclui um usuário pelo ID.
Parâmetros: ID do usuário na URL.
Resposta: Retorna uma resposta vazia com status 204.

PUT /users
Atualiza informações de um usuário.
Parâmetros: Objeto UserUpdateRequest no corpo da requisição.
Resposta: Retorna um objeto DetailsUserRequest com as informações atualizadas do usuário.

Tecnologias Utilizadas
Java
Spring Boot
H2 Database
Lombok

Instruções de Instalação
Clone o repositório.
Execute a aplicação usando sua IDE ou ferramenta de build preferida.
Configurações Adicionais
Certifique-se de ter o Java instalado.
Configure corretamente as dependências no arquivo de configuração.

Contribuição
Sinta-se à vontade para contribuir.

Contato
Para dúvidas ou mais informações, entre em contato pelo email devmarianapaulina@gmail.com
