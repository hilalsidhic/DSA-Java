package com.hilal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public ArrayList<Integer> BFSsearch(int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> newarr = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0]=true;
        while (!q.isEmpty()){
            int test = q.poll();
            newarr.add(test);

            for (Integer i:adj.get(test)){
                if (!vis[i]){
                    q.add(i);
                    vis[i] = true;
                }
            }
        }
    return newarr;
    }
}
