# AI Interaction Log

## Tool Used
ChatGPT

## Prompt 1
Create a Java generic class named `Bag<E>` that implements this interface:

```java
public interface Container<E> extends Iterable<E> {
    void add(E item);
    boolean remove(E item);
    boolean contains(E item);
    int size();
    boolean isEmpty();
}
```

Requirements:
- Use `ArrayList` as the backing data structure.
- Do not modify the `Container` interface.
- Implement the iterator functionality correctly.
- Keep the code simple and readable.
- Add JavaDoc comments.

### Result
Generated a `Bag<E>` class backed by an `ArrayList<E>`.

### Modifications Made
- Verified that the backing field was specifically `ArrayList<E>`.
- Kept `remove(E item)` behavior aligned with `ArrayList.remove(Object)` so it removes the first matching item and returns a boolean.
- Added explicit JavaDoc comments for clarity and rubric coverage.

## Prompt 2
Create JUnit 5 tests for the `Bag<E>` class. Cover:
- empty bag behavior
- add/remove/contains
- duplicate values
- null handling
- iterator `hasNext()` and `next()`
- iteration with a for-each loop
- generic type handling
- extra credit `forEach` and `spliterator`

### Result
Generated a test suite for normal operations, edge cases, and iterator behavior.

### Modifications Made
- Refined tests so they match the implemented behavior exactly.
- Added a custom `Person` type to verify generic support.
- Kept tests focused on expected public behavior instead of internal implementation details.

## Final Review Notes
- Confirmed the project compiles with Maven.
- Confirmed all tests pass.
- Confirmed the `Bag<E>` implementation uses `ArrayList` as required.
