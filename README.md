# 📚 Book Bank Management System

A desktop **library/book-bank management system** built with **Java Swing** and **SQLite**.  
It helps admins manage books and students, issue books, and process returns through a simple GUI.

---

## ✨ Features

- 🔐 Admin login
- 📖 Manage books (add, update, delete, list)
- 👨‍🎓 Manage students (add, update, delete, list)
- 📤 Issue books to students
- 📥 Return books and update availability
- 🗄️ SQLite-backed persistent storage

---

## 🛠️ Tech Stack

- **Language:** Java 8
- **UI:** Java Swing (NetBeans GUI forms)
- **Database:** SQLite
- **Build Tool:** Apache Ant (NetBeans J2SE project)

---

## 📁 Project Structure

```text
book-bank-oose/
├── src/book_bank/
│   ├── Admin_Login.java
│   ├── Book_Bank_Dashboard.java
│   ├── Manage_Books.java
│   ├── Manage_Students.java
│   ├── Issue_Book.java
│   ├── Return_Book.java
│   └── DBConnection.java
├── Book_Bank.db
├── build.xml
└── nbproject/
```

---

## 🚀 Getting Started

### Prerequisites

- JDK 8+ installed
- Apache Ant installed
- SQLite JDBC driver (`sqlite-jdbc-3.51.1.0.jar`)

### Database

This repository includes a sample SQLite database file:

- `Book_Bank.db`

> **Important:** `DBConnection.java` currently points to an absolute local path.  
> Update the JDBC URL in `src/book_bank/DBConnection.java` to your local database path (or to this repo’s `Book_Bank.db`).

---

## ▶️ Build & Run

From the repository root:

```bash
ant clean
ant compile
ant test
```

To run from NetBeans:

1. Open the project folder in NetBeans.
2. Ensure the SQLite JDBC JAR is added to project libraries.
3. Run the app (start from `Admin_Login` if needed).

---

## 🧭 Main Modules

- **Admin_Login**: Authenticates admin users.
- **Book_Bank_Dashboard**: Main navigation screen.
- **Manage_Books**: CRUD operations for books.
- **Manage_Students**: CRUD operations for students.
- **Issue_Book**: Records issued books and reduces availability.
- **Return_Book**: Handles return flow and increases availability.
- **DBConnection**: SQLite connection utility.

---

## 🤝 Contributing

Contributions, issues, and suggestions are welcome.  
Feel free to fork the repo and open a pull request.

---

## 📄 License

No license file is currently defined in this repository.

