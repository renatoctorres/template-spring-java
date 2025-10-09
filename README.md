# Java & Spring Boot  Template - Human Resources Application

![Java](http://ForTheBadge.com/images/badges/made-with-java.svg)
![Docker](https://forthebadge.com/images/badges/docker-container.svg)
![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)
![MIT](https://forthebadge.com/images/badges/license-mit.svg)

<p style= "text-align: left;">
    <a href="https://github.com/renatoctorres/github-readme-stats/actions">
        <img alt="Tests Passing" src="https://github.com/renatoctorres/template-spring-java/workflows/Test/badge.svg" />
    </a>
</p>

## 🧠 Overview

This project is a **Spring Boot 3.5.6** template designed to serve as a foundation for microservices written in **Java 25**.  
It provides a robust base including:
- Clean architecture layers (controller, service, repository, mapper, DTO, entity)
- Full CRUD base structure using generics
- MapStruct for type-safe DTO mapping
- JUnit 6 + Mockito for testing
- H2 for in-memory persistence
- OpenAPI 3 (SpringDoc) for API documentation
- Modular Java (`import module`) compatible with Java 25 preview features

---

## ⚙️ Core Technologies and Versions

| Component | Version | Description |
|------------|----------|-------------|
| **Java** | `25` | Latest JDK with `import module` and enhanced switch features |
| **Spring Boot** | `3.5.6` | Core framework for REST APIs |
| **MapStruct** | `1.6.3` | Compile-time mapper for DTO ↔ Entity conversion |
| **Lombok** | `1.18.42` | Reduces boilerplate code |
| **JUnit Jupiter** | `6.0.0` | Unit testing framework |
| **Mockito** | `5.20.0` | Mocking and behavioral testing |
| **H2 Database** | `2.4.240` | Lightweight in-memory database |
| **SpringDoc OpenAPI** | `2.8.13` | Swagger UI for API documentation |
| **JaCoCo** | `0.8.13` | Code coverage reports |
| **Maven Compiler Plugin** | `3.14.1` | Java 25 build support |
| **Maven Surefire Plugin** | `3.5.4` | Test execution management |

---
## Build the image

```bash
  mvn clean spring-boot:build-image
```
---

## 🏗️ Project Structure

Requirements: Docker daemon on the build computer
(https://docs.spring.io/spring-boot/docs/current/maven-plugin/reference/htmlsingle/#build-image).

## Configuration

The application configuration for local execution is found in the application.yaml and application-local.yaml files

### 🛠️ Build the application

```bash
  mvn clean install
```

## 🚀 Running Application

Run the Spring Boot start command 📃:

```bash
  mvn spring-boot:run
```

Or directly via Java ☕:

```bash
  java --enable-preview -jar target/template-spring-boot-0.0.1-SNAPSHOT.jar
```


The application exposes an APIs on port 8080 with these URLs:
http://localhost:8080

Swagger documentation is available on this endpoint:
http://localhost:8080/swagger-ui/index.html

Open API Specification is available on this endpoint:
http://localhost:8080/v3/api-docs

## 🧪 Testing
Run the Maven Test command:

```bash
  mvn test
```

To run tests with coverage (JaCoCo):

```bash
  mvn verify
```

## Stacks
<p style= "text-align: left;">
    <img src="https://skillicons.dev/icons?i=java" alt="Java" /> 
    <img src="https://skillicons.dev/icons?i=spring" alt="Spring Boot" />
    <img src="https://icon.icepanel.io/Technology/svg/Jupyter.svg" width="48" height="48" alt="Jupyter" />
    <img src="https://junit.org/junit5/assets/img/junit5-logo.png" height="48" alt="JUnit 5" />
    <img src="https://skillicons.dev/icons?i=hibernate" alt="Hibernate" /> 
    <img src="https://icon.icepanel.io/Technology/svg/OpenAPI.svg" width="48" height="48" alt="OpenAPI" />
    <img src="https://icon.icepanel.io/Technology/svg/Swagger.svg" width="48" height="48" alt="Swagger" />
    <img src="https://icon.icepanel.io/Technology/svg/YAML.svg" width="48" height="48" alt="YAML" />
    <img src="https://skillicons.dev/icons?i=maven" alt="Maven" /> 
    <img src="https://skillicons.dev/icons?i=github" alt="Github" />   
    <img src="https://skillicons.dev/icons?i=githubactions" alt="Github Actions" />
    <img src="https://skillicons.dev/icons?i=docker" alt="Docker" /> 
    <img src="https://dbdb.io/media/logos/h2-logo.svg" width="48" height="48" alt="H2 Database" /> 
</p>