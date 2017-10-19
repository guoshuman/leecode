package com.guoshuman;

public class islandPerimeter {

    public static void main(String[] args){
        islandPerimeter island = new islandPerimeter();
        int[][] d = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int sum = island.perimeter(d);
        System.out.println(sum);
    }

    public static int perimeter(int[][] d){
        int row = d.length;
        int column = d[0].length;
        int repeat = 0;
        int plus = 0;
        int perimeter = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(d[i][j]==1){
                    plus += 1;
                    if(i != 0 && d[i-1][j]==1){
                        repeat += 1;
                    }
                    if(j!=0 && d[i][j-1]==1){
                        repeat+=1;
                    }
                }
            }
        }
        perimeter = 4*plus-2*repeat;
        return perimeter;
    }
}
