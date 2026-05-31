# 🚀 Spring Boot Data Validation API

🔥 A Spring Boot REST API project demonstrating input validation using Jakarta Validation, Spring Boot, Spring Data JPA, and MySQL.

💡 This project includes authentication APIs, product APIs, validation handling, and global exception handling.

---

## ✨ Features

- 👤 User Signup API
- 🔐 User Login API
- 📦 Product Management API
- ✅ DTO Validation
- 🚨 Global Exception Handling
- 📄 Clean Validation Error Responses
- 🗃️ Spring Data JPA Integration
- 🐬 MySQL Database Integration
- 🏛️ Layered Architecture
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
 ├── 🎯 controller
 ├── ⚙️ service
 ├── 🔧 service/impl
 ├── 📦 dto
 ├── 🧩 entity
 ├── 🗄️ repository
 ├── 🚨 exception
 └── 🏷️ enums
```

---

## ✅ Validation Annotations Used

- ✍️ `@NotBlank`
- 📌 `@NotNull`
- 📧 `@Email`
- 📏 `@Size`
- 🔢 `@Min`
- ✔️ `@Valid`

---

## 🔗 API Endpoints

### 🔐 Authentication APIs

| Method | Endpoint | Description |
|----------|-------------------------|----------------|
| POST | `/api/auth/signup` | Register User |
| POST | `/api/auth/login` | Login User |

### 📦 Product APIs

| Method | Endpoint | Description |
|----------|------------------|------------------|
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
git clone https://github.com/your-username/spring-boot-data-validation-api.git
```

### 📂 Navigate to Project

```bash
cd spring-boot-data-validation-api
```

### ▶️ Run Application

```bash
mvn spring-boot:run
```

---

## 🎯 Learning Outcomes

- 📚 Implement request validation using Jakarta Validation
- 📝 Create DTO-based API design
- 🚨 Handle validation exceptions globally
- 🚀 Build clean REST APIs with Spring Boot
- 🗄️ Integrate Spring Data JPA with MySQL
- 🏛️ Follow layered architecture best practices

---

## 🌟 Project Highlights

✨ Real-world Spring Boot validation implementation

🛡️ Robust global exception handling

🏗️ Industry-standard layered architecture

🚀 REST API development best practices

🗄️ MySQL database integration with Spring Data JPA

📖 Beginner-friendly project for learning backend development

⚡ Clean, scalable, and maintainable codebase

---

## 👨‍💻 Author

**Yogesh**
