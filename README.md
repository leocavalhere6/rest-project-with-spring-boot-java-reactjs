# 📌 Fullstack API & Client – Spring Boot + React

[![Java](https://img.shields.io/badge/Java-17-red)]() 
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen)]()
[![React](https://img.shields.io/badge/React-18-blue)]()
[![Build](https://github.com/leocavalhere6/your-repo-name/actions/workflows/ci.yml/badge.svg)]()

---

## 📚 Table of Contents
- [📖 Overview](#-overview)
- [🚀 Features](#-features)
  - [🔹 Backend (Spring Boot)](#-backend-spring-boot)
  - [🔹 Frontend (React + Vite)](#-frontend-react--vite)
  - [🔹 DevOps & Deployment](#-devops--deployment)
- [🛠️ Tech Stack](#️-tech-stack)
- [⚡ Quick Start](#-quick-start)
- [🧪 Running Tests](#-running-tests)
- [📊 API Documentation](#-api-documentation)
- [🎨 Screenshots](#-screenshots)
- [🌎 Deployment](#-deployment)
- [👤 Author](#-author)
- [📌 Nota em Português](#-nota-em-português)

---

## 📖 Overview

This project is a **fullstack application** built from scratch with **Spring Boot (Java)** on the backend and **React (Vite)** on the frontend.  

It was designed as part of my **professional portfolio** to demonstrate practical knowledge of software development, applying **clean code principles, design patterns, testing, containerization, CI/CD, and cloud deployment**.  

The **backend** exposes a RESTful API with advanced features, while the **frontend** consumes this API through a modern and responsive UI.  

---

## 🚀 Features

### 🔹 Backend (Spring Boot)

- ✅ RESTful API following **Richardson Maturity Model**
- ✅ Authentication & Authorization with **Spring Security + JWT**
- ✅ **Design Patterns**: DTOs, Builders, Factories, Strategy, Fluent Interface
- ✅ Exception Handling with custom exception classes
- ✅ File Import/Export: **CSV, Excel, PDF**
- ✅ Reports generation with **JasperReports** and **Apache POI**
- ✅ Email Service with **Spring Mail & Gmail**
- ✅ Database: **MySQL with JPA & Hibernate**
- ✅ Migrations with **Flyway**
- ✅ Logging & Monitoring with Spring Boot logs
- ✅ Testing: Unit & Integration (**JUnit 5, Mockito, REST Assured, TestContainers**)
- ✅ API Documentation with **Swagger (OpenAPI)**

---

### 🔹 Frontend (React + Vite)

- ✅ Project setup with **Vite** for a fast and modern dev environment
- ✅ Authentication flow with **JWT**: login, logout, and token persistence
- ✅ Routing with **React Router v6** (protected + public routes)
- ✅ Book Management (**CRUD**): create, list, update, delete
- ✅ State management using **React hooks** (`useState`, `useEffect`) and immutability principles
- ✅ Reusable Components for forms, tables, and headers
- ✅ Responsive UI with clean **CSS**
- ✅ Integration with backend API

---

### 🔹 DevOps & Deployment

- ✅ **Docker & Docker Compose** for containerization  
- ✅ **CI/CD with GitHub Actions**  
- ✅ **AWS**: ECS, RDS, ECR, IAM + CI/CD  
- ✅ **GCP**: Cloud Run, Cloud SQL, Artifact Registry, GKE + CI/CD  
- ✅ **Kubernetes**: Pods, ReplicaSets, Deployments, Services (on GKE)  

---

## 🛠️ Tech Stack

- **Backend**: Java 17, Spring Boot, Spring Security, JPA/Hibernate  
- **Frontend**: React, Vite, Axios  
- **Database**: MySQL  
- **Infrastructure**: Docker, Docker Compose, Kubernetes (extra)  
- **CI/CD**: GitHub Actions, AWS, GCP  
- **Testing**: JUnit 5, Mockito, REST Assured, TestContainers  

---

## ⚡ Quick Start

1. **Clone the repository**
   ```bash
   git clone https://github.com/leocavalhere6/rest-project-with-spring-boot-java-reactjs.git
   cd rest-project-with-spring-boot-java-reactjs

2. **Run with Docker Compose**
```bash
docker-compose up --build
Access the application
Backend API → http://localhost:8080/api/v1

```
Swagger Docs → http://localhost:8080/swagger-ui.html

Frontend → http://localhost:5173

3. ### Running Tests
```bash
cd backend
./mvnw test
```
### 📊 API Documentation
The API is fully documented using Swagger (OpenAPI).
Once the backend is running, explore it at:
👉 http://localhost:8080/swagger-ui.html

### 🎨 Screenshots
<img width="1365" height="767" alt="Captura de tela 2025-09-09 090718" src="https://github.com/user-attachments/assets/c39638d5-c44c-41d5-9b29-2360f852798e" />
<img width="1120" height="739" alt="Captura de tela 2025-09-11 183114" src="https://github.com/user-attachments/assets/4a7c9b28-8eb9-4f20-b3e7-932c42709a2a" />
<img width="1358" height="727" alt="Captura de tela 2025-09-15 000714" src="https://github.com/user-attachments/assets/f281964b-0994-4879-a971-40225aa6e36b" />
<img width="532" height="691" alt="Captura de tela 2025-09-15 201910" src="https://github.com/user-attachments/assets/90d3d154-7742-423e-b2ae-a3d0ee8b322f" />
<img width="1365" height="720" alt="Captura de tela 2025-09-15 202957" src="https://github.com/user-attachments/assets/3a417d3c-490a-4f54-95ee-18b708340f83" />






### 👤 Author
Leo Cavalhere
Fullstack Developer – Java | Spring Boot | React

### 🔗 LinkedIn | GitHub

### 📌 Nota em Português
Este projeto foi desenvolvido com o objetivo de servir como portfólio profissional.
Ele demonstra habilidades práticas em desenvolvimento Fullstack, cobrindo desde a construção de uma API completa em Java/Spring Boot, até a implementação de um frontend em React e a entrega em nuvem com CI/CD.
