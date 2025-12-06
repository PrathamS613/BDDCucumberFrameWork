# 🌿 Cucumber BDD Automation Framework

This repository contains a **Cucumber BDD Automation Framework** developed using **Java**, **Selenium WebDriver**, **Cucumber**, **Page Object Model (POM)**, **Data-Driven Testing**, and **TestNG**.

It supports **feature files**, **step definitions**, **hooks**, **properties files**, and **Excel data**, enabling a clean, scalable, and reusable automation structure.

---

## ✅ Key Features

### 🟢 **1. Cucumber BDD**

* Gherkin-based **feature files** (Given–When–Then format)
* Step definition mapping for each scenario
* Hooks (`@Before`, `@After`) for setup and teardown
* Scenario tagging, grouping & parallel execution

### 🟢 **2. Page Object Model (POM)**

* Clean separation of UI elements and actions
* Easy maintenance and high reusability

### 🟢 **3. Data-Driven Framework**

* Test data stored in **Excel files**
* Apache POI-based Excel Reader
* Supports scenario outlines and external data feeding

### 🟢 **4. Hybrid Integration**

* Framework combines:
  ✔ Cucumber BDD
  ✔ POM
  ✔ TestNG
  ✔ Data-Driven
  ✔ Properties-driven configuration

### 🟢 **5. TestNG Integration**

* Parallel execution via `testng.xml`
* Grouping & parameterization
* HTML test reports

### 🟢 **6. Properties File Support**

* Central configuration stored in **config.properties**
* Includes base URL, browser, credentials, timeouts, etc.

### 🟢 **7. Utilities Included**

* WebDriver Factory
* Excel Utility
* Screenshot Utility
* Logger (optional)
* Wait Helpers
* Reusable Common Functions

---

## 📂 Project Structure

```
📦 CucumberBDDFramework
 ┣ 📂 src/main/java
 │  ┣ 📂 base
 │  ┣ 📂 pages
 │  ┣ 📂 utilities
 │  ┣ 📂 config
 ┣ 📂 src/test/java
 │  ┣ 📂 stepDefinitions
 │  ┣ 📂 hooks
 │  ┣ 📂 runners
 │  ┣ 📂 features
 │  ┣ 📂 dataProviders
 ┣ 📂 testData
 │  ┗ TestData.xlsx
 ┣ 📄 testng.xml
 ┣ 📄 config.properties
 ┣ 📄 pom.xml
 ┗ 📄 README.md
```

---

## 🛠️ Tools & Technologies

| Tool                        | Purpose                       |
| --------------------------- | ----------------------------- |
| **Java**                    | Programming language          |
| **Selenium WebDriver**      | Browser automation            |
| **Cucumber (Gherkin)**      | BDD test writing              |
| **TestNG**                  | Test execution & reporting    |
| **Apache POI**              | Excel data handling           |
| **Maven**                   | Build & dependency management |
| **POM (Page Object Model)** | Framework design              |
| **Properties Files**        | Centralized configuration     |

---

## ▶️ Running the Framework

### **1️⃣ Clone Repository**

```bash
git clone https://github.com/your-username/your-repository.git
```

### **2️⃣ Install Dependencies**

```bash
mvn clean install
```

### **3️⃣ Run Tests Using Maven**

```bash
mvn test
```

### **4️⃣ Run Through TestNG**

```
testng.xml
```

### **5️⃣ Run Specific Cucumber Runner**

```bash
Right-click → Run 'TestRunner.java'
```

---

## 📊 Reports

* Cucumber HTML Reports
* TestNG Default HTML Reports
* Screenshot capture on failure
* Logs for debugging

---

## ⭐ Contribution Guidelines

Pull requests are welcome!
Feel free to open issues or suggest enhancements.

---

## 🌟 Support

If you find this framework useful, please ⭐ star this repository!
