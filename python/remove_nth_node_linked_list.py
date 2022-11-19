# https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
    # A simple, linear solution
    # Not exactly right - fails [1] test case - list of a single element
    finder = head
    length = 0
    # Find the end first
    while finder is not None:
        length += 1
        finder = finder.next
    
    dist_to_n = length - n # find distance from front
    finder = head # go back to beginning
    parent = None
    
    while dist_to_n > 0 :
        dist_to_n -= 1
        parent = finder
        finder = finder.next
    
    if finder.next is not None:    
        parent.next = finder.next
    del finder
    
    return head