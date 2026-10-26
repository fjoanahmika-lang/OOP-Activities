# Creational Design Patterns

## Factory Method

The Factory Method pattern allows subclasses to decide which concrete
product object will be created.

### Participants

- Product: ReportExporter
- Concrete Products: PdfExporter and CsvExporter
- Creator: ExporterFactory
- Concrete Creators: PdfExporterFactory and CsvExporterFactory

The factory method is create().

The concrete factories decide which exporter will be created.

---

## Builder

The Builder pattern constructs a complex object step by step.

In this laboratory, ReportConfig has optional properties:

- title
- author
- includeCover
- pageSize

The Builder uses a fluent API so methods can be chained.

This avoids the need for many overloaded constructors, also known as
telescoping constructors.

---

## Singleton

The AppConfig class uses the initialization-on-demand holder approach.

The shared instance is accessed using:

AppConfig.getInstance()

The identity comparison:

configA == configB

returns true, showing that both variables refer to the same instance.

### When NOT to use Singleton

Singleton should not be used simply because only one object is needed.

It can create shared global state, which can make unit testing more difficult.
If an object can be passed as a dependency, dependency injection may be a
better approach.

---

## Testability

Factory Method and Builder are generally easier to test because object
creation and configuration can be tested separately.

Singleton can be harder to test when it contains mutable shared state because
different tests may affect the same instance.

---

## Pattern Trade-offs

### Factory Method

Advantages:

- Separates object creation from the code that uses the object.
- Makes it easier to add new exporter types.

Trade-off:

- Adds more classes to the design.

### Builder

Advantages:

- Makes complex object construction easier to read.
- Avoids telescoping constructors.
- Supports optional properties.

Trade-off:

- Requires an additional Builder class.

### Singleton

Advantages:

- Provides one shared instance.
- Provides controlled access to shared configuration.

Trade-off:

- Shared state can make testing and maintenance more difficult.