---
### 📘 **HIBERNATE – DAY 1 NOTES**

## ✅ **1. What is Hibernate?**

Hibernate is a **Java ORM (Object Relational Mapping)** framework that helps you interact with databases using **Java classes instead of SQL queries**.

* ORM = Convert **Java Objects ↔ Database Tables**
* Reduces boilerplate JDBC code
* Database-independent (MySQL, Oracle, PostgreSQL…)
* Handles CRUD automatically
---

## ✅ **2. Why Use Hibernate?**

### 🔥 **Advantages**

- No need to write SQL for simple operations
- Automatically handles joins, updates, relations
- Database portability
- Caching (faster queries)
- Lazy loading support
- Transaction management
- Reduces JDBC code

---

## ✅ **3. Important Hibernate Concepts (Basics)**

### 1. **Configuration**

- `hibernate.cfg.xml` file
- Contains DB details (URL, username, password)
- Contains Hibernate properties (dialect, driver, hbm2ddl)

### 2. **SessionFactory**

- Heavy object
- Created only once per application
- Used to create `Session` objects
- Thread-safe

### 3. **Session**

- Represents a connection to the DB
- Used to perform CRUD
- Not thread-safe
- Created from `SessionFactory`

### 4. **Transaction**

- Ensures atomicity
- Start → Commit / Rollback
- Required for save/update/delete

### 5. **Entity Class**

A normal Java class annotated with:

```java
@Entity
@Table(name="employee")
public class Employee {
    @Id
    private int id;
    private String name;
}
```

---

## ✅ **4. Hibernate Architecture (Simple Explanation)**

```
[Java App]
     ↓
 Configuration → SessionFactory
     ↓
    Session
     ↓
 Transaction
     ↓
   Database
```

---

## ✅ **5. Important Hibernate Properties**

### In `hibernate.cfg.xml`

```xml
<property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
<property name="hibernate.hbm2ddl.auto">update</property>
<property name="hibernate.show_sql">true</property>
```

### `hbm2ddl.auto` Options:

- `create` → Drops + creates table every run
- `update` → Only updates schema (safe)
- `create-drop` → Creates then drops when sessionFactory closes
- `validate` → Only validates schema

---

## ✅ **6. First Hibernate Program Flow**

1. Create entity class (Student.java)
2. Create `hibernate.cfg.xml`
3. Create main class
4. Build SessionFactory
5. Open Session
6. Begin transaction
7. Save object
8. Commit
9. Close session

---

## ✅ **7. Sample Hibernate Code (Beginner Friendly)**

### ✔ Entity Class

```java
@Entity
@Table(name="student")
public class Student {

    @Id
    private int id;
    private String name;

    // getters & setters
}
```

### ✔ Main Class

```java
public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Student st = new Student();
        st.setId(1);
        st.setName("Shubh");

        session.save(st);
        tx.commit();

        session.close();
        factory.close();
    }
}
```

---

## ⭐ **That’s all for Day 1!**

Covers:
✔ ORM
✔ Why Hibernate
✔ Basic Architecture
✔ Core Components
✔ hibernate.cfg.xml
✔ First Program
