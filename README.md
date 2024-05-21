# Sistema de Microservicios

Este proyecto es un sistema de microservicios desarrollado con Spring Boot, Spring WebFlux, Lombok y JPA. El sistema consta de tres microservicios principales:

- **Inventory Service**: Conectado a una base de datos PostgreSQL.
- **Orders Service**: Conectado a una base de datos MySQL.
- **Product Service**: Conectado a una base de datos PostgreSQL.

## Tabla de Contenidos

- [Requisitos](#requisitos)
- [Configuración](#configuración)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Cómo Ejecutar](#cómo-ejecutar)

## Requisitos

- Java 17 o superior
- Maven 3.6.3 o superior


## Configuración

Cada microservicio tiene su propia configuración de base de datos en el archivo `application.properties`.

### Inventory Service

Archivo: `inventory_service/src/main/resources/application.properties`

```properties
spring.application.name=inventory_service
server.port=8083

spring.datasource.url=jdbc:postgresql://localhost:5432/inventory_db
spring.datasource.username=user
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
````
### orders_service

Archivo: `/src/main/resources/application.properties`
```properties
server.port=8082

spring.datasource.url=jdbc:mysql://localhost:3306/orders_db
spring.datasource.username=root
spring.datasource.password=admin

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

### products_service

Archivo: `/src/main/resources/application.properties`
```properties
server.port=8081

spring.datasource.url=jdbc:postgresql://localhost:5432/product_db
spring.datasource.username=postgres
spring.datasource.password=admin

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

# tecnologías-utilizadas
- **Spring Boot**: Framework para el desarrollo de aplicaciones Java.
- **Spring WebFlux**: Framework para el desarrollo de aplicaciones reactivas.
- **Lombok**: Biblioteca para reducir el código boilerplate.
- **JPA (Java Persistence API)**: Especificación para el mapeo de objetos relacionales.
- **PostgreSQL**: Base de datos relacional para inventory_service y product_service.
- **MySQL**: Base de datos relacional para orders_service.

