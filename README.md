# Hospital Management System

A full-stack Hospital Management System built using Java technologies with cloud deployment and PostgreSQL database integration.

## 🚀 Tech Stack

### Frontend
- JavaFX
- CSS

### Backend
- Spring Boot
- Spring Data JPA
- REST API

### Database
- PostgreSQL (Neon Database)

### Deployment
- Render
- GitHub

---

# Features

✅ Add Patients  
✅ View Patients  
✅ REST API Integration  
✅ Cloud Database Storage  
✅ Backend Deployment on Render  
✅ PostgreSQL Database Connectivity  

---

# Project Structure

HospitalManagementBackend/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ ├── resources/
│ │ │ └── application.properties
│ │
│ └── test/
│
├── pom.xml
├── Dockerfile
└── README.md

---

# API Endpoints

## Get All Patients

GET /patients

Example:

https://your-render-url.onrender.com/patients

---

## Live Backend Site
https://hospitalmanagementbackend-959x.onrender.com/patients

## Add Patient

POST /patients

Sample JSON:

```json
{
  "name": "Vansh",
  "age": 21,
  "disease": "Fever"
}
