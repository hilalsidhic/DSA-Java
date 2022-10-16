package com.hilal;

import java.util.ArrayList;

public class DFS {
    public static void DFSofGraph(Integer node, boolean visited[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> path){
        path.add(node);
        visited[node] = true;
        for (Integer it : adj.get(node)) {
            if (!visited[it]){
                DFSofGraph(it,visited,adj,path);
            }
        }
    }

    public static ArrayList<Integer> DFSinit(ArrayList<ArrayList<Integer>> adj,Integer V){
        boolean[] visited= new boolean[V+1];
//        visited[0] = true;
        ArrayList<Integer> path = new ArrayList<>();
        DFSofGraph(0,visited,adj,path);
        return path;
    }
}
