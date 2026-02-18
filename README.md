#  Online Pizzeria

A desktop Java Swing application for managing online pizza orders using a MySQL database.

---

##  Project Description

Online Pizzeria is a layered Java application that simulates a real-world pizza ordering system.  
The application allows users to register, log in, browse pizzas, create orders, and view order details.  
An administrator can review all placed orders.

The project demonstrates the use of:

- Java Swing (GUI development)
- JDBC (database connectivity)
- MySQL database
- DAO design pattern
- Layered architecture (GUI → DAO → Model)

---

##  Technologies Used

- Java (JDK 8+)
- Java Swing
- MySQL
- JDBC
- NetBeans IDE
- Git & GitHub

---

##  Project Structure

```
src/
 ├── dao/        → Data Access Objects (database operations)
 ├── model/      → Entity classes (User, Pizza, Order, OrderItem)
 ├── gui/        → Graphical User Interface forms
 ├── util/       → Utility classes (DBConnection)
 └── resources/  → Images and application resources
```

---

##  Database Setup

Database name:

```
picerija
```

The SQL dump file is included in the project:

```
picerija.sql
```

---

## ⚙ Installation & Setup

###  Clone the repository

```bash
git clone https://github.com/zeljkomarkovic1303/online_pizzeria.git
```

or download the ZIP file from GitHub.

---

###  Create the database

1. Open phpMyAdmin or MySQL Workbench
2. Create a new database:

```
picerija
```

3. Import the provided `picerija.sql` file

---

###  Configure database connection

Open:

```
util/DBConnection.java
```

Verify or update the connection settings:

```java
String url = "jdbc:mysql://localhost:3306/picerija";
String user = "root";
String password = "";
```

Modify them according to your local MySQL configuration.

---

###  Run the application

Open the project in NetBeans and click:

```
Run Project
```

---

##  User Roles

### User
- Register account
- Log in
- Browse pizzas
- Create orders
- View order details

### Admin
- View all orders
- Inspect order details

---

##  Architecture Overview

The project follows a simple layered architecture:

- **GUI Layer** → Handles user interaction
- **DAO Layer** → Executes SQL queries
- **Model Layer** → Represents database entities
- **Utility Layer** → Manages database connection

---

##  Requirements

- JDK 8 or newer
- MySQL Server
- MySQL Connector (JDBC driver)
- NetBeans IDE (recommended)

---

##  Academic Purpose

This project was developed as a university assignment to demonstrate:

- Desktop GUI development
- Database integration
- Use of JDBC
- DAO pattern implementation
- Clean project structure

---

##  Future Improvements

- Improve UI styling
- Add order status tracking
- Add input validation improvements
- Implement role-based authentication
- Export reports functionality

---

##  License

This project is developed for educational purposes.
