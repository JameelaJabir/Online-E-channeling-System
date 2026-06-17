# 🏥 DocDirect -- Online E-Channeling System

## 📌 Project Overview

**DocDirect** is a web-based Online E-Channeling System developed for
the **Object-Oriented Programming (OOP) Module -- Year 2 Semester 1**.

The system connects patients with healthcare providers through a
centralized digital platform, enabling online appointment booking, lab
test scheduling, and medicine ordering. It streamlines hospital
management processes while improving accessibility and efficiency for
users.

------------------------------------------------------------------------

## 🎯 Objectives

-   Provide a seamless platform for online doctor appointment booking
-   Enable digital lab test scheduling and medicine ordering
-   Reduce manual administrative workload in hospitals
-   Improve healthcare accessibility and efficiency
-   Implement object-oriented principles in a real-world application

------------------------------------------------------------------------

## 🛠️ Technologies Used

-   **Java (Servlets & JSP)** -- Backend development
-   **HTML** -- Page structure
-   **CSS** -- Styling and layout
-   **Bootstrap 4** -- Responsive design framework
-   **JavaScript** -- Client-side interactivity
-   **MySQL** -- Database management
-   **JSTL** -- Dynamic content rendering in JSP
-   **Apache Tomcat 9** -- Application server

------------------------------------------------------------------------

## 🏗️ System Architecture

The application follows the **MVC (Model-View-Controller)** pattern with a layered structure:

-   **Presentation Layer** -- JSP pages with JSTL, HTML, CSS, Bootstrap
-   **Controller Layer** -- Java Servlets handle HTTP requests and responses
-   **Service / DAO Layer** -- `HospitalDBUtil` abstracts all database operations
-   **Model Layer** -- Plain Java classes (e.g., `Hospital`) with encapsulation
-   **Data Layer** -- MySQL Database via JDBC
-   **Server Environment** -- Apache Tomcat 9

------------------------------------------------------------------------

## 🔒 Security

-   **No hardcoded credentials** -- Database credentials are stored in an external `db.properties` file (excluded from version control via `.gitignore`)
-   **SQL Injection prevention** -- All database queries use `PreparedStatement` with parameterized inputs instead of string concatenation
-   **Safe setup** -- A `db.properties.example` template is provided for new developers to configure their own credentials

------------------------------------------------------------------------

## ⚙️ Installation & Setup

### 1️⃣ Install Requirements

-   JDK 17 or higher
-   Apache Tomcat 9
-   MySQL Database
-   Eclipse IDE (Dynamic Web Project support)

------------------------------------------------------------------------

### 2️⃣ Clone the Repository

```
git clone https://github.com/JameelaJabir/Online-E-channeling-System.git
```

------------------------------------------------------------------------

### 3️⃣ Configure Database Credentials

1.  Navigate to `src/main/java/`
2.  Copy `db.properties.example` and rename it to `db.properties`
3.  Fill in your MySQL credentials:

```
db.url=jdbc:mysql://localhost:3306/channelling
db.user=your_db_username
db.password=your_db_password
```

> ⚠️ `db.properties` is gitignored and must never be committed.

------------------------------------------------------------------------

### 4️⃣ Set Up the Database

1.  Open MySQL and create a database named `channelling`
2.  Create the `hospital` table:

```sql
CREATE TABLE hospital (
    hName           VARCHAR(100),
    hAddress        VARCHAR(255),
    hContactNumber  VARCHAR(20),
    hEmail          VARCHAR(100),
    hLicenseNumber  VARCHAR(50) PRIMARY KEY,
    hWorkinghours   VARCHAR(100)
);
```

------------------------------------------------------------------------

### 5️⃣ Deploy to Tomcat

1.  Import the project into Eclipse as a Dynamic Web Project
2.  Add the project to your Tomcat 9 server
3.  Start Tomcat
4.  Access the application at:

```
http://localhost:8080/Online-E-channeling-System
```

------------------------------------------------------------------------

## 📚 Learning Outcomes

Through this project, we strengthened our knowledge in:

-   Object-Oriented Programming concepts (encapsulation, abstraction)
-   Java Servlet and JSP development
-   MVC and DAO architectural patterns
-   Database integration with MySQL via JDBC
-   Security best practices (PreparedStatement, credential management)
-   Team collaboration and leadership

------------------------------------------------------------------------

## 🚀 Future Enhancements

-   Role-based authentication and access control (RBAC)
-   SMS and email appointment notifications
-   Online video consultation integration
-   Enhanced data analytics dashboard
-   Mobile-responsive UI improvements

------------------------------------------------------------------------

## 📄 License

This project was developed for academic purposes only.
