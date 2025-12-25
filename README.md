# Blood Bank Management System

> **Database-Driven Blood Bank Management System**

A comprehensive blood bank management system built with Java, designed to manage blood inventory, donor records, and blood requests efficiently.

![Project Status](https://img.shields.io/badge/status-active-success)
![License](https://img.shields.io/badge/license-MIT-blue)
![Java](https://img.shields.io/badge/Java-ED8B00?logo=java&logoColor=white)

---

## 🎯 Project Overview

The Blood Bank Management System is a Java-based application that helps manage blood bank operations, including donor management, blood inventory tracking, and request handling.

### ✨ Key Features

- 🩸 **Blood Inventory Management** - Track blood units by type and availability
- 👤 **Donor Management** - Register and manage donor information
- 📋 **Request Management** - Handle blood requests and approvals
- 📊 **Reports** - Generate inventory and donor reports
- 🔍 **Search & Filter** - Quick search for donors and blood units
- 📱 **User-Friendly Interface** - Intuitive GUI design

---

## 🛠️ Tech Stack

- **Java** - Core programming language
- **Java Swing/AWT** - GUI framework
- **MySQL** - Database management
- **JDBC** - Database connectivity

---

## 📋 Prerequisites

- Java JDK (8 or higher)
- MySQL Server
- IDE (Eclipse, IntelliJ IDEA, or NetBeans)
- MySQL Connector/J

---

## 🔧 Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/Nikhitha-spec/Blood-Bank-Management-system.git
cd Blood-Bank-Management-system
```

### 2. Database Setup

1. Create a MySQL database:
```sql
CREATE DATABASE blood_bank_db;
```

2. Import the database schema (if provided)

3. Update database credentials in the configuration file

### 3. Configure Database Connection

Update the database connection details in the source code:
- Host: localhost
- Port: 3306
- Database: blood_bank_db
- Username: your_username
- Password: your_password

### 4. Run the Application

```bash
javac *.java
java Main
```

Or use your IDE to run the project.

---

## 📁 Project Structure

```
Blood-Bank-Management-system/
├── src/
│   ├── models/           # Data models
│   ├── views/            # GUI components
│   ├── controllers/      # Business logic
│   ├── database/         # Database connection
│   └── utils/            # Utility classes
├── database/             # SQL scripts
├── README.md
└── .gitignore
```

---

## 🚀 Features

### Donor Management
- Register new donors
- View donor information
- Update donor details
- Donor history tracking

### Blood Inventory
- Add blood units
- Track blood types (A+, A-, B+, B-, AB+, AB-, O+, O-)
- Monitor expiration dates
- Inventory status

### Request Management
- Create blood requests
- Approve/reject requests
- Track request history
- Automatic inventory updates

### Reports
- Donor reports
- Inventory reports
- Request reports
- Statistics dashboard

---

## 🗄️ Database Schema

### Tables
- `donors` - Donor information
- `blood_inventory` - Blood unit records
- `requests` - Blood request records
- `users` - System users

---

## 📝 Usage

1. **Login** - Use admin credentials to access the system
2. **Manage Donors** - Add and manage donor records
3. **Manage Inventory** - Track blood units
4. **Handle Requests** - Process blood requests
5. **Generate Reports** - View various reports

---

## 🔒 Security Features

- User authentication
- Role-based access control
- Data validation
- Secure database connections

---

## 🤝 Contributing

Contributions are welcome! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

---

## 📝 License

This project is licensed under the MIT License.

---

## 👥 Author

**Nikhitha Talari**
- GitHub: [@Nikhitha-spec](https://github.com/Nikhitha-spec)
- LinkedIn: [Nikhitha Talari](https://www.linkedin.com/in/nikhitha-talari)

---

## 🙏 Acknowledgments

- Java community
- MySQL documentation
- All contributors

---

<div align="center">
  <p>⭐ If you like this project, give it a star! ⭐</p>
  <p>Made with ❤️ by Nikhitha Talari</p>
</div>

