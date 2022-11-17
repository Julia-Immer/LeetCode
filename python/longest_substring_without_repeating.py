"""
    https://leetcode.com/problems/longest-substring-without-repeating-characters/

    Finds the Longest Substring Without Repeating Characters
"""

def lengthOfLongestSubstring(s: str) -> int:
        max_len = 0
        h = 0 # head pointer
        t = 0 # tail pointer
        chars_seen = {} # chars in current rolling window

        while (h < len(s)) and (t < len(s)):

            if s[h] in chars_seen and chars_seen[s[h]] >= t:
                t = chars_seen[s[h]] + 1 # move window over        
            chars_seen[s[h]] = h # add current char in

            if h - t + 1 > max_len: 
                max_len = h - t + 1 # new max found
            h += 1
            
        return max_len


def testLongestSubstring():
    s1 = "abcabcbb"
    assert lengthOfLongestSubstring(s1) == 3
    s2 = "zzzzzzz"
    assert lengthOfLongestSubstring(s2) == 1
    s3 = "pwwkew"
    assert lengthOfLongestSubstring(s3) == 3
    s4 = "dvdf"
    assert lengthOfLongestSubstring(s4) == 3 
    print("Test Successfull!\n")

# run the test
testLongestSubstring()