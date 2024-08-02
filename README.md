# Selenium Web Project

## Overview
The Kasir demo website is a simulation platform for a cashier system that allows users to try and test various features such as adding products, managing inventory, and processing sales transactions. It is particularly useful for software developers and testers to practice and validate the functionalities of a cashier application.

## Tools and Technologies
- **Java 11**: The programming language used for writing the test scripts.
- **Maven**: Build automation tool used for managing project dependencies and running tests.
- **IntelliJ IDEA**: Integrated Development Environment (IDE) used for development.
- **Cucumber for Java**: Plugin for IntelliJ IDEA that supports Cucumber, enabling BDD testing with Gherkin syntax.

## Getting Started

### Prerequisites
- **Java 11**: Make sure Java 11 is installed on your system.
- **Maven**: Ensure Maven is installed and properly configured.
- **IntelliJ IDEA**: Recommended IDE for development.
- **Cucumber for Java plugin**: Install the Cucumber for Java plugin in IntelliJ IDEA.

### Installation
1. **Clone the repository**:
   ```bash
   git clone github.com/Hary1620/Selenium-KasirDemo.git
   cd Selenium-KasirDemo
2. **Open the project in IntelliJ IDEA**:
Open IntelliJ IDEA.
Select File > Open and navigate to the ALTA-Selenium directory.
IntelliJ IDEA will automatically detect the Maven project and import dependencies.
3. **Install dependencies**:
Maven will automatically download and install the necessary dependencies specified in the pom.xml file.

### Running the test
* To run the tests, use the Maven command:
```shell
mvn clean verify
```

