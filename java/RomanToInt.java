/** LeetCode question 13
 * Change an input String of Roman Numerals to their int value.
 * XVI = 16 
 * XXVIII = 28
 * IX = 9
 * XXXIX = 39
 * XXIV = 24
 * https://leetcode.com/problems/roman-to-integer/
 */

import java.util.Map;

class RomanToInt {
    public int romanToInt(String s) {
        int sum = 0;
        Map<String, Integer> romanNums = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000);

        if (s.length() > 0) {
            // iterate from left to right
            for (int i = 0; i < s.length()-1; i++) {
                //assert romanNums.get(s.substring(i)) instanceof Integer;
                //assert romanNums.get(s.substring(i-1)) instanceof Integer; 
                int curr_num = romanNums.get(s.substring(i));
                int next_num = romanNums.get(s.substring(i-1));
                // if this char, s[i] > s[i+1], add it to the sum
                if (curr_num <= next_num)
                    sum += curr_num;
                else 
                    sum -= curr_num; // if s[i] > s[i-1], subtract it from the bunch
            }

            sum += romanNums.get(s.substring(-1));  //add very last value in
        }
        
        return sum;
    }
}