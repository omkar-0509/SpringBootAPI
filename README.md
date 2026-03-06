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

**🟢 1️⃣ CORE SPRING BOOT ANNOTATIONS**

**🔹 @SpringBootApplication**

Most important annotation.
```
@SpringBootApplication
public class DemoApplication { }

Simple meaning:

This tells Spring Boot: "Start the application from here."

Internally it combines:
@Configuration
@EnableAutoConfiguration
@ComponentScan
```
**🔹 @Configuration**
```
Marks class as configuration class.
Used to define beans manually.
```
**🔹 @EnableAutoConfiguration**
```
Automatically configures project based on dependencies.
Example:
If MySQL dependency present → DB auto config happens.
```
**🔹 @ComponentScan**
```
Scans package for components like @Controller, @Service etc.
```
**🟢 2️⃣ STEREOTYPE ANNOTATIONS**

These define role of a class.

**🔹 @Component**
```
Generic Spring managed class.
Base annotation.
```
**🔹 @Service**
```
Business logic class.
Used in service layer.
```
**🔹 @Repository**
```
DAO layer (database operations).
Adds exception translation.
```
**🔹 @Controller**
```
Used for web MVC controller (returns view).
```
**🔹 @RestController**
```
Used for REST APIs.
It = @Controller + @ResponseBody
```

**🟢 3️⃣ DEPENDENCY INJECTION ANNOTATIONS**

**🔹 @Autowired**
```
Automatically inject dependency.
```

**@Autowired 
private UserService service;
🔹 @Qualifier**
```
Used when multiple beans of same type exist.
```
**🔹 @Primary**
```
Marks default bean when multiple exist.
```
**🔹 @Bean**
```
Used inside @Configuration to create bean manually.
```
**🔹 @Value**
```
Inject value from properties file.
@Value("${server.port}")
```

**🟢 4️⃣ REST API ANNOTATIONS**

**🔹 @RequestMapping**
```
Maps HTTP request.
```
**🔹 @GetMapping**
```
Handles GET request.
```
**🔹 @PostMapping**
```
Handles POST request.
```
**🔹 @PutMapping**
```
Handles PUT request.
```
**🔹 @DeleteMapping**
```
Handles DELETE request.
```
**🔹 @PathVariable**
```
Gets value from URL.
```
**🔹 @RequestParam**
```
Gets query parameter.
```
**🔹 @RequestBody**
```
Gets JSON data from request body.
```
**🔹 @ResponseBody**
```
Returns JSON instead of view.
```

**🟢 5️⃣ JPA / HIBERNATE ANNOTATIONS**

**🔹 @Entity**
```
Marks class as database table.
```
**🔹 @Table**
```
Specifies table name.
```
**🔹 @Id**
```
Primary key.
```
**🔹 @GeneratedValue**
```
Auto generate primary key.

Strategies:

AUTO
IDENTITY
SEQUENCE
TABLE
```
**🔹 @Column**
```
Maps field to column.
```
**🔹 @Transient**
```
Field not stored in DB.
```
**🔹 @OneToOne**
```
One-to-one relationship.
```
**🔹 @OneToMany**
```
One-to-many relationship.
```
**🔹 @ManyToOne**
```
Many-to-one relationship.
```
**🔹 @ManyToMany**
```
Many-to-many relationship.
```
**🔹 @JoinColumn**
```
Foreign key column.
```
**🔹 @JoinColumns**
```
Multiple foreign keys.
```
**🟢 6️⃣ VALIDATION ANNOTATIONS**
Used for input validation.

**🔹 @NotNull**
```
Cannot be null.
```
**🔹 @NotEmpty**
```
Cannot be null or empty.
```
**🔹 @NotBlank**
```
Cannot be null, empty, or spaces.
```
**🔹 @Size**
```
Minimum & maximum length.
```
**🔹 @Email**
```
Valid email format.
```
**🔹 @Min / @Max**
```
Minimum / Maximum value.
```
**🟢 7️⃣ CONFIGURATION ANNOTATIONS**
**🔹 @ConfigurationProperties**
```
Bind properties file to class.
```
**🔹 @PropertySource**
```
Load custom properties file.
```
**🔹 @Profile**
```
Activate bean for specific environment (dev/test/prod).
```
**🟢 8️⃣ EXCEPTION HANDLING**
**🔹 @ExceptionHandler**
```
Handles specific exception.
```
**🔹 @ControllerAdvice**
```
Global exception handling.
```
**🔹 @RestControllerAdvice**
```
Global REST exception handler.
```
**🟢 9️⃣ SPRING SECURITY ANNOTATIONS**
**🔹 @EnableWebSecurity**
```
Enables security.
```
**🔹 @PreAuthorize**
```
Method-level security check.
```
**🔹 @RolesAllowed**
```
Allow only specific roles.
```
**🟢 🔟 ADVANCED ANNOTATIONS**
**🔹 @Async**
```
Run method in background thread.
```
**🔹 @Scheduled**
```
Run method at fixed interval.
```
**🔹 @Transactional**
```
Manages database transaction.
```
**🔹 @Cacheable**
```
Enable caching.
```
**🔹 @Lazy**
```
Load bean only when needed.
```
ies to Java object
