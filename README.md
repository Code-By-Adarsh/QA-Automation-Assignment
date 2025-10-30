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
## Allure Report Screenshots
### Behaviour Section
![Behaviour Section](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/18127dee8648aea1cd1e8c8ad1c68ed8d0b6f7f1/All%20Screenshots/allure%20behaviour%20section.png )

### Category Section
![Category Section](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/18127dee8648aea1cd1e8c8ad1c68ed8d0b6f7f1/All%20Screenshots/allure%20category%20section.png )

### Duration Graph
![Duration Graph](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/18127dee8648aea1cd1e8c8ad1c68ed8d0b6f7f1/All%20Screenshots/allure%20duration%20graph.png )

### Package Secion
![Package Section](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/18127dee8648aea1cd1e8c8ad1c68ed8d0b6f7f1/All%20Screenshots/allure%20packages%20section.png )

### Dashboard Section
![Dashboard](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/18127dee8648aea1cd1e8c8ad1c68ed8d0b6f7f1/All%20Screenshots/allure%20report%20dashboard.png )

### Severity Graph
![Severity Graph](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/18127dee8648aea1cd1e8c8ad1c68ed8d0b6f7f1/All%20Screenshots/allure%20severity%20graph.png )

### Status
![Status](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/18127dee8648aea1cd1e8c8ad1c68ed8d0b6f7f1/All%20Screenshots/allure%20status.png )

### Suites Section
![Suite Section](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/18127dee8648aea1cd1e8c8ad1c68ed8d0b6f7f1/All%20Screenshots/allure%20suite%20section.png)

### Timeline Section
![Timeline Section](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/18127dee8648aea1cd1e8c8ad1c68ed8d0b6f7f1/All%20Screenshots/allure%20timeline%20section.png )

---

## Extent Report Screenshots
### Dashboard
![Dashboard](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/43123481a819d526c27f6994f8df2cc031e55b4b/All%20Screenshots/extent%20report%20dashboard.png )

### Environment
![Environment](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/43123481a819d526c27f6994f8df2cc031e55b4b/All%20Screenshots/extent%20report%20environment.png )

### Summary
![Summary](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/43123481a819d526c27f6994f8df2cc031e55b4b/All%20Screenshots/extent%20report%20summary.png )

### Timeline
![Timeline](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/43123481a819d526c27f6994f8df2cc031e55b4b/All%20Screenshots/extent%20report%20timeline.png )

---

## IntelliJ Idea Ouput
![Output](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/43123481a819d526c27f6994f8df2cc031e55b4b/All%20Screenshots/IntelliJ%20Idea%20Output.png)

---

## Testng HTML Report
![Html Report](https://github.com/Code-By-Adarsh/QA-Automation-Assignment/blob/43123481a819d526c27f6994f8df2cc031e55b4b/All%20Screenshots/testng%20default%20html%20report.png)

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

### :gear: How to Run the Project

#### **1. Clone the Repository**
```bash
git clone https://github.com/Code-By-Adarsh/QA-Automation-Assignment.git
```
#### **2. Open it in IntelliJ Idea and other IDE's**
#### **3. Download Mvn and Allure**
#### **4. Set that in System variable**
#### **5. Run in IDE's through testng.xml**
#### **6. Give command in CLI**
```bash
allure serve allure-results
```

---

## :handshake: Author

Adarsh Jayprakash Mishra<br>
🎓 B.Sc Computer Science | QA Automation Enthusiast
