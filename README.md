# 🧪 Meevo1 Automated Navigation Test

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-Automation-brightgreen)](https://www.selenium.dev/)
[![JUnit](https://img.shields.io/badge/JUnit-Test_Framework-red.svg)](https://junit.org/)
[![Build Passing](https://img.shields.io/badge/build-passing-brightgreen)]()

## 📌 Project Description

**Meevo1 Automated Navigation Test** is a lightweight Java-based Selenium test designed to verify top-level navigation on the [Meevo](https://www.meevo.com/) marketing website.

This script performs an end-to-end user flow:
- Accepts the cookie consent
- Navigates to **Company → Careers**
- Clicks on **“See all open positions”**
- Verifies that the page contains the text **"Current Openings"**
- Handles tab switching and validates content

The test is built for demo and learning purposes and demonstrates dynamic waits, scrolling, assertions, and multi-tab handling using `Selenium WebDriver`, `JUnit`, and `WebDriverManager`.

---

## ⚙️ Technologies & Tools

- Java 17  
- Selenium WebDriver  
- JUnit 5  
- Maven  
- WebDriverManager  
- ChromeDriver  
- IntelliJ IDEA  
- Git & GitHub  
- Thread.sleep (for demo timing)  

---

## 📁 Project Structure

Meevo1/
│
├── src/test/java/
│ └── Test.java # Main test class
│
├── pom.xml # Maven dependencies
└── README.md # Project overview and usage

---

## 🔍 Features Covered

- Website launch and cookie modal handling
- Dynamic menu interaction: **Company → Careers**
- XPath optimization and element waits
- Tab switching and content validation
- Output logs for each test step

---

## 👩‍💻 Author

**Elena Odnodvortseva**  
QA Automation Engineer | [GitHub](https://github.com/Elenochka01)
