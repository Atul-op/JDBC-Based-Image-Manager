# 🖼️ JDBC Image Manager

This Java application allows you to **insert images into a MySQL database** and later **display them** using their ID. It features a simple Swing-based GUI and is built using **Java + JDBC**.

---

## 🧠 Features

✅ Insert image from local system to MySQL  
✅ Retrieve image by ID and display it in a GUI  
✅ Uses BLOB data type for image storage  
✅ Modular design using helper classes  

---

## 🛠️ Technologies Used

- Java
- Swing (GUI for display)
- JDBC (MySQL Connector)
- MySQL

---

## 🗃️ Database Table Structure

```sql
CREATE TABLE table2 (
    tId INT PRIMARY KEY AUTO_INCREMENT,
    pic LONGBLOB
);
```
Ensure you create this table before running the application.

---

## 🚀 How to Run

1️⃣ Insert Image
- Run InsertImage.java
- Opens a file chooser
- Select an image from your computer
- Image is saved to the MySQL database

2️⃣ Display Image
- Run DisplayImage.java
- GUI opens with a text field and button
- Enter the tId (image serial number)
- Click Show Image
- Image is displayed in a Swing JLabel

---

## 🗝️ Database Configuration

Update your MySQL credentials in ConnectionProvider.java:
```Java
String url = "jdbc:mysql://127.0.0.1:3306/firstdb";
String username = "root";
String password = "ENTER_PASSWORD";
```
---

## ⚠️ Notes

- MySQL Connector/J (mysql-connector-java.jar) must be added to your project classpath
- Supports JPEG, PNG, etc.
- tId is auto-incremented primary key
