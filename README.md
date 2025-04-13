# 🔔 Projeto: Notificações com Java 24 + Spring Boot

Este repositório demonstra o uso prático de três padrões de projeto clássicos — **Singleton**, **Factory** e **Observer** — utilizando novas funcionalidades do **Java 24** e recursos do **Spring Boot**.

---

## 📌 Objetivo

Mostrar como as features modernas do Java podem ser combinadas com boas práticas de design para criar aplicações mais robustas, legíveis e desacopladas.

---

## 🧱 Tecnologias

- Java 24
- Spring Boot 3.x
- Maven
- Java Records
- Sealed Interfaces
- Pattern Matching com `instanceof`
- ApplicationEventPublisher (Spring)

---

## 🧠 Padrões de Projeto Aplicados

### ☝️ Singleton
Gerenciado automaticamente pelo Spring Boot, garantindo uma única instância das classes como `UsuarioService`.

### 🏭 Factory
A `NotificationFactory` escolhe dinamicamente a implementação de notificação (SMS ou Email) com base na preferência do usuário.

### 👀 Observer
Utilizamos o `ApplicationEventPublisher` para notificar eventos de criação de usuário, desacoplando o envio de notificação através de um listener reativo.

---

## 📦 Estrutura Principal

- `Usuario`: modelo de dados com campos como nome, email e preferência.
- `Notification`: interface selada (`sealed`) implementada por `EmailNotification` e `SmsNotification`.
- `NotificationFactory`: define dinamicamente o tipo de notificação.
- `UsuarioService`: executa o cadastro de usuários e dispara eventos.
- `UsuarioEventListener`: responde aos eventos publicados via `ApplicationEventPublisher`.

---

## 🧩 Diagrama UML

![UML](./uml_diagram_atualizado.png)

---

## ▶️ Como Rodar

```bash
git clone https://github.com/seu-usuario/java24-patterns-notification.git
cd java24-patterns-notification
./mvnw spring-boot:run
```

---

## 🔬 Exemplos de Requisição

### Criar um novo usuário

```http
POST /usuarios
Content-Type: application/json

{
  "nome": "Maria",
  "email": "maria@email.com",
  "preferencia": "sms"
}
```

---

## 📚 Artigo Relacionado

Confira o artigo explicando em detalhes este projeto:

👉 [Novas Features Java 24 com Singleton, Factory e Observer](https://dev.to/2020nani/novas-features-java-24-com-singleton-factory-e-observer-3c7f)

---

## 📬 Contato

Feito com ❤️ por [Hernani](https://github.com/2020nani)  
Contribuições e feedbacks são muito bem-vindos!
