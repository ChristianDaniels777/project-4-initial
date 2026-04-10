# Project Overview

This project introduces AI-assisted software development by having you use AI tools to generate code and unit tests for a generic container class. You'll learn to craft effective prompts, evaluate AI-generated code, and integrate AI into your development workflow—skills essential in modern software engineering.

## Concepts Covered

- Collections
- Generics
- Iterable Interface
- AI-Assisted Code Generation
- AI-Assisted Unit Test Generation
- Prompt Engineering for Code

## Details

1. Review the material about collections, iterators (the iterable interface specifically), and generic types.
2. Fork, then clone the starting template for this project from https://github.com/UltimateSandbox/project-4-initial.git
3. Use an AI assistant (like Claude, ChatGPT, or GitHub Copilot) to generate a generic class called Bag that implements the Container interface below.
4. The Container interface included in the template is defined as follows:
```java
public interface Container<E> extends Iterable<E> {
    void add(E item);
    boolean remove(E item);
    boolean contains(E item);
    int size();
    boolean isEmpty();
}
```
5. Your Bag implementation ***must*** use the Java ArrayList as the backing data structure. You will lose points if you do not use an ArrayList.
6. Do not change or add to the Container interface.
7. Use AI to generate comprehensive unit tests for your Bag implementation. The tests should cover edge cases, normal operations, and the iterator functionality.
8. Review, understand, and refine the AI-generated code and tests. You're responsible for ensuring correctness.
9. You are not required to implement the forEach or spliterator methods of Iterable.
10. Be prepared to explain your prompt strategy and any modifications you made to the AI-generated code.

## Extra Credit
- For extra credit, implement the forEach and spliterator methods of the Iterable interface using AI assistance.

## Project Hints

- **Prompting Strategy**: Be specific about requirements (ArrayList backing, generic type handling, iterator implementation).
- **Code Review**: AI-generated code may need refinement. Check for proper error handling, edge cases, and adherence to requirements.
- **Iterative Refinement**: Don't accept the first generation—ask the AI to improve specific aspects if needed.
- **Test Coverage**: When generating tests, explicitly request coverage of empty bags, single items, multiple items, removal scenarios, and iterator behavior.
- Remember the facade pattern from Stack and Queue—this is the same concept applied to ArrayList.

## Grading Rubric - AI-Assisted Container Implementation

### Core Implementation (60%)

- **Documentation and Comments** (10%)
    - The AI_INTERACTION_LOG.md file is present and details the prompts used and modifications made. (5%)
    - The REFLECTION.md file is present and discusses the experience with AI assistance. (5%)

- **Code Compiles Successfully** (10%)
    - Project builds without errors

- **Bag Class Implementation** (20%)
    - Implements Container<E> interface (5%)
    - Uses ArrayList as backing data structure (10%)
    - All required methods implemented (isEmpty, size, add, remove, contains) (5%)

- **Iterator Implementation** (15%)
    - Implements Iterable<E> interface (5%)
    - Iterator hasNext() works correctly (5%)
    - Iterator next() works correctly (5%)

- **Generic Type Handling** (5%)
    - Proper use of generic type parameter <E> throughout

### Testing (25%)

- **Unit Tests Present** (10%)
    - Test class exists and compiles

- **Test Coverage** (15%)
    - Tests for empty bag operations (3%)
    - Tests for add/remove/contains operations (5%)
    - Tests for iterator functionality (4%)
    - Tests for edge cases (null handling, remove non-existent items, etc.) (3%)

### Code Quality (15%)

- **Code Correctness** (10%)
    - Methods behave as expected
    - No runtime errors during normal operations

- **Code Organization** (5%)
    - Reasonable variable names
    - Basic code structure and readability

### Extra Credit (10%)

- **forEach Implementation** (5%)
- **spliterator Implementation** (5%)

---

**Total: 100% + 10% Extra Credit**