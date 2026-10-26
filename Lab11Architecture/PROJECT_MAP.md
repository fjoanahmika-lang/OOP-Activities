# Final Project Architecture Map

## Project Domain

Library Management System

## Package Mapping

### 1. Domain Layer
Package:
`edu.slsu.it205.lab11.domain`

Responsibilities:
- Book entity
- Book-related domain rules
- Repository interfaces

Example classes:
- `Book`
- `BookRepository`

Final Project features:
- Book information
- Book availability
- Book borrowing rules

---

### 2. Persistence Layer
Package:
`edu.slsu.it205.lab11.persistence`

Responsibilities:
- Store and retrieve data
- Implement repository interfaces
- Connect to in-memory storage or future database/file storage

Example class:
- `InMemoryBookRepository`

Final Project features:
- Save books
- Retrieve books
- Store borrowing records

---

### 3. Service Layer
Package:
`edu.slsu.it205.lab11.service`

Responsibilities:
- Application use cases
- Business rules
- Coordinate domain and persistence

Example class:
- `BookService`

Final Project features:
- Add book
- List books
- Borrow book
- Return book
- Search books

---

### 4. UI Layer
Package:
`edu.slsu.it205.lab11.ui`

Responsibilities:
- Receive user input
- Display results
- Call service methods
- No database or persistence logic

Example class:
- `Main`

Final Project features:
- Menu
- User input
- Display books
- Display transaction results

---

## Dependency Direction

```text
UI
 |
 v
Service
 |
 v
Domain Repository Interface
 ^
 |
Persistence Implementation