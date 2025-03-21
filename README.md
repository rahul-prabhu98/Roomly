# Roomly - A hotel booking and management system
## Overview
This project is a Hotel Booking and Management Platform built using Spring Boot (Java) for the backend and MySQL for data storage. The platform allows users to search for rooms, make bookings, manage their reservations, and perform administrative tasks.

## Features
### User Features
- **Room Search & Filtering**: Users can search and filter rooms by type and availability.
- **Booking System**: Users can book rooms by selecting check-in and check-out dates, along with guest details.
- **Booking Confirmation**: Users receive a unique booking confirmation code for verification.
- **Profile Management**: Users can view and manage their booking history.
- **Authentication**: Secure login and registration system.

### Admin Features
- **Room Management**: Admins can add, edit, or delete rooms.
- **Booking Management**: Admins can manage user bookings.
- **User Authentication**: Admins can log in with specific privileges.

### Tech Stack
- **Spring Boot**: Java-based backend framework.
- **Spring Security**: For authentication and authorization.
- **JWT (JSON Web Token)**: For secure user authentication.
- **MySQL**: Relational database for storing user, room, and booking details.

### System Architecture
- **User Entity**: Stores user details including email, phone number, password, and role.
- **Room Entity**: Stores room details such as type, price, photo URL, and bookings.
- **Booking Entity**: Manages reservations with check-in/check-out dates, guest details, and confirmation codes.
- **Authentication Layer**: Uses JWT for user authentication.
- **Database Layer**: Uses Spring Data JPA to interact with MySQL.
