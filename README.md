# Polyglot Coding Challenges & Algorithms

This repository serves as a comparative study of programming languages and paradigms. It implements the same set of coding challenges and algorithmic problems across multiple languages to demonstrate syntax differences, standard conventions, and testing frameworks.

## Project Overview

The core intention of this project is to provide a Rosetta Stone-like experience for developers, allowing them to see how identical logic is expressed and tested in:

*   **Java** (OpenJDK 17+)
*   **Kotlin** (JVM)
*   **Python** (3.x)
*   **JavaScript** (Node.js)

## Repository Structure

### Core Challenges (Root Directory)
The root directory contains the `APQuiz` series (levels 00-10), which are sets of logic puzzles and algorithmic tasks.
*   **Java:** `APQuizXX.java` (Implementation) & `APQuizXXTest.java` (JUnit Tests)
*   **Kotlin:** `APQuizXX.kt` (Implementation)
*   **Python:** `ap_quiz_packageXX.py` (Implementation & Unittest)
*   **JavaScript:** `ap-quiz-XX.js` (Implementation) & `ap-quiz-XX.test.js` (Jest Tests)

### Paradigm-Specific Modules
*   **`base02-coding-pop_algo`**: Focuses on **Procedural Oriented Programming** and fundamental algorithms (Recursion, Sorting, Searching).
*   **`base03-coding-oop`**: Focuses on **Object-Oriented Programming**, including class structures and GUI applications (JavaFX).
*   **`base04-coding-fop`**: Focuses on **Functional Oriented Programming** concepts.

## Getting Started & Testing

### 1. JavaScript (Node.js & Jest)
*   **Prerequisites:** Node.js and npm installed.
*   **Setup:**
    ```bash
    npm install
    ```
*   **Run Tests:**
    ```bash
    npm test
    # Or specific file
    npx jest ap-quiz-00.test.js
    ```

### 2. Python (Unittest)
*   **Prerequisites:** Python 3.x.
*   **Run Tests:**
    Each package file contains its own tests.
    ```bash
    python ap_quiz_package00.py
    ```

### 3. Java & Kotlin (JUnit 5)
*   **Prerequisites:** JDK and Kotlin compiler.
*   **Setup:** Ensure `junit-1.9.3.jar` (or compatible standalone runner) is present.
*   **Compile & Run (Java Example):**
    ```bash
    # Create output directory
    mkdir out
    
    # Compile
    javac -d out -cp junit-1.9.3.jar APQuiz00.java APQuiz00Test.java
    
    # Run Tests
    java -jar junit-1.9.3.jar --class-path out --scan-classpath
    ```
*   **Compile & Run (Kotlin Example):**
    ```bash
    kotlinc APQuiz00.kt -include-runtime -d out
    # (Requires adding Kotlin runtime to classpath when running tests)
    ```

## Contribution
Feel free to add implementations for missing languages (e.g., C++, Go, Rust) following the existing naming conventions (`ap-quiz-XX`) and ensuring 100% test coverage.