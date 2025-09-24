Gym Management System / E Health Club

Health Hub Club is a comprehensive gym and health club management system designed to automate operations such as member tracking, trainer management, equipment monitoring, and supplement sales. This project provides actionable insights for data-driven decision-making and improves overall operational efficiency.

Table of Contents

Features

Tools & Technologies

System Architecture

Database Setup

Installation Instructions

Screenshots

Future Scope

License

Features

Trainer & Member Management: Add, update, and track trainers and members, monitor attendance, and track drop-outs.

Equipment & Inventory Tracking: Monitor gym equipment and supplement stock levels.

Supplement Marketplace: Support buying and selling of supplements and gym accessories (online/offline).

Analytics & Insights: Generate reports on attendance, sales, and trainer performance.

User-Friendly Interface: Interactive dashboards for staff and management.

Scalable Architecture: Designed to support future online deployment.

Tools & Technologies

Programming Language: Java (OOP for robust, scalable design)

Framework: Java Swing/JavaFX (for GUI development)

Database: MySQL/PostgreSQL (relational database for structured data storage)

Database Connectivity: JDBC (Java Database Connectivity) for seamless interaction with the database

Platform: Desktop application (Windows/Linux)

Version Control: Git & GitHub for source code management

System Architecture
+--------------------+        +------------------+       +---------------------+
|   User Interface   | <----> |   Application    | <-->  |  Database (MySQL)   |
|  (Java Swing/FX)   |        |   Logic (Java)   |       |  Tables: Members,   |
|                    |        |                  |       |  Trainers, Equipment|
+--------------------+        +------------------+       +---------------------+


Users interact via GUI

Application layer handles business logic

Database stores all records with real-time updates via JDBC

Database Setup

Install MySQL or PostgreSQL on your machine.

Create a new database, e.g., health_hub_db.

Create tables:

-- Members table
CREATE TABLE members (
    member_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    membership_type VARCHAR(50),
    join_date DATE,
    status VARCHAR(20)
);

-- Trainers table
CREATE TABLE trainers (
    trainer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    specialization VARCHAR(100),
    contact VARCHAR(20)
);

-- Equipment table
CREATE TABLE equipment (
    equipment_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    quantity INT,
    status VARCHAR(20)
);

-- Supplements table
CREATE TABLE supplements (
    supplement_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    price DECIMAL(10,2),
    stock INT
);


Configure JDBC connection in your Java application:

String url = "jdbc:mysql://localhost:3306/health_hub_db";
String user = "root";
String password = "your_password";
Connection con = DriverManager.getConnection(url, user, password);

Installation Instructions

Clone the repository:

git clone https://github.com/your-username/health-hub-connect.git


Open the project in IDE (Eclipse/IntelliJ).

Add MySQL JDBC driver to project dependencies.

Configure database connection in the application.

Run the Main.java file to launch the application.

Screenshots

Login Page


Dashboard


Trainer Management


Member Management


Supplement Marketplace


Future Scope

Online Deployment: Transform into a full web application with cloud backend.

Payment Integration: Add online payment gateways for memberships and supplements.

Mobile App Version: Create a companion mobile app for members.

Advanced Analytics: Incorporate AI-driven insights on member progress and gym trends.

Why This Project is Important

Automates manual gym operations, reducing errors and saving time.

Provides actionable analytics for trainers and management.

Improves member engagement and retention.

Scalable for future growth and online transformation.
