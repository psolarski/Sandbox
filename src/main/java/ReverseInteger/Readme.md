# Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
```
Input: 123
Output: 321
```
Example 2:
```
Input: -123
Output: -321
```
Example 3:
```
Input: 120
Output: 21
```
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


# Java solution: 
```
public int reverse(int x) {
    long reverseInt = 0;
    long input = x;
    while (input != 0) {
        reverseInt = reverseInt * 10 + input % 10;
        input = input / 10;
    }
    if(reverseInt > Integer.MAX_VALUE || reverseInt < Integer.MIN_VALUE) {
        return 0;
    }
    return (int) reverseInt;
}
```