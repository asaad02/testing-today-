# Documentation Drift Test Project

This project intentionally contains misaligned code and documentation to test CDSE's drift detection capabilities.

## Intentional Drift Examples

### Calculator.java
1. **Parameter name mismatch**: `add()` params documented as `a, b`
1. **Parameter name mismatch**: `subtract()` params documented as `x, y` but code uses `a, b`
2. **Method rename**: `multiply()` documented but method is actually `times()`
3. **Parameter name mismatch**: `divide()` params documented as `numerator/denominator` but code uses `a/b`
4. **Orphaned documentation**: Javadoc for `power()` method that was removed
5. **Signature mismatch**: `divide()` returns `double` but might expect `int`

### StringUtils.java
1. **Method modifier change**: `isEmpty()` documented as instance method, but is `static`
2. **Method rename**: Documented as `reverse()` but implemented as `flip()`
3. **Behavior mismatch**: `capitalize()` javadoc says "uppercase" but only capitalizes first letter
4. **Feature removed**: `trim()` doc says it removes leading zeros, but doesn't
5. **Missing implementation**: `join()` method documented but doesn't exist

### User.java
1. **Constructor signature change**: Documented with `password` param, but only takes `username, email`
2. **Missing method**: `getId()` documented but doesn't exist
3. **Validation gap**: `setUsername()` doc mentions validation, but no validation in code
4. **Missing implementation**: `updateProfilePicture()` documented but not implemented
5. **Behavior mismatch**: `isActive()` doc says checks login time and subscription, but only checks username != null

## Expected CDSE Findings

CDSE should detect:
- Stale parameter references in Javadoc
- References to renamed methods
- Orphaned documentation for removed methods
- Missing implementations referenced in docs
- Behavioral mismatches between docs and code

## Testing the VS Code Extension

1. Open this project in VS Code
2. Run `CDSE: Analyze Workspace`
3. Check `target/cdse-vscode-report.json` for drift findings
4. Verify CDSE catches the intentional misalignments above
