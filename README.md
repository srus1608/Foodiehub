# FoodieHub - Full Stack Project


FoodieHub is a **full-stack web application** built using **Spring Boot (Java)** for the backend and **Angular** for the frontend.  
It allows users to manage **restaurants, dishes, and orders** in a professional, interactive UI.


## 🏗️ Features

- Add, list, and manage **restaurants**  
- Add, list, and manage **dishes** for each restaurant  
- Place and view **orders**  
- Responsive UI built with **Bootstrap**  
- Fully functional backend APIs tested with Postman/Thunder Client  
- Layered architecture: **Controller → Service → Repository → Database**


## ⚙️ Tech Stack

- **Backend:** Java 21, Spring Boot, Spring Data JPA, MySQL  
- **Frontend:** Angular 16+, Bootstrap 5, HttpClient  
- **Database:** MySQL  
- **Build Tool:** Maven for backend  
- **Version Control:** Git/GitHub


## 💻 Backend Setup

1. Navigate to the backend folder:

cd backend

2. Update application.properties with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/foodiehub_db
spring.datasource.username=root
spring.datasource.password=your_password

3. Build and run backend:

mvn clean install
mvn spring-boot:run

4. Backend will run on: http://localhost:8080

## 💻 Frontend Setup

1. Navigate to the frontend folder:

  cd frontend


2. Install dependencies:

  npm install

3. Run frontend:
   ng serve --open
   
4. Frontend will run on: http://localhost:4200

## 🔗 API Endpoints
1. Restaurants

GET /api/restaurants → Get all restaurants

POST /api/restaurants → Add restaurant

2. Dishes

GET /api/dishes/restaurant/{id} → Get dishes for restaurant

POST /api/dishes/restaurant/{id} → Add dish

3. Orders

GET /api/orders → Get all orders

POST /api/orders → Place order  

## 🚀 How to Use

Start backend first.

Start frontend second.

Open frontend URL: http://localhost:4200

Navigate using navbar to manage restaurants, dishes, and orders.

Test forms and tables for CRUD operations.
