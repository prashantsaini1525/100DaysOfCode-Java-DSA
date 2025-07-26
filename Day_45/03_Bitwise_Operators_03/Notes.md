# Overview of Bitwise Operators

Java’s seven bitwise operators let you manipulate bits directly:

| Operator | What It Does                              |
|:--------:|--------------------------------------------|
| `&`      | AND – sets bit if both inputs are 1        |
| `|`      | OR – sets bit if at least one input is 1   |
| `^`      | XOR – sets bit if inputs differ            |
| `~`      | NOT – flips every bit                      |
| `<<`     | Left shift – moves bits left, adds 0s      |
| `>>`     | Signed right – shifts right, preserves sign|
| `>>>`    | Unsigned right – shifts right, adds 0s     |

## Common Patterns

- **Masking:** `value & mask` to extract or clear specific bits.  
- **Setting:** `value | mask` to turn bits on.  
- **Toggling:** `value ^ mask` to flip bits.  
- **Shifting:** `value << n` or `value >> n` to multiply/divide by powers of two.

## Sample Snippets

```java
// Check 5th bit
boolean bit5 = (x & (1 << 4)) != 0;

// Toggle 2nd bit
x ^= (1 << 1);

// Clear last 3 bits
x &= ~0b111;
```


## Conclusion

Familiarity with these operators enables precise and efficient bit-level manipulations.
