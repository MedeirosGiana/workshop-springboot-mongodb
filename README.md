# Projeto-Spring Boot-MongoDB
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MedeirosGiana/workshop-springboot-mongodb/main/LICENSE)


## Visão Geral do Sistema
Projeto Java **version-17** desenvolvido com MongoDB e Spring Boot **version-3.1.1** para sistema de usuários com o seguinte contexto: **os usuários fazem postes e esses postes possuem comentários.**

## Objetivo
- Compreender as principais diferenças entre paradigma orientado a documentos e relacional
- Implementar operações de CRUD
- Refletir sobre decisões de design para um banco de dados orientado a documentos
- Implementar associações entre objetos: Objetos aninhados, Referências
- Realizar consultas com Spring Data e MongoRepository


## Passos 

- Criar projeto Spring Boot Java 
- Implementar modelo de domínio 
- Estruturar camadas lógicas: resource, service, repository 
- Configurar banco de dados MongoDB
- Criar Database no MongoDBCompass
- Povoar o banco de dados 
- CRUD - Create, Retrieve, Update, Delete 
- Realizar tratamento de exceções
- Consulta simples com Query Methods: "Buscar posts contendo um dado string no título"
- Consulta simples com @Query: Buscar posts contendo um dado string no título"
- Consulta com vários critérios: "Buscar posts contendo um dado string em qualquer lugar (no título, corpo ou comentários) e em um dado 
intervalo de datas"


## Modelo de Domínio Utilizado
![image](https://github.com/MedeirosGiana/workshop-springboot-mongodb/assets/100285143/f56742cb-611d-4af5-9927-2daf3b5c7dc1)


## Como Executar o Sistema

Para executar o projeto em seu ambiente de desenvolvimento, Certifique-se de ter o **Git**, **JDK17**, **Maven**, **MongoDB**, **MongoDBCompass**, **Postmam** e siga as instruções:

- realizar o git clone git@github.com:MedeirosGiana/workshop-springboot-mongodb.git
- subir o projeto na sua IDE de preferência
- executar o projeto e acessar o Postmam para realizar as operações de **CRUD** para usuários e postes como operação GET(com critérios de busca) conforme URL: http://localhost:8080/users, http://localhost:8080/posts/fullsearch?text=bom&maxDate=2023-03-31, segue abaixo exemplo:

  ![image](https://github.com/MedeirosGiana/workshop-springboot-mongodb/assets/100285143/c2ce5061-ca88-4331-b051-3ad63ca5c441)

## Tecnologias e Ferramentas Utilizadas

   - [Java](https://docs.oracle.com/en/java/javase/17/)
   - [Maven](https://maven.apache.org/guides/)
   - [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
   - [MongoDB](https://www.mongodb.com/)
   - [Mongo Compass](https://www.mongodb.com/products/compass)
   - [Postman](https://www.postman.com/api-documentation-tool/)

## Contribuindo

Se você quiser contribuir, sinta-se à vontade para enviar um pull request ou abrir uma issue.

## Autora
**Giana Medeiros**

https://www.linkedin.com/in/gianamedeiros/


