package com.hilal.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mazemark {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},{true, true, false},{true,true,true}};
        int[][] path = new int[maze.length][maze[0].length];
        System.out.println(mazepathblock("",maze,path,0,0, 1));
    }
    public static List<String> mazepathblock(String p, boolean[][] maze,int[][] path, int row, int col,int count){
        //there is a block at 1,1 start from 0 to n
        List<String> list = new ArrayList<>();
        if(!maze[row][col]){
            return list;
        }
        int prevnum = path[row][col];
        path[row][col] = count;

        if((row==maze.length-1)&&(col==maze[0].length-1))
        {
            for (int i = 0; i < path.length; i++) {
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println("");
            list.add(p);
            return list;
        }

        boolean prev = maze[row][col] ;
        maze[row][col]=false;
        if(col<maze[0].length-1){
            list.addAll(mazepathblock(p+" R",maze,path,row,col+1,count+1));
        }
        if(row<maze.length-1){
            list.addAll(mazepathblock(p+" D",maze,path,row+1,col,count+1));
        }
        if(col>0){
            list.addAll(mazepathblock(p+" L",maze,path,row,col-1,count+1));
        }
        if(row>0){
            list.addAll(mazepathblock(p+" U",maze,path,row-1,col,count+1));
        }
        maze[row][col]=prev;
        path[row][col]=prevnum;

        return list;
    }}

