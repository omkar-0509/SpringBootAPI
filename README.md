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
1️⃣ **@SpringBootApplication**
```
Used in: SankuApplication
Purpose: Marks the main class of a Spring Boot application.
It is a combination of:
@Configuration
@EnableAutoConfiguration
@ComponentScan
```
**2️⃣ @RestController**
```
Used in: Studcntrl
Purpose: Marks the class as a REST API controller.
Handles HTTP requests
Automatically converts return values into JSON
Combines @Controller + @ResponseBody
```
**3️⃣ @Autowired**
```
Used in: Studcntrl
Purpose: Injects dependency automatically.
```
**4️⃣ @GetMapping**
```
Used for: Fetching student data
Purpose: Maps HTTP GET requests to methods.
```

**5️⃣ @PostMapping**
```
Used for: Saving student
Purpose: Maps HTTP POST requests.
```
**6️⃣ @PutMapping**
```
Used for: Updating student
Purpose: Maps HTTP PUT requests.
```
**7️⃣ @DeleteMapping**
```
Used for: Deleting student
Purpose: Maps HTTP DELETE requests.
```
**8️⃣ @PathVariable**
```
Used in: Delete method
Purpose: Binds URL parameter to method parameter.
```
**9️⃣ @RequestBody**
```
Used in: Save and Update methods
Purpose: Converts JSON request body into Java object.
```
**🔟 @Entity**
```
Used in: Stud class
Purpose: Marks class as JPA entity.
```
**1️⃣1️⃣ @Id**
```
Used in: Stud class
Purpose: Marks primary key field.
```
