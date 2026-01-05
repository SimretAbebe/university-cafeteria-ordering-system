# University Cafeteria Ordering System

## Overview

The **University Cafeteria Ordering System** is a Java-based object-oriented programming project designed to simulate a food ordering system for university students. The system demonstrates fundamental object-oriented programming (OOP) principles through a practical implementation of cafeteria management, food ordering, and payment processing.

## Problem Statement

University cafeterias often face challenges in managing food orders, calculating costs, and processing payments efficiently. Students need a streamlined system to browse menus, place orders, and complete transactions. This project addresses these challenges by implementing a comprehensive ordering system that emphasizes clean OOP design and demonstrates core programming concepts suitable for academic study.

## Features

### Core Functionality
- **Multi-Cafeteria Support**: Students can choose from multiple cafeteria locations
- **Dynamic Menu Management**: Each cafeteria maintains its own collection of food items
- **Order Processing**: Students can select multiple food items and create orders
- **Cost Calculation**: Automatic calculation of total order costs
- **Payment Processing**: Simple cash payment mechanism with validation
- **Order Management**: Complete order lifecycle from creation to completion

### User Management
- **Student Registration**: Student accounts with unique identifiers
- **Staff Management**: Cafeteria staff accounts for system management
- **User Authentication**: Basic user identification and validation

## Object-Oriented Programming Concepts Demonstrated

### 1. Abstraction
- **User Class**: Abstract base class defining common user behavior
- **Payment Interface**: Defines payment contract without implementation details
- **performAction() Method**: Abstract method implemented differently by subclasses

### 2. Inheritance
- **Student extends User**: Inherits common user properties while adding student-specific attributes
- **Staff extends User**: Inherits user functionality with staff-specific behavior
- **CashPayment implements Payment**: Implements payment interface with cash-specific logic

### 3. Encapsulation
- **FoodItem Class**: Private attributes (name, price) accessed through public getters
- **Cafeteria Class**: Private menu collection managed through controlled methods
- **Order Class**: Private order items with public interface for order management

### 4. Polymorphism
- **Payment Interface**: Multiple payment types can be used interchangeably
- **Runtime Polymorphism**: Same method calls behave differently based on actual object type
- **Method Overriding**: Student and Staff classes override User methods

### 5. Object Interaction & Relationships
- **Association**: Order objects interact with FoodItem objects
- **Aggregation**: Cafeteria objects contain collections of FoodItem objects
- **Composition**: User objects are composed of various attributes and behaviors

## System Architecture & UML Diagram

### Class Diagram Overview
```
User (Abstract)
├── Student
└── Staff

Payment (Interface)
└── CashPayment

Cafeteria ────▶ FoodItem (Aggregation)
Order ───────▶ FoodItem (Association)
```

### Key Relationships
- **User Hierarchy**: Abstract User class with concrete Student and Staff implementations
- **Cafeteria-FoodItem**: Aggregation relationship (cafeteria "has" food items)
- **Order-FoodItem**: Association relationship (order "uses" food items)
- **Payment System**: Interface-based polymorphism for extensible payment methods

## How to Compile and Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line interface (Terminal/Command Prompt)

### Compilation
```bash
# Navigate to project directory
cd university-cafeteria-ordering-system

# Compile all Java files
javac *.java
```

### Execution
```bash
# Run the main application
java Main
```

### Expected Output
The system will demonstrate:
1. Cafeteria and menu setup
2. Student account creation
3. Cafeteria selection and menu display
4. Order placement with item selection
5. Cost calculation and payment processing
6. Complete transaction summary

## Technologies Used

- **Programming Language**: Java (Object-Oriented Programming)
- **Development Environment**: Any Java IDE or command-line compiler
- **Design Patterns**: Interface-based polymorphism, inheritance hierarchies
- **Data Structures**: ArrayList for dynamic collections
- **Architecture**: Layered architecture with separation of concerns

## Project Structure

```
university-cafeteria-ordering-system/
├── User.java              # Abstract user class
├── Student.java           # Student user implementation
├── Staff.java             # Staff user implementation
├── Cafeteria.java         # Cafeteria management
├── FoodItem.java          # Food item representation
├── Order.java             # Order processing
├── Payment.java           # Payment interface
├── CashPayment.java       # Cash payment implementation
├── Main.java              # Application entry point
└── README.md              # Project documentation
```

## Learning Outcomes

This project provides hands-on experience with:
- Implementing abstract classes and interfaces
- Understanding inheritance hierarchies
- Applying encapsulation principles
- Demonstrating polymorphism in practice
- Designing object relationships and interactions
- Creating maintainable and extensible code

## Future Enhancements

- Multiple payment methods (credit card, mobile payment)
- Graphical user interface (GUI)
- Database integration for persistent storage
- Advanced order management features
- User authentication and authorization
- Menu customization and inventory management

## Author

**Project Developer**  
Undergraduate Computer Science Student  
Bahir Dar University  
Email: [student@university.edu.et]

---

*This project was developed as part of a university-level Object-Oriented Programming course to demonstrate core OOP principles through practical application.*
