# Student Management System

## Overview
The **Student Management System** is a Spring Boot-based REST API that facilitates student data management, including user registration, marks management, and student details storage. The system uses MySQL as the database and follows a service-oriented architecture.

## Features
- User registration and login with phone number and password validation.
- Student details management (parent details and email information).
- Marks management (subject-wise marks entry and retrieval).
- Secure RESTful APIs implemented using Spring Boot.

## Tech Stack
- **Backend:** Java, Spring Boot, Spring Security, Hibernate
- **Database:** MySQL
- **Build Tool:** Maven
- **Logging:** SLF4J, Hibernate Logging

## Project Structure
```
StudentManagement/
│-- src/main/java/com/example/StudentManagement/
│   │-- config/       # Security configuration
│   │-- controller/   # REST controllers
│   │-- model/        # Entity classes
│   │-- repository/   # JPA repositories
│   │-- service/      # Business logic services
│   │-- StudentManagementApplication.java  # Main class
│-- src/main/resources/
│   │-- application.properties  # Database and server configurations
│-- pom.xml  # Project dependencies
```

## Installation and Setup
### Prerequisites
- Java 17+
- Maven
- MySQL

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/StudentManagement.git
   ```
2. Navigate to the project directory:
   ```sh
   cd StudentManagement
   ```
3. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/demo100
   spring.datasource.username=root
   spring.datasource.password=Harshvar@128
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```
5. The application will be available at:
   ```
   http://localhost:9090
   ```

## API Endpoints
### User Management
- **Register User:** `POST /api/users/register`
- **Login Validation:** `POST /api/users/validate-login`
- **Dashboard:** `GET /api/users/dashboard`

### Student Details
- **Insert Details:** `POST /api/students/details`
- **Get Details by User ID:** `GET /api/students/details/{userId}`

### Marks Management
- **Insert Marks:** `POST /api/marks/insert`
- **Get Marks by User ID:** `GET /api/marks/{userId}`

## Contribution Guidelines
1. Fork the repository.
2. Create a new feature branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m "Add new feature"`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a Pull Request.

## License
This project is licensed under the MIT License.

## Contact
For any inquiries, feel free to reach out via GitHub Issues.

