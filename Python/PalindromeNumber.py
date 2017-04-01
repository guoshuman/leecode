#
# Determine whether an integer is a palindrome. Do this without extra space.
#

class Solution:
    def isPlindrome(self, s):
        if(s<0):
            return 1
            exit(1)
        len = 1
        while(s/len>10):
            len = len*10
        pa = s/len
        m = s
        while(pa!=0):
            left = m/len
            right = m%10
            if(left != right):
                return 1
                exit(1)
            else:
                pa = pa%len
                pa = pa/100
                len = len/10
        return 0

if __name__ == '__main__':
    solution = Solution();
    arr = solution.isPlindrome(12321);
    print arr;