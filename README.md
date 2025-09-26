# Incubyte TDD Assessment – String Calculator Kata (Java)

This repository contains a Java implementation of the String Calculator Kata using Test-Driven Development (TDD).

## Features

- Add numbers from strings with comma, newline, or custom delimiters
- Throws exception for negative numbers (shows all negatives)
- 100% covered by JUnit tests

## Getting Started

### Prerequisites

- Java 8+
- Maven

### Build & Run Tests

```bash
mvn clean test
```

### Project Structure

```
src/
  main/java/com/incubyte/StringCalculator.java
  test/java/com/incubyte/StringCalculatorTest.java
```

### Example Usage

```java
StringCalculator calc = new StringCalculator();
System.out.println(calc.add("1,2,3")); // Output: 6
System.out.println(calc.add("//;\n1;2")); // Output: 3
```

## TDD Commit Steps (for your reference)

1. Test: Empty string returns 0
2. Test: Single number
3. Test: Two numbers
4. Test: Multiple numbers
5. Test: Newlines as separator
6. Test: Custom delimiter
7. Test: Negative number throws exception
8. Test: Multiple negatives in exception message

**Commit after each step to show TDD progression.**

## Screenshots

Add terminal screenshots showing passing tests here before submission.

---

## License

MIT