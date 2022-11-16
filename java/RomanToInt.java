/** LeetCode question 13
 * Change an input String of Roman Numerals to their int value.
 * XVI = 16 
 * XXVIII = 28
 * IX = 9
 * XXXIX = 39
 * XXIV = 24
 * https://leetcode.com/problems/roman-to-integer/
 */

import java.util.HashMap;

class RomanToInt {
    public static void main(String[] args) {
        String rNums1 = "XXVII";
        System.out.println("Test Value:" + rNums1 
                        + "\nExpected: 27" 
                        + "\nromanToInt:" + romanToInt(rNums1));

        String rNums2 = "MCMXCIV";
        System.out.println("Test Value:" + rNums2 
                        + "\nExpected: 1994" 
                        + "\nromanToInt:" + romanToInt(rNums2));
    }

    public static int romanToInt(String s) {
            int sum = 0;
            HashMap<String, Integer> romanNums = new HashMap();
            romanNums.put("I", 1);
            romanNums.put("V", 5);
            romanNums.put("X", 10);
            romanNums.put("L", 50);
            romanNums.put("C", 100);
            romanNums.put("D", 500);
            romanNums.put("M", 1000);
    
            if (s.length() > 0) {
                // iterate from left to right
                for (int i = 0; i < s.length()-1; i++) {
                    int curr_num = romanNums.get(s.substring(i, i+1));
                    int next_num = romanNums.get(s.substring(i+1, i+2));
                    // if this char, s[i] >= s[i+1], add it to the sum
                    if (curr_num >= next_num)
                        sum += curr_num;
                    else 
                        sum -= curr_num;
                }
    
                sum += romanNums.get(s.substring(s.length()-1));  //add very last value in
            }
            
            return sum;
        }
}