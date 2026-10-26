# SOLID Principles Mapping

## SRP - Single Responsibility Principle

The GodApp class violates SRP because it handles user input, business rules, calculations, and output in one class.

### Refactoring

The responsibilities were separated into:

- DomainModel - stores the application data.
- DomainService - handles business rules and calculations.
- ConsoleUI - handles user input and output.

## OCP - Open/Closed Principle

The GodApp version would require modification when new calculation rules or output methods are added. The refactored design makes it easier to extend the business logic separately.

## DIP - Dependency Inversion Principle

The ConsoleUI directly creates DomainService, so there is still a concrete dependency. A further improvement could be to depend on an abstraction such as an interface.

## Code Smells Identified

1. God class
2. Mixed responsibilities
3. Business logic mixed with UI
4. Difficult testing
5. Difficult future modification