# CLSU Athelete Monitoring System
## Prepared by Group 11
Norlito Domingo jr,
Yuri Padua,
Angelo M. Ogena
## Project Overview
A desktop application for managing athlete information at CLSU (Central Luzon State University). The system provides a user-friendly interface for storing, updating, and managing athlete records in a database.

## Features
- *CRUD Operations*: Create, Read, Update, and Delete athlete records
- *Form-based Data Entry*: Structured input form for athlete information
- *Data Management*: Efficient storage and retrieval of athlete data

## User Interface Components

### Input Fields
- *Text Fields*: 
  - Student ID (unique identifier)
  - First Name
  - Last Name
  - Address
  
- *Selection Fields*:
  - Age
  - Sex (dropdown)
  - Year Level (dropdown)
  - Sport (dropdown)
  - Course (dropdown)

### Action Buttons
- *Save*: Create new athlete records
- *Update*: Modify existing records
- *Remove*: Delete athlete records

## Database Structure

### MySQL Table: athletes

| Column Name | Data Type | Description |
|-------------|-----------|-------------|
| student_id | VARCHAR/INT | Primary Key, unique identifier |
| first_name | VARCHAR | Athlete's first name |
| last_name | VARCHAR | Athlete's last name |
| address | TEXT | Complete address |
| age | INT | Athlete's age |
| sex | ENUM('M','F') | Gender |
| year_level | INT | Academic year level |
| sport | VARCHAR | Sport discipline |
| course | VARCHAR | Academic course |


### Database Operations
- *CREATE*: INSERT INTO athletes (...) VALUES (...);
- *READ*: SELECT * FROM athletes WHERE sholen_id=?;
- *UPDATE*: UPDATE athletes SET ... WHERE sholen_id=?;
- *DELETE*: DELETE FROM athletes WHERE sholen_id=?;

## Usage Flow
1. *Add New Athlete*: Fill form fields → Click "Save"
2. *View/Edit Athlete*: Search by Sholen ID → Modify data → Click "Update"
3. *Remove Athlete*: Load athlete record → Click "Remove"

## Dependencies
- Java JDK 8+
- MySQL Database
- MySQL Connector/J
- Swing/JavaFX libraries

## Setup Instructions
1. Create MySQL database and athletes table
2. Configure database connection in Java application
3. Compile and run the Java application
4. Use the GUI form to manage athlete recordsw