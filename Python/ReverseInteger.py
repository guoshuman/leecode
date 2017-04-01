#Reverse digits of an integer.
#
#Example1: x = 123, return 321
#Example2: x = -123, return -321
#
#click to show spoilers.
#
#Note:
#The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
#
#Subscribe to see which companies asked this question.


#Not Handled Out of Range Problem
class Solution:
    def RevInt(self, s):
        flag = 1
        if(int(s)<0):
            s = 0 - s
            flag = 0
        rev = 0
        x=s
        while(x!=0):
            rev = rev*10+x%10
            x = x/10
        if (flag == 0):
            rev = 0 - rev
        return rev

if __name__ == '__main__':
    solution = Solution();
    arr = solution.RevInt(123);
    print arr;