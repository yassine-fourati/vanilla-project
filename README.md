# VanillaProject

**VanillaProject** is a clean, modular Java backend starter template built with Spring Boot and Maven. It emphasizes best practices such as layer separation, modularity, and readability — making it simple for any backend developer to understand, maintain, and scale.

This project is designed as a solid foundation for enterprise-grade backend applications. By clearly separating concerns into dedicated layers and Maven modules, VanillaProject enables developers to build scalable, maintainable, and testable systems with ease.

---

## Key Highlights

- **Layered Architecture:** Each module corresponds to a logical layer — from data access (`vanilla_persistence`), business logic (`vanilla_business`), to API controllers (`vanilla_presentation`).
- **Frontend Integration:** The `vanilla_web` module contains the frontend application built with modern frameworks like React, Angular, or Vue.js, providing a responsive UI that seamlessly interacts with backend APIs.
- **Separation of Concerns:** Avoids monolithic structures by distributing responsibilities cleanly, enhancing maintainability and collaboration.
- **Extensibility:** Easily extendable with workflow components (`vanilla_workflow`), reusable utilities (`vanilla_common`), and comprehensive tests (`vanilla_junit`).
- **Modern Tech Stack:** Built with Spring Boot and Maven, offering a robust and tested foundation for rapid development.

VanillaProject is ideal for teams and individual developers seeking a **well-organized**, **scalable**, and **easy-to-understand** project structure that encourages clean code and effective collaboration.

---

## 📖 Project Philosophy

VanillaProject rejects the clutter of stuffing all code into a single package. Instead, it organizes logic into clearly defined layers and Maven modules to ensure:

- ✅ Easier maintenance  
- ✅ Faster onboarding for new developers  
- ✅ Greater scalability and testability  
- ✅ Cleaner, more professional code organization  

This approach aligns with **clean architecture** principles and is especially beneficial for team projects and long-term codebases.

---

## 📁 Modules Overview

| Module Name             | Description                                  |
|-------------------------|----------------------------------------------|
| `vanilla_common`        | Shared utility classes and constants.        |
| `vanilla_persistence`   | Data access layer (repositories, JPA).       |
| `vanilla_business`      | Business logic and service layer.             |
| `vanilla_presentation`  | Backend presentation layer (REST controllers).|
| `vanilla_web`           | Frontend application (React, Angular, Vue.js).|
| `vanilla_junit`         | Unit and integration test cases.              |
| `vanilla_workflow`      | Workflow-related components (e.g., AOP).      |

---

## ⚙️ Technology Stack

- Java 21  
- Spring Boot 3.4.4  
- Maven  
- AspectJ (AOP)  
- Springdoc OpenAPI  
- YAML-based configuration  
- JUnit 5  

---

## 🚀 Getting Started

### Prerequisites

- Java 21  
- Maven 3.2+  

### Build and Run

```bash
# Clean, compile, and package the project
mvn clean install

# Run the Spring Boot application (from the parent or presentation module)
mvn spring-boot:run
