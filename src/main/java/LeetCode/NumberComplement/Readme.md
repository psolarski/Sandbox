### 476. Number Complement

Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:

1. The given integer is guaranteed to fit within the range of a 32-bit signed integer.
2. You could assume no leading zero bit in the integer’s binary representation.

Example 1:
```
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
```
Example 2:
```
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to outpu
```

# Java solution: 
```
        Stack<Integer> integerStack = new Stack<>();
        while (num != 0) {
            integerStack.push(num%2);
            num = num/2;
        }

        int[] bits = new int[integerStack.size()];

        for(int i = 0; 0 < integerStack.size(); i++) {
            bits[i] = integerStack.pop();
        }

        int output = 0;
        int bit = 0;
        for (int i = 0; i < bits.length; i++) {
            bit = bits[i];
            if(bit == 1) {
                bit = 0;
            } else if (bit == 0) {
                bit = 1;
            }
            output += (int) (bit * Math.pow(2, bits.length-i-1));
        }
        return output;
```