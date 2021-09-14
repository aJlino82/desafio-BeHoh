# Desafio-BeHoh
Desafio Java Web

## A API:

Foi utilizado o Java 11 e o Spring framework na versão 2.5.4 para criação do projeto:

    O gerenciador de pacotes escolhido foi o Gradle.
    O banco utilidado foi  o Mysql, e foi utilizado o Sprgin JPA para a persistência dos dados.
    AS dependências utilizadas foram: Spring Web, JPA, Lombok e MySQL Driver.
  

Foi criado um Controller de API para as entidades Eventos e Usuarios que irá expor os seguintes métodos HTTP (URIs RESTFul):

    Cadastrar um evento - @PostMapping("/evento")
    Cadastrar um usuário - @PostMapping("/users")
    
    Listar os eventos cadastrados - @GetMapping("/evento")
    Listar todos os usuarios - @GetMapping(“/users)
    
    Listar um usuario específico pelo ID - @GetMapping(“/users/{id}”)
    Listar um usuario específico pelo ID - @GetMapping(“/evento/{id}”)
    
    O que ainda será implementado:
    
    Realizar a operação de inscrição de um usuário em um evento
    Realizar o cancelamento de uma inscrição de um usuário em um evento
    Listar as inscrições de um usuário
    Listar os inscritos de um evento
    Realizar entrada do usuário no evento
    
    *Tarefas adicionais.
    
    
