# Car Booking System

A simple Java console application for managing car bookings, users, and available vehicles.

## Overview

This project demonstrates a basic booking system where users can:

- view available cars
- view electric cars
- book a car for a user
- view all bookings
- view user-specific booking history
- view all registered users

The application is organized into packages for bookings, cars, and users, with a small menu-driven console interface.

## Project Structure

```text
CarBookingSystem/
├── src/
│   ├── Main.java
│   ├── Booking/
│   │   ├── CarBooking.java
│   │   ├── CarBookingDao.java
│   │   └── CarBookingService.java
│   ├── carPackage/
│   │   ├── Car.java
│   │   ├── carDao.java
│   │   └── carService.java
│   └── userPackage/
│       ├── user.java
│       ├── userDao.java
│       └── UserService.java
├── CarBookingSystem.iml
└── README.md
```

## Main Features

- Car inventory management
- User management
- Booking creation
- Filtering electric cars
- Listing all bookings and user bookings
- Console-based interaction using a menu

## Technologies

- Java
- Standard Java collections and classes
- Package-based project structure

## How to Run

1. Open the project in an IDE such as IntelliJ IDEA or VS Code.
2. Make sure the Java SDK is installed.
3. Run the `Main` class from the `src` package.
4. Use the console menu to interact with the application.

## Notes

This project is a learning/demo project and is best suited for understanding basic Java OOP, package organization, and simple data-driven application design.
