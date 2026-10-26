# Demo Script

## Adapter Pattern

Expected output:

Fetched data: {"message":"Data from legacy feed"}

The adapter converts the legacy pull() method into the fetch() method
expected by the modern interface.

---

## Decorator Pattern

Expected output:

Before execution: BOOK-001
Executing service for ID: BOOK-001
After execution: BOOK-001

The decorator adds logging before and after the core service.

---

## Strategy Pattern

Expected output:

Standard fee: 100.0
Premium fee: 90.0

The strategy can be changed at runtime from StandardFee to PremiumFee.

---

## Observer Pattern

Expected output:

Student notification: Status changed to AVAILABLE
Librarian notification: New status is AVAILABLE
Student notification: Status changed to BORROWED
Librarian notification: New status is BORROWED

The subject notifies all registered observers whenever the status changes.