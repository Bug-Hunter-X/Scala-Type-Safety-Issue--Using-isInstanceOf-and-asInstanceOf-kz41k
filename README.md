# Scala Type Safety Issue: Using isInstanceOf and asInstanceOf

This repository demonstrates a common error in Scala: relying on `isInstanceOf` and `asInstanceOf` for type checking and casting. This approach is fragile and error-prone, particularly with complex type hierarchies. The provided code shows an example of this, along with a more robust solution using type classes.

**Bug:** The original code uses `isInstanceOf` and `asInstanceOf` to handle addition for Int and String types. This approach is not type-safe and results in an `IllegalArgumentException` when attempting to operate on incompatible types.

**Solution:** The improved solution uses type classes to handle different data types generically and safely.  This provides better type safety and maintainability.

**How to run:**
1. Clone the repository.
2. Compile and run the Scala code using a Scala compiler (e.g., sbt).
