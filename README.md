#  QA Automation Assignment
>  **Java | Selenium | TestNG | ExtentReports | POM | Maven | Allure Report | Framework Design**

---

### :rocket: Overview
This repository contains my **QA Automation Assignment** created to demonstrate automation testing skills using **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)** structure.  

It automates all five login scenarios and includes a professional **Extent Report** with screenshots for better test analysis.

---

## :computer: Tech Stack  

| Tool / Framework | Purpose |
|------------------|---------|
| **Java** | Programming language used for writing test scripts |
| **Selenium WebDriver** | Automates browser actions and verifies UI functionality |
| **TestNG** | Test framework for organizing and executing tests |
| **Maven** | Dependency management and project build tool |
| **Extent Report / Allure Report** | Generates visually rich test reports |
| **IntelliJ IDEA** | IDE used for project development |

---

### :clipboard: Test Scenarios Automated
| # | Test Case Title | Description | Expected Result |
|:-:|------------------|-------------|-----------------|
| 1 | Login with valid credentials | Enter valid username & password | Redirects to “Logged In Successfully” page |
| 2 | Login with invalid username | Enter wrong username & valid password | Displays “Your username is invalid!” |
| 3 | Login with invalid password | Enter valid username & wrong password | Displays “Your password is invalid!” |
| 4 | Login with blank fields | Leave both fields empty | Shows validation message |
| 5 | Logout functionality | Click logout after successful login | Redirects to login page |

---
## Allure Report Sreenshots

![Login Page](https://github.com/Code-By-Adarsh/Automation-Testing-Projects/blob/79517bae3719b0a3da7f45ac87c8e0987423db04/Project_3_EcomAutomationFramework/All%20Screenshots/Sauce%20Demo%20Login%20Page.png)
---

##  Test Execution Summary

| Metric | Result |
|--------|--------|
| Total Test Cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Skipped | 0 |
| Execution Mode | Sequential |
| Test Report | Allure Report & Extent Report (HTML) |

---

##  Project Structure (POM Framework Layout)

QA-Automation-Assignment/<br>
│<br>
├── src/<br>
│ ├── main/java/<br>
│ │ ├── base/<br>
│ │ │ └── BaseTest.java<br>
│ │ │<br>
│ │ ├── pages/<br>
│ │ │ ├── LoginPage.java<br>
│ │<br>
│ └── test/java/<br>
│ ├── tests/<br>
│ │ ├── LoginTest.java<br>
│ │<br>
│ └── listeners/<br>
│ └── BaseListener.java<br>
│<br>
├── reports/<br>
│ └── ExtentReport.html<br>
| └──Allure Report<br>
│<br>
├── All Screenshots/<br>
│<br>
├── pom.xml<br>
└── testng.xml<br>

---
