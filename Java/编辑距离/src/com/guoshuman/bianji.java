package com.guoshuman;
public class bianji {

    public static void main(String[] args) {
        String m = "我的名字叫", n="你的名字叫";
        int d = getEditDistance(m, n);
        System.out.println(m+"和"+n+"的编辑距离为："+d);
    }
   public static int getEditDistance(String m,String n){
        int[][] matrix = new int[m.length()+1][n.length()+1];
        char[] ml = m.toCharArray();
        char[] nl = n.toCharArray();
        for(int i=0;i<m.length()+1;i++){
            matrix[i][0] = i;
        }
        for(int i=0;i<n.length()+1;i++){
            matrix[0][i] = i;
        }
        int d = 0;
        for(int i=1;i<m.length()+1;i++){
            for(int j=1;j<n.length()+1;j++){
                if(ml[i-1] == nl[j-1]){
                    d = matrix[i-1][j-1];
                }else{
                    d = matrix[i-1][j-1]+1;
                }
                matrix[i][j] = minNum(d,matrix[i-1][j]+1,matrix[i][j-1]+1);
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println("");
        }

        return matrix[m.length()][n.length()];
   }

    private static int minNum(int d, int i, int i1) {
       int a = (d<i)?d:i;
        return (a<i1)?a:i1;
    }


}