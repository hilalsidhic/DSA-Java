package com.hilal.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Allpaths {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},{true, true, true},{true,true,true}};
        System.out.println(mazepathblock("",maze,0,0));
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
        boolean prev = maze[row][col] ;
        maze[row][col]=false;
        if(col<maze[0].length-1){
            list.addAll(mazepathblock(p+" R",maze,row,col+1));
        }
        if(row<maze.length-1){
            list.addAll(mazepathblock(p+" D",maze,row+1,col));
        }
        if(col>0){
            list.addAll(mazepathblock(p+" L",maze,row,col-1));
        }
        if(row>0){
            list.addAll(mazepathblock(p+" U",maze,row-1,col));
        }
        maze[row][col]=prev;
//        list.addAll(mazepathblock(p+" H",maze,row,col+1));
//        list.addAll(mazepathblock(p+" V",maze,row+1,col));
//        list.addAll(mazepathblock(p+" D",maze,row+1,col+1));
        return list;
    }}
