<div align="center">

# 🍹 Beverage Management System

### 🚀 Spring Boot + MongoDB REST API

A modern RESTful API built with **Java**, **Spring Boot**, and **MongoDB** for managing beverage records efficiently.

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-success?style=for-the-badge&logo=springboot)
![MongoDB](https://img.shields.io/badge/MongoDB-Database-green?style=for-the-badge&logo=mongodb)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![REST API](https://img.shields.io/badge/REST-API-blue?style=for-the-badge)

</div>

---

# 📖 Overview

The **Beverage Management System** is a backend application developed using **Spring Boot** and **MongoDB** that provides RESTful APIs for performing CRUD operations on beverage records.

Each beverage contains details such as:

- 🆔 Beverage ID
- 🥤 Beverage Name
- 📂 Category
- 💰 Price
- 🍷 Alcoholic / Non-Alcoholic
- ✅ Availability Status

The project follows a clean layered architecture consisting of:

- Controller Layer
- Service Layer
- Repository Layer
- Entity Layer
- Exception Handling

---

# ✨ Features

✅ Create Beverage

✅ Get All Beverages

✅ Get Beverage By ID

✅ Update Beverage Details

✅ Delete Beverage

✅ Store Data in MongoDB

✅ RESTful API Design

✅ Exception Handling

---

# 🛠 Tech Stack

| Technology | Purpose |
|------------|---------|
| ☕ Java 17 | Programming Language |
| 🌱 Spring Boot | Backend Framework |
| 🌐 Spring Web | REST APIs |
| 🍃 Spring Data MongoDB | Database Operations |
| 🍀 MongoDB | NoSQL Database |
| 📦 Maven | Dependency Management |
| 📮 Postman | API Testing |
| 💻 Eclipse / STS | IDE |

---

# 📁 Project Structure

```
src
│
├── controller
│
├── service
│
├── repository
│
├── entity
│
├── exception
│
└── resources
    └── application.properties
```

---

# 🗂 Beverage Entity

| Field | Type |
|--------|------|
| id | String |
| name | String |
| category | String |
| price | Integer |
| isAlcoholic | Boolean |
| isAvailable | Boolean |

---

# 🔥 REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/beverages` | Add Beverage |
| GET | `/beverages` | Get All Beverages |
| GET | `/beverages/{id}` | Get Beverage By ID |
| PUT | `/beverages/{id}` | Update Beverage |
| DELETE | `/beverages/{id}` | Delete Beverage |

---

# 🍃 MongoDB Configuration

Configure your MongoDB connection in **application.properties**

```properties
# MongoDB Connection
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=beverage_db

# OR use MongoDB Atlas

spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster0.xxxxx.mongodb.net/beverage_db
```

---

# ▶️ How to Run

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/beverage-management-system.git
```

### 2️⃣ Open Project

Import the project into **Eclipse** or **Spring Tool Suite**.

### 3️⃣ Configure MongoDB

Update the MongoDB properties inside

```
src/main/resources/application.properties
```

### 4️⃣ Run the Project

Run the Spring Boot application.

### 5️⃣ Test APIs

Use **Postman** to test all CRUD endpoints.

---

# 📌 Sample JSON

```json
{
    "id": "101",
    "name": "Coca Cola",
    "category": "Soft Drink",
    "price": 50,
    "alcholic": false,
    "available": true
}
```

---

# 🚀 Future Enhancements

- 🔐 Spring Security + JWT Authentication
- 📄 Swagger/OpenAPI Documentation
- 📊 Pagination & Sorting
- 🔍 Search & Filter APIs
- 🐳 Docker Support
- ☁️ Deployment on Render/AWS
- 🧪 JUnit & Mockito Testing

---

# 👩‍💻 Author

**Aayushi**

Java Developer | Spring Boot Developer

LinkedIn: https://www.linkedin.com/in/aayushi-aayushi-347144322

GitHub:https://github.com/aayushia089-web

---

<div align="center">

### ⭐ If you like this project, don't forget to give it a Star!

Made with ❤️ using Spring Boot & MongoDB

</div>
