# UFC Fighter API

This Spring Boot application provides a RESTful API for accessing and managing UFC fighter data stored in a PostgreSQL database.

## Features

- Retrieve all UFC fighters
- Search fighters by name, weight, height, or stance
- Data persistence using PostgreSQL

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL

## Project Structure

- `Fighter`: Entity class representing a UFC fighter
- `FighterRepository`: Interface for database operations
- `FighterService`: Service class containing business logic
- `FighterController`: REST controller handling HTTP requests

## API Endpoints

### GET /fighter

Retrieves fighters based on query parameters:

- No parameters: Returns all fighters
- `name`: Searches fighters by name (case-insensitive, partial match)
- `weight`: Searches fighters by weight class (case-insensitive, partial match)
- `height`: Searches fighters by height (case-insensitive, partial match)
- `stance`: Searches fighters by stance (case-insensitive, partial match)

## Setup and Running

1. Ensure you have Java and Maven installed
2. Clone the repository
3. Configure your PostgreSQL database connection in `application.properties`
4. Run the application using `mvn spring-boot:run`

## Future Improvements

- Add CRUD operations for fighters
- Implement pagination for large datasets
- Add authentication and authorization
- Expand search capabilities (e.g., by reach, date of birth)
- Add unit and integration tests

