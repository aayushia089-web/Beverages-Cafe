# 🍹 Beverage Management System

> A clean and scalable **Spring Boot + MongoDB** REST API for managing
> beverage records.

## ✨ Features

-   ➕ Create beverages
-   📋 View all beverages
-   🔍 Get beverage by ID
-   ✏️ Update beverage details
-   ❌ Delete beverages
-   🥤 Track category, price, availability, and alcoholic status

## 🛠 Tech Stack

  Technology            Usage
  --------------------- -----------------------
  Java 17               Programming Language
  Spring Boot           Backend Framework
  Spring Web            REST APIs
  Spring Data MongoDB   Database Access
  MongoDB               NoSQL Database
  Maven                 Dependency Management
  Postman               API Testing

## 📂 Project Structure

``` text
src
├── controller
├── service
├── repository
├── entity
└── exception
```

## 📌 Beverage Entity

-   ID
-   Name
-   Category
-   Price
-   Alcoholic (true/false)
-   Available (true/false)

## 🚀 API Operations

  Method   Endpoint            Description
  -------- ------------------- --------------------
  POST     `/beverages`        Create beverage
  GET      `/beverages`        Get all beverages
  GET      `/beverages/{id}`   Get beverage by ID
  PUT      `/beverages/{id}`   Update beverage
  DELETE   `/beverages/{id}`   Delete beverage

## ▶️ Getting Started

1.  Clone the repository.
2.  Configure MongoDB connection in `application.properties`.
3.  Run the Spring Boot application.
4.  Test endpoints using Postman.

## 💾 MongoDB Configuration

``` properties
spring.data.mongodb.uri=your_mongodb_connection_string
spring.data.mongodb.database=your_database_name
```

## 📸 Future Enhancements

-   Validation
-   Swagger/OpenAPI
-   Authentication & Authorization
-   Pagination & Sorting
-   Docker Deployment

------------------------------------------------------------------------

⭐ If you found this project useful, consider giving it a star!
