# 🧠 Notes Manager – Backend

A RESTful backend service for the **Notes Manager** application, built using **Java and Spring Boot** and deployed using **Docker on Render**.

This backend exposes APIs to create, read, and delete notes, and is consumed by a separate frontend application.

---

## 🌐 Live Deployment

👉 **Backend API (Render):**

```
https://notes-manager-backend-7yp6.onrender.com
```

👉 **Sample Endpoint:**

```
GET /api/notes
https://notes-manager-backend-7yp6.onrender.com/api/notes
```

> ⚠️ The backend is deployed on a free hosting tier and may take **30–60 seconds** to respond on the first request due to cold start.

---

## 🛠 Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database (in-memory)
* Docker
* Render (cloud deployment)

---

## 📌 Features

* Create a note
* Fetch all notes
* Fetch note by ID
* Delete a note
* RESTful API design
* JSON-based communication
* Deployed as a containerized application

---

## 📂 Project Structure

```
notes-manager-backend/
├── src/main/java/com/notesmanager
│   ├── controller
│   ├── service
│   ├── repository
│   ├── entity
│   ├── dto
│   └── exception
├── Dockerfile
├── pom.xml
└── README.md
```

---

## 🔗 API Endpoints

### ➕ Create Note

```
POST /api/notes
```

**Request Body:**

```json
{
  "title": "Sample Title",
  "content": "Sample Content"
}
```

---

### 📄 Get All Notes

```
GET /api/notes
```

---

### 🔍 Get Note by ID

```
GET /api/notes/{id}
```

---

### ❌ Delete Note

```
DELETE /api/notes/{id}
```

---

## ⚙️ How It Works

* Follows a **layered architecture**

  * Controller → Service → Repository
* Uses **DTOs** to separate API contracts from entities
* Business logic is handled in the service layer
* Persistence is managed via Spring Data JPA
* The application is packaged and run using **Docker**

---

## ⚠️ Important Notes & Limitations

This backend is intentionally kept simple for demonstration purposes.

* No authentication or authorization
* All notes are publicly accessible
* No user ownership or access control
* Uses **H2 in-memory database**

  * Data resets on application restart
* Not intended for production use

These trade-offs were made to focus on:

* REST API design
* Backend structure
* Cloud deployment
* End-to-end integration

---

## 🧠 Learning Outcomes

* Designing REST APIs using Spring Boot
* Implementing layered backend architecture
* Using Spring Data JPA for persistence
* Handling JSON serialization/deserialization
* Containerizing a Spring Boot application with Docker
* Deploying a backend service to the cloud
* Understanding real-world issues like cold starts and stateless services

---

## 🚀 Future Enhancements

* User authentication & authorization
* Per-user note ownership
* Persistent database (PostgreSQL/MySQL)
* Global exception handling improvements
* Pagination and sorting
* API security (JWT, rate limiting)

---

## 👤 Author

**Raj Shah**
Engineering Student | Java & Spring Boot Developer

---

Your move.
