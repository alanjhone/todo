# todo
Task List Project
*************************** Orientações ***************************

Este projeto fornece a implementação referente a uma lista de tarefas utilizando JSF, Spring Boot 2.0 e Spring MVC,
na qual foi utilizado um banco de dados postgres para persistência de dados e o Hibernate para realizar o mapeamento 
objeto/relacional. A interface de usuáiro foi costruída utilizando Bootstrap 4 e componentes do Primefaces. 
O projeto também dispõe de testes automáticos (testes de unidades) criados para darem entradas e conferirem saídas, 
permitindo que se saiba que está funcionando de acordo com o esperado.

* Itens Implementados: A ao H

* Instruções para execução:

    1 - Baixar e configurar o JDK 8. (no meu caso foi o JDK 1.8.0_191)

    1 - baixar o projeto ou utilizar o git para fazer um clone no repositório: https://github.com/alanjhone/todo.git

    2 -  Criar um banco de dados local do tipo postgres com o nome ‘todo’ e, definir usuário e senha ‘postgres’.

        database: todo
        senha: postgres
        usuario: postgres

    3 - Utilizar o eclipse e importar o projeto maven que foi obtido na etapa 1.
    
    4 - Rodar a aplicação utilizando um servidor Tomcat (no meu caso foi o tomcat 8.0.53)
