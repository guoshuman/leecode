 # -*- coding:utf-8 -*-

def islandPerimeter(d):
    row = len(d)
    column = len(d[0])
    perimeter = 0
    plus = 0
    repeat = 0
    for i in xrange(row):
        for j in xrange(column):
            if(d[i][j]==1):
                plus += 1
                if(i!=0 and d[i-1][j]==1):
                    repeat += 1
                if (j!=0 and d[i][j-1]==1):
                    repeat += 1

    perimeter = plus*4-2*repeat
    for i in xrange(row):
        print d[i]
    return perimeter

if __name__ == '__main__':
    d=[[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
    sum = islandPerimeter(d)
    print sum
