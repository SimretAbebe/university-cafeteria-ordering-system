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
