Automation Assignment – SauceDemo


This project is an end-to-end automation framework developed for testing the SauceDemo application. It covers both UI and API automation using industry-standard tools and best practices.

---

 Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Cucumber (BDD)
- Rest Assured (API Testing)
- Maven (Build Tool)

---

Framework Design
- Page Object Model (POM) for maintainability
- BDD approach using Cucumber feature files
- Separation of test logic, page objects, and utilities
- Reusable components for scalability

---

Test Coverage
UI Automation
- Login functionality
- Product listing and selection
- Add to cart and checkout flow
- Order placement validation

API Automation
- Request and response validation
- Status code verification
- Payload validation using Rest Assured

---

Execution
To run the tests, use:

```bash
mvn clean test
