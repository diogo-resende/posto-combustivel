# Cadastro e Consulta de Abastecimentos

Projeto desenvolvido como **Desafio Técnico Júnior**, com o objetivo de criar uma aplicação simples para **cadastro e consulta de abastecimentos em um posto de combustível**, utilizando **Java e Spring Boot**.

A aplicação permite realizar operações de **CRUD** por meio de uma **API REST**, com persistência em banco de dados **H2**, acessível via **H2 Console**.

---

## Objetivo

Desenvolver uma aplicação Java para:
- Cadastro de tipos de combustível
- Cadastro de bombas de combustível
- Registro de abastecimentos
- Consulta dos dados cadastrados
- Persistência das informações em banco de dados

---

##  Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Lombok
- Maven
- Banco de dados H2 (em memória)

---

##  Funcionalidades Implementadas

###  Tipos de Combustível
- Criar
- Listar
- Atualizar
- Deletar  
**Atributos:**
- Nome
- Preço por litro

---

###  Bombas de Combustível
- Criar
- Listar
- Atualizar
- Deletar  
**Atributos:**
- Nome da bomba
- Tipo de combustível associado

---

###  Abastecimentos
- Criar
- Listar
- Atualizar
- Deletar  
**Atributos:**
- Bomba utilizada
- Data do abastecimento
- Quantidade abastecida (litros)
- Valor total

---

##  Consultas

- Consulta de todos os dados cadastrados via API REST
- Visualização dos dados diretamente pelo **H2 Console**

---

##  Arquitetura e Boas Práticas

- Projeto estruturado com Maven
- Separação de responsabilidades:
  - Controller
  - Service
  - Repository (DAO)
- Relacionamentos entre entidades corretamente implementados
- Uso de Lombok para reduzir boilerplate
- Código organizado e comentado

---

##  Como Executar o Projeto

### Pré-requisitos
- Java 17+ (ou versão utilizada no projeto)
- Maven
- IDE de sua preferência (IntelliJ, Eclipse, VS Code)

---

###  Passos para execução

```bash
git clone <url-do-repositorio>
cd nome-do-projeto
mvn spring-boot:run
```
## 🗄️ Acesso ao H2 Database

Após iniciar a aplicação, o H2 Console estará disponível em:

http://localhost:8080/h2-console

Configurações padrão:
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (em branco)

### Diferenciais Implementados

API RESTful com métodos:

GET

POST

PUT

DELETE

Persistência de dados com Spring Data JPA

Banco H2 para facilitar testes e execução local

Estrutura organizada seguindo boas práticas

 ### Autor

Desenvolvido por Diogo Resende Braga
GitHub: https://github.com/diogo-resende
LinkedIn: https://www.linkedin.com/in/diogo-resende-braga

