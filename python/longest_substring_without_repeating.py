"""
    https://leetcode.com/problems/longest-substring-without-repeating-characters/

    Finds the Longest Substring Without Repeating Characters
"""

def lengthOfLongestSubstring(s: str) -> int:
    # not quite right, fails test 4
    # should not overwrite curr_len as soon as repeat char is found
    # instead need to keep track of where that char is to find longest substring
    max_len = 0
    curr_len = 0
    chars_seen = {}
    
    for i in range(len(s)):
        
        if s[i] not in chars_seen:
            curr_len += 1
            chars_seen[s[i]] = True
            if curr_len > max_len: # new max unique string?
                max_len = curr_len
        else:
            curr_len = 1
            chars_seen = {s[i]: True}
    
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