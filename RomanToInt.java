/** LeetCode question 13
 * Change an input String of Roman Numerals to their int value.
 * https://leetcode.com/problems/roman-to-integer/
 */

import java.util.Map;

class RomanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> romanNums = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000);
        int sum = 0;
        
        // iterate from right to left to make subtraction of smaller numerals easier
        for (int i = s.length()-1; i >= 0; i--) {
            // if this char, s[i] > s[i-1], add it to the sum

            // if s[i] < s[i-1], subtract it from the bunch
        }
        
        return sum;
    }
}