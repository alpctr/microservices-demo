# Microservices Demo Project

This project is a **microservices-based architecture** built with **Java 21** and **Spring Boot**.  
It demonstrates how to design and implement scalable, resilient, and secure microservices with modern tools and best practices.  

---

## 🚀 Applications

- **API Gateway** – Routes external requests to internal services.
- **Product Service** – Manages product information (stored in MongoDB).
- **Order Service** – Handles order placement and communicates with Inventory Service via Kafka.
- **Inventory Service** – Manages stock levels (stored in MySQL).

---

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **Kafka** (event-driven communication)
- **MongoDB** (NoSQL database for product service)
- **MySQL** (relational database for inventory service)
- **Docker** (containerization)
- **Keycloak** (authentication and authorization)
- **Resilience4j** (circuit breaker, retries, rate limiting)

---

## ⚙️ Architecture Overview

```text
                        +----------------+
                        |   API Gateway  |
                        +----------------+
                                 |
        -------------------------------------------------
        |                        |                       |
+----------------+      +----------------+       +----------------+
| Product Service|      | Order Service  | --->  | Inventory Svc  |
|  (MongoDB)     |      |  (Kafka)       |       |  (MySQL)       |
+----------------+      +----------------+       +----------------+

   - Keycloak handles authentication/authorization across services
   - Kafka enables asynchronous communication
   - Resilience4j adds fault tolerance
