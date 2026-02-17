# Spring Boot API Example

This is a simple **Spring Boot REST API** built in Java. It shows how to create, read, update, and delete data (CRUD operations) using Spring Boot and a database.

## Features
- Create, read, update, and delete data
- Returns responses in JSON format
- Easy to understand and extend

## Technologies
- Java
- Spring Boot
- Spring Data JPA
- H2 / MySQL Database
- Maven

## API Endpoints

Base URL: `http://localhost:8080/api`

| Method | Endpoint       | Description           |
|--------|---------------|---------------------|
| GET    | /users        | Get all users        |
| GET    | /users/{id}   | Get user by ID       |
| POST   | /users        | Create a new user    |
| PUT    | /users/{id}   | Update a user        |
| DELETE | /users/{id}   | Delete a user        |

### Example Request (POST /users)
```json
{
  "name": "John",
  "email": "john@example.com"
}

{
  "id": 1,
  "name": "John",
  "email": "john@example.com"
}
```
## Springboot used API
```
1️⃣ **@SpringBootApplication**

Used in: SankuApplication
Purpose: Marks the main class of a Spring Boot application.
It is a combination of:
@Configuration
@EnableAutoConfiguration
@ComponentScan
```
