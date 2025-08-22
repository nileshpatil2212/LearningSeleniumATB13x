# Selenium 4.x Web Automation Learning Repository

Welcome! This repository is dedicated to learning, practicing, and mastering **Web Automation using Selenium 4.x**. The journey will cover all essential concepts, hands-on exercises, and best practices outlined in the attached notes, with practical implementation using Java and its test automation ecosystem.

***

## 📗 What You'll Learn

- **Introduction to Selenium**: Basics, architecture, and setup (Java, Maven, browser drivers).
- **Locators Mastery**: XPath, CSS selectors, ID, Name, Class, LinkText, and advanced locator techniques.
- **WebDriver API**: Core methods for navigation, interaction, window/frame handling, and JavaScript execution.
- **Testing Frameworks**: Integrate TestNG & Allure for robust, report-driven test frameworks.
- **Page Object Model & Page Factory**: Object-oriented test code with maintainability and scalability principles.
- **Waits in Selenium**: Implicit, explicit, and fluent waits for handling dynamic pages.
- **Special Scenarios**:
    - Handling dropdowns (static/dynamic), alerts, checkboxes, radio buttons
    - Web tables (static/dynamic), pagination automation
    - File upload, window & iframe management
    - SVG & Shadow DOM element automation
    - Relative Locators introduced in Selenium 4
- **Advanced Integrations**: Data-driven testing (Apache POI), logging with Log4j, CI with Jenkins, parallel execution, Docker & cloud tunnels (BrowserStack, Selenium Grid).
- **Assignments & Projects**: Stepwise assignments (like VWO login automation), project structure guidelines, and utility files for real-world learning.

***

## 📁 Project Structure

```
.
├── src/
│   ├── main/
│   └── test/
│       ├── java/
│       │   └── [Your implementation files]
│       └── resources/
│           ├── log4j2.properties
│           ├── test-data/
│           └── config.properties
├── pom.xml
├── README.md
└── [Supporting files: Jenkins, Docker configs, etc.]
```

***

## 🖥️ Getting Started

1. **Clone the repository.**
2. **Set up Java and Maven** on your system.
3. **Add browser drivers** or use Selenium 4.6.0+ (which can auto-download drivers).
4. **Install IDE**: IntelliJ IDEA or Eclipse recommended.
5. **Set up your project** using Maven (dependencies for Selenium, TestNG, POI, Allure, Log4j, etc).
6. **Explore and implement** each concept step by step as outlined in your notes.

***

## 🚦 Assignments

- **VWO.com Login Automation (Valid/Invalid Scenarios)**
- **Dynamic Table Data Extraction**
- **SVG & Shadow DOM Interaction**
- **Parallel Test Execution**
- **Allure Reports Generation & Jenkins CI Integration**
- **Handling Cloud, Docker, and Grid-based execution**

> Complete each module's assignment and push code with clear commit messages. Attach Allure/Screenshot evidence of successful runs.

***

## 📚 Reference Material

- **Attached PDF**: "Mastering Web Automation with Selenium" – follow this as your main syllabus.
- Official Documentation & Blog Links included in notes.
- [Mockaroo for Test Data](https://www.mockaroo.com/)
- [SelectorsHub](https://selectorshub.com/) for XPath and CSS

***

## 🏆 Tips for Success

- Maintain a modular and readable codebase (use Page Object Model).
- Keep configurations (URLs, credentials, test data) externalized.
- Leverage logging and reporting for traceability and debugging.
- Regularly commit and push your progress to GitHub.
- Document new learnings, issues, and solutions as code comments or issues.

***

## 🤝 Contributing & Tracking Progress

- Fork, branch, and create PRs as you work through exercises.
- Keep a checklist or issues log for assignment completion.
- Use GitHub Projects or a Trello board for Kanban-style task management.

***

## 🧩 License

This repository is for educational, non-commercial use as part of your Selenium learning journey.

