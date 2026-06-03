# DSA Lab: Collection Framework Practice

This repository contains the implementation of Data Structures and Algorithms (DSA) Lab tasks focusing on Java's Collection Framework (`TreeSet`, `TreeMap`, and automatic sorting).

## 🚀 Tasks Overview

The project is divided into three main tasks, each demonstrating a different aspect of Java Collections:

### 📑 Task 1: Library Manager
* **Data Structure:** `TreeSet<String>`
* **Description:** Manages a collection of unique book titles. It automatically keeps the book list sorted in alphabetical order and prevents duplicate entries.
* **Key Operations:** Add book, remove book, and check availability.

### 📊 Task 2: Student Score Manager
* **Data Structure:** `TreeMap<String, Integer>`
* **Description:** Maps student names to their respective exam scores. It automatically sorts the student records alphabetically by their names (keys).
* **Key Operations:** Add/update score, remove student, and display sorted performance roster.

### 🎓 Task 3: Course Enrollment Manager
* **Data Structure:** `TreeMap<String, TreeSet<String>>` (Nested Structure)
* **Description:** A robust system where the main map stores Course Names as keys, and each course points to a `TreeSet` containing student names. This ensures courses are sorted, and student rosters within those courses are unique and automatically sorted alphabetically.
* **Key Operations:** Enroll student, drop student, check enrollment status, and display sorted course rosters.

---

## 🛠️ Technology Stack
* **Language:** Java (JDK 8 or higher)
* **IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub

---

## 💻 How to Run the Code

1. Clone this repository to your local machine:
   ```bash
   git clone <your-repository-link>