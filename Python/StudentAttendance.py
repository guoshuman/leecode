# -*- coding:utf-8 -*

# You are given a string representing an attendance record for a student. The record only contains the following three characters:
#
#
#
# 'A' : Absent.
# 'L' : Late.
# 'P' : Present.
#
#
# A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
#
# You need to return whether the student could be rewarded according to his attendance record.
#
# Example 1:
#
# Input: "PPALLP"
# Output: True
#
#
# Example 2:
#
# Input: "PPALLL"
# Output: False

def Solution(s):
    a = len(s)
    A = 0
    L = 0
    for i in xrange(a):
        if(s[i] == "A"):
            A += 1
            L = 0
        elif(s[i] == "L"):
            L += 1
        else:
            L = 0
    if(A == 2 or L == 3):
        print "false"
    else:
        print "true"

if __name__ == '__main__':
    Solution("LLPALP")