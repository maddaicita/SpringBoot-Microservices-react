# SpringBoot Microservices with React

This is a full-stack microservices-based project built using **Spring Boot**, **Spring Cloud**, **React**, and supporting technologies like **Zuul**, **Eureka**, **MySQL**, and **Liquibase**. It implements secure user authentication, course management, service discovery, and API gateway routing with a dynamic frontend.

---

## 🚀 Features

### ✅ Backend Microservices

- **User Management Service**
  - User registration and login with JWT token-based authentication
  - Password encryption using BCrypt
  - Spring Security configuration with custom UserDetailsService
  - Data persistence with MySQL and schema management via Liquibase
  - Built using Spring Boot, Spring Security, Spring Data JPA, and Lombok

- **Course Management Service**
  - Create and manage course and transaction data
  - Connects with the user service using FeignClient
  - Uses Spring Data JPA and Liquibase for schema definition and initialization
  - Protected endpoints validated via API Gateway and JWT

- **API Gateway**
  - Built using Netflix Zuul
  - Handles routing requests to backend services
  - Manages CORS and timeout configuration
  - Supports load balancing and token forwarding

- **Service Discovery**
  - Eureka Discovery Server used for dynamic registration and discovery of services

---

### 💻 Frontend Application (React)

- **Authentication Components**
  - Login and Register forms with form validation
  - JWT stored in browser and attached to HTTP requests

- **User Features**
  - View user profile
  - Display authenticated user information

- **Course Features**
  - List available courses
  - View detailed course information

- **UI Components**
  - Home page showing system overview
  - Reusable Navigation Bar with routing
  - Fully implemented routing using React Router
  - Styled with Bootstrap and FontAwesome

---

## 🛠️ Tech Stack

### Backend
- Java 11
- Spring Boot
- Spring Cloud (Zuul, Eureka)
- Spring Security + JWT
- Hibernate & JPA
- MySQL
- Liquibase
- Lombok
- Maven

### Frontend
- React.js
- Bootstrap & FontAwesome
- Axios
- React Router

---

## 📁 Project Structure

```
.
├── client-side/                         # React frontend
├── eureka-discovery-server/            # Eureka service registry
├── microservice-user-management/       # User service (auth, registration, profile)
├── microservice-course-management/     # Course service (CRUD, integration)
├── zuul-gateway-service/               # API Gateway
└── pom.xml                             # Parent Maven configuration
```

---

## ▶️ Getting Started

### Prerequisites

- Java 11+
- Node.js and npm
- Maven
- MySQL installed and running

### Steps to Run

1. **Start Eureka server**
```bash
cd eureka-discovery-server
mvn spring-boot:run
```

2. **Start user and course microservices**
```bash
cd microservice-user-management
mvn spring-boot:run

cd ../microservice-course-management
mvn spring-boot:run
```

3. **Start API Gateway**
```bash
cd zuul-gateway-service
mvn spring-boot:run
```

4. **Run the React frontend**
```bash
cd client-side
npm install
npm start
```

---

## 🔐 Security

- JWT tokens protect all API routes
- Spring Security handles authentication and authorization
- CORS configured for front-end access

---

## 📈 Future Enhancements

- Add role-based authorization (e.g., admin/user)
- Dockerize the full system
- Integrate CI/CD pipelines
- Add test coverage and monitoring (e.g., Prometheus, Grafana)

---
