# University Event Management
University Event Management project using Spring Boot

## Table of Contents
- [Frameworks and Language Used](#frameworks-and-language-used)
- [Data Flow](#data-flow)
  - [Controller](#controller)
  - [Services](#services)
  - [Repository](#repository)
  - [Database Design](#database-design)
- [Data Structures Used](#data-structures-used)
- [Validation](#validation)
- [Project Summary](#project-summary)
- [Getting Started](#getting-started)
- [Testing Endpoints](#testing-endpoints)
- [License](#license)

## Frameworks and Language Used
- Java
- Spring Boot
- Dependencies:
  - Spring Web
  - Validation
  - H2 DataBase
  - Jakarta Persistence API (JPA)
  - Lombok

## Data Flow

### Controller
The controller package (`com.geekster.universityeventmanagement.controller`) contains the following classes:
- `StudentController`: Handles HTTP requests related to students.
- `EventController`: Handles HTTP requests related to events.

### Services
The services package (`com.geekster.universityeventmanagement.services`) contains the following classes:
- `StudentService`: Provides services related to students.
- `EventService`: Provides services related to events.

### Repository
The repository package (`com.geekster.universityeventmanagement.repository`) contains the following interfaces:
- `IStudentRepo`: Provides CRUD operations for the `Student` entity.
- `IEventRepo`: Provides CRUD operations for the `Event` entity.

### Database Design
The `model` package (`com.geekster.universityeventmanagement.model`) contains the entity classes representing the database tables:
- `Student`: Represents a student with properties such as `studentId`, `firstName`, `lastName`, `age`, and `department`.
- `Event`: Represents an event with properties such as `Id`, `eventName`, `locationOfEvent`, `date`, `startTime`, and `endTime`.

## Data Structures Used
- Enum: `Department` enum represents the different departments a student can belong to.

## Validation
The following validations are implemented using annotations from the `jakarta.validation.constraints` package:
- `Student` entity:
  - `firstName`: Should not be blank and should start with a capital letter.
  - `lastName`: Should not be blank and should start with a capital letter.
  - `age`: Should not be null and should be between 18 and 25.
  - `department`: Should not be null.
- `Event` entity:
  - `eventName`: Should not be blank.
  - `locationOfEvent`: Should not be blank.
  - `date`: Should not be null.
  - `startTime`: Should not be null.
  - `endTime`: Should not be null.

## Project Summary
The University Event Management project is built using Java and the Spring Boot framework. It provides APIs for managing students and events in a university. The project includes functionality for adding, updating, and deleting students and events. It also supports fetching all students, fetching a student by ID, fetching all events by date, and deleting an event.

## Getting Started
To run the University Event Management project, follow these steps:
1. Clone the repository.
2. Import the project into your preferred IDE.
3. Build the project using Maven or Gradle.
4. Run the `UniversityEventManagementApplication` class to start the application.
5. The application will be accessible at `http://localhost:8080`.

## Testing Endpoints
You can test the endpoints using tools like cURL, Postman, or any other HTTP client. Here are some example endpoints:

- **Add Student**
  - Endpoint: `POST /students/addStudents`
  - Request Body: JSON representation of the student object

- **Update Student Department**
  - Endpoint: `PUT /students/updateStudentDepartment/{studentId}`
  - Request Body: JSON representation of the updated department

- **Get All Students**
  - Endpoint: `GET /students/getAllStudents`

- **Get Student by ID**
  - Endpoint: `GET /students/getStudentById/{studentId}`

- **Delete Student**
  - Endpoint: `DELETE /students/deleteStudent/{studentId}`

- **Add Event**
  - Endpoint: `POST /events/addEvent`
  - Request Body: JSON representation of the event object

- **Update Event**
  - Endpoint: `PUT /events/updateEvent/{eventId}`
  - Request Body: JSON representation of the updated event object

- **Delete Event**
  - Endpoint: `DELETE /events/deleteEvent/{eventId}`

- **Get All Events by Date**
  - Endpoint: `GET /events/getAllEventsByDate?date={date}`

## License
This project is licensed under the [MIT License](LICENSE).

