# # -*- coding:utf-8 -*
# import Levenshtein
# texta = u'郭淑曼'
# textb = u'杨梦'
# print Levenshtein.distance(texta,textb)

#!/usr/bin/env python
# coding=utf-8
# m=cafe n=coffee
def minEditDist(m,n):
    m_l = len(m)+1 #字符串m的长度
    n_l = len(n)+1 #字符串n的长度
    d_matrix = [[0]*(n_l) for i in xrange(m_l)] #得到一个m_l+1*n_l+1的矩阵
    print "初始化矩阵："
    for i in range(n_l):
        d_matrix[0][i] = i
    for i in range(m_l):
        d_matrix[i][0] = i
    for i in range(m_l):
        print d_matrix[i]
    d = 0
    print "计算结果如下："
    for i in range(1,m_l):
        for j in range(1,n_l):
            if n[j-1] == m[i-1]:
                d = d_matrix[i-1][j-1]
            else:
                d = d_matrix[i - 1][j - 1]+1
            d_matrix[i][j] = min(d,min(d_matrix[i][j-1]+1,d_matrix[i-1][j]+1))

    for i in range(m_l):
        print d_matrix[i]

    return d_matrix[m_l-1][n_l-1]


if __name__ == '__main__':
    mindist=minEditDist("cafe","coffee")
    print "两个字符串编辑距离为："
    print mindist
