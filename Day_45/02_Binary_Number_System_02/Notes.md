# Binary ⇄ Decimal Conversion

Converting between decimal (human) and binary (machine) is foundational for bit operations.

## Binary → Decimal

- **Place‑Value Method**  
  Sum each bit × 2^position  
  - Example: `1101₂` = 1×2³ + 1×2² + 0×2¹ + 1×2⁰ = 13

- **In Code**  
  ```java
  int toDecimal(String bin) {
      int val = 0;
      for (char b : bin.toCharArray()) {
          val = (val << 1) | (b - '0');
      }
      return val;
  }
  ```

## Decimal → Binary

- **Repeated Division**  
  Divide by 2, record remainders, reverse order  
  - Example: 13 → remainders [1,0,1,1] → `1101`

- **In Code**  
  ```java
  String toBinary(int n) {
      if (n == 0) return "0";
      StringBuilder sb = new StringBuilder();
      while (n != 0) {
          sb.append(n & 1);
          n >>>= 1;
      }
      return sb.reverse().toString();
  }
  ```

> **Try:** Represent –5 in 8‑bit two’s‑complement.

## Conclusion

Mastery of binary–decimal conversion is essential for implementing bitwise algorithms.
