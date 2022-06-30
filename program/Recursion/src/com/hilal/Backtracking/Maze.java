package com.hilal.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},{true, false, false},{false,true,true}};
        System.out.println(mazepathblock("",maze,0,0));
    }
    public static int countmaze(int row,int col){
        if(row==1||col==1)
            return 1;
        int left = countmaze(row-1,col);
        int right = countmaze(row,col-1);
        return left+right;
    }
    public static List<String> mazepath(String p, int row, int col){
        //permutation
        List<String> list = new ArrayList<>();
        if(row==1&&col==1)
        {
            list.add(p);
            return list;
        }
        if(row==1){
            return mazepath(p+" H",row,col-1);
        }
        else if(col==1){
            return mazepath(p+" V",row-1,col);
        }
        list.addAll(mazepath(p+" H",row,col-1));
        list.addAll(mazepath(p+" V",row-1,col));
        list.addAll(mazepath(p+" D",row-1,col-1));
        return list;
    }
    public static List<String> mazepathblock(String p,boolean[][] maze, int row, int col){
        //there is a block at 1,1 start from 0 to n
        List<String> list = new ArrayList<>();
        if(!maze[row][col]){
            return list;
        }
        if((row==maze.length-1)&&(col==maze[0].length-1))
        {
            list.add(p);
            return list;
        }
        if(row==maze.length-1){
            return mazepathblock(p+" H",maze,row,col+1);
        }
        else if(col==maze[0].length-1){
            return mazepathblock(p+" V",maze,row+1,col);
        }
        list.addAll(mazepathblock(p+" H",maze,row,col+1));
        list.addAll(mazepathblock(p+" V",maze,row+1,col));
        list.addAll(mazepathblock(p+" D",maze,row+1,col+1));
        return list;
    }
}
