# Documentation Test Project

This sample project demonstrates aligned code and documentation for the calculator, string utilities, and user domain classes. Each section below describes the actual APIs available so that CDSE can be run as a “clean baseline” before you introduce new drifts.

## Components

### Calculator.java
1. `add(int a, int b)` — returns the sum of the two arguments.
2. `subtracttt(int a, int b)` — subtracts `b` from `a`.
3. `times(int a, int b)` — multiplies the arguments and returns the product.
4. `divide(int a, int b)` — performs division and returns a `double`, throwing `ArithmeticException` when `b == 0`.
5. `abs(int value)` — returns the absolute value of the argument.

### StringUtils.java
1. `public static boolean isEmpty(String str)` — checks for `null` or empty strings.
2. `public String flip(String input)` — reverses the supplied string using `StringBuilder`.
3. `public String capitalize(String text)` — uppercases the first character while leaving the remainder unchanged.
4. `public String trim(String value)` — trims whitespace from both ends. (Leading zeros are not removed.)

### User.java
1. Constructor `User(String username, String email)` — stores the username and email address.
2. `getUsername()` / `setUsername(String username)` — accessors for the username (no validation is enforced in code).
3. `getEmail()` — returns the stored email address.
4. `getAge()` — returns the user’s age field.
5. `isActive()` — returns `true` when the username is not null.

