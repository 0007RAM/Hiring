# Hiring Platform

A backend-based Hiring Platform application built using Java, Spring Boot, and MongoDB. This project allows users to manage job posts and search for relevant jobs based on technologies, job descriptions, and job profiles.

The project demonstrates Spring Boot REST APIs, MongoDB integration, CRUD operations, custom repositories, and MongoDB search functionality.

---

## Features

- Create job posts
- Retrieve all job posts
- Search for job posts using keywords
- Search across multiple fields
- MongoDB database integration
- Custom repository implementation
- MongoDB aggregation pipeline
- Sort jobs based on experience
- Limit search results

---

## Tech Stack

- Java
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven

---

## Project Structure

```text
HiringPlatform
│
├── src
│   ├── main
│   │
│   │   ├── java
│   │   │   └── com.ram.HiringPlatform
│   │   │       │
│   │   │       ├── Model
│   │   │       │   └── Post.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │   ├── SearchRepository.java
│   │   │       │   ├── searchByImpl.java
│   │   │       │   └── PostRepository.java
│   │   │       │
│   │   │       ├── service
│   │   │       │   └── PostService.java
│   │   │       │
│   │   │       ├── controller
│   │   │       │   └── PostController.java
│   │   │       │
│   │   │       └── HiringPlatformApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│
├── pom.xml
└── README.md