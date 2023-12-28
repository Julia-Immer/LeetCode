# https://leetcode.com/problems/merge-sorted-array/description?envType=study-plan-v2&envId=top-interview-150

def merge(nums1: list[int], m: int, nums2: list[int], n: int):
    i = m - 1
    j = n - 1
    write_index = m + n - 1

    while j >= 0 :
        if i >= 0 and nums1[i] > nums2[j] :
            nums1[write_index] = nums1[i]
            i -= 1
        else:
            nums1[write_index] = nums2[j]
            j -= 1
        
        write_index -= 1

    return nums1

def main():
    nums1, nums2 = [1,2,3,0,0,0], [2,5,6]
    orig1 = nums1.copy()
    a = 3
    b = 3

    print(merge(nums1, a, nums2, b))

if __name__=="__main__": 
    main()