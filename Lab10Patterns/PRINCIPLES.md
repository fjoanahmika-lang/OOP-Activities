# Structural and Behavioral Design Patterns

## Adapter

The Adapter pattern converts one interface into another interface that the
client expects.

In this laboratory:

- Target: ModernDataSource
- Adaptee: LegacyJsonFeed
- Adapter: LegacyJsonAdapter

The legacy class uses pull(), while the modern interface expects fetch().
The adapter connects the two without changing the legacy class.

---

## Decorator

The Decorator pattern adds responsibilities to an object dynamically without
changing the original class.

In this laboratory:

- Component: Service
- Concrete Component: CoreService
- Decorator: LoggingServiceDecorator

The logging decorator adds messages before and after the service executes.

---

## Strategy

The Strategy pattern places interchangeable algorithms or policies behind a
common interface.

In this laboratory:

- Strategy: FeeStrategy
- Concrete Strategies: StandardFee and PremiumFee
- Context: FeeContext

The FeeContext can switch between StandardFee and PremiumFee at runtime.

---

## Observer

The Observer pattern allows a subject to notify registered observers when its
state changes.

In this laboratory:

- Subject: Subject
- Observer: Observer
- Concrete Observers: StudentObserver and LibrarianObserver

When the subject status changes, all registered observers receive the new
status.

---

## Pattern Comparison

Adapter is useful when an existing class has an incompatible interface.

Decorator is useful when additional behavior needs to be added without
creating many subclasses.

Strategy is useful when different algorithms or policies need to be
interchangeable.

Observer is useful when multiple objects need to receive notifications about
state changes.

---

## Testability

Adapter and Strategy can be tested independently because their behavior can
be tested using different inputs and implementations.

Decorator can also be tested by checking the behavior before and after the
decorated service is executed.

Observer requires checking registration, notification, and unregistration.
Shared listener lists should be managed carefully to avoid unwanted
notifications.