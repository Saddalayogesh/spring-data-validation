# 🚀 Spring Boot Data Validation API

A Spring Boot REST API project demonstrating input validation using Jakarta Validation, Spring Boot, Spring Data JPA, and MySQL.

This project includes authentication APIs, product APIs, validation handling, and global exception handling.

---

## ✨ Features

- 🔐 User Signup API
- 🔑 User Login API
- 📦 Product Management API
- ✅ DTO Validation
- ⚠️ Global Exception Handling
- 📄 Clean Validation Error Responses
- 🗄️ Spring Data JPA Integration
- 🐬 MySQL Database Integration
- 🏗️ Layered Architecture
- ⚡ Lombok Integration

---

## 🛠️ Technologies Used

- ☕ Java
- 🌱 Spring Boot
- 🌐 Spring Web
- 🗃️ Spring Data JPA
- 🐬 MySQL
- ✅ Jakarta Validation
- ⚡ Lombok
- 📦 Maven

---

## 📁 Project Structure

```text
src/main/java
 ├── controller
 ├── service
 ├── service/impl
 ├── dto
 ├── entity
 ├── repository
 ├── exception
 └── enums
```

---

## ✅ Validation Annotations Used

- `@NotBlank`
- `@NotNull`
- `@Email`
- `@Size`
- `@Min`
- `@Valid`

---

## 🔗 API Endpoints

### 🔐 Authentication APIs

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/auth/signup` | Register User |
| POST | `/api/auth/login` | Login User |

### 📦 Product APIs

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/products` | Create Product |
| GET | `/api/products` | Get All Products |

---

## 📥 Example Signup Request

```json
{
  "name": "Yogesh",
  "email": "yogesh@gmail.com",
  "password": "Password1",
  "role": "USER"
}
```

---

## ❌ Example Validation Error Response

```json
{
  "password": "Password must contain at least 8 characters",
  "name": "Name is required",
  "email": "Invalid email format"
}
```

---

## ▶️ Running the Project

### 📥 Clone Repository

```bash
git clone https://github.com/your-username/spring-data-validation.git
```

### 📂 Navigate to Project

```bash
cd spring-data-validation
```

### ▶️ Run Application

```bash
mvn spring-boot:run
```

---

## 👨‍💻 Author

Yogesh
