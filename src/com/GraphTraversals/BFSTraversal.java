package com.GraphTraversals;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    LinkedList<Integer>[] adjlist ;
    public BFSTraversal(int nodes) {
      this.adjlist = new LinkedList[nodes];
      for(int i=0;i<nodes;i++){
          this.adjlist[i]= new LinkedList<>();
      }
    }

    public void addEdge(int u , int v){
       adjlist[u].add(v);
       adjlist[v].add(u);
    }

    public void bfsTraversal(int sourceNode , int nodes){
        Queue<Integer> q = new LinkedList<Integer>();
        Boolean[] visited = new Boolean[nodes];
        for(int i=0;i<nodes;i++){
            visited[i]=false;
        }
        visited[sourceNode]=true;
        q.offer(sourceNode);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" ");
            for(int v : adjlist[u]){
                if(!visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }
    }
}
