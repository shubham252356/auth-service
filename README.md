# Auth Service

The Auth Service is a core microservice responsible for user authentication and authorization in the Expense Tracker system. It handles user signup, login, logout, and JWT token management.

---

## Features

- User signup with validation and role assignment.
- Secure login with JWT token issuance.
- Logout functionality that blacklists JWT tokens using Redis.
- Stateless authentication using JWT.
- Integration point for user data management via User Service.
- Password hashing with BCrypt.
- Security configuration with Spring Security.
- Redis caching for token blacklist management.

---

## Technology Stack

- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Redis (for token blacklist)
- Lombok
- Maven

---

## API Endpoints

| Method | Path       | Description                         |
|--------|------------|-----------------------------------|
| POST   | /signup    | Registers a new user               |
| POST   | /login     | Authenticates user and returns JWT|
| POST   | /logout    | Blacklists JWT token               |

---

## Getting Started

### Prerequisites

- Java 17+
- Maven 3+
- Redis instance running and accessible
- User Service endpoint available

### Running the Service

1. Clone the repo:

```bash
git clone https://github.com/yourusername/auth-service.git
cd auth-service
