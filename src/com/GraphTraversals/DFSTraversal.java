package com.GraphTraversals;

import java.util.LinkedList;
import java.util.Stack;

public class DFSTraversal {
    LinkedList<Integer>[] adjList;
    public DFSTraversal(int nodes) {
        this.adjList =new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            adjList[i]= new LinkedList<>();
        }
    }
    
    //Creating Adjacency List
    public void addEdge(int u , int v){
        adjList[u].add(v);
        adjList[v].add(u);
    }
    public void dfsTraversal(int sourceNode , int nodes){
        Boolean[] visited = new Boolean[nodes];
        for(int i=0;i<nodes;i++){
            visited[i]=false;
        }
        Stack<Integer> stack = new Stack();
        stack.push(sourceNode);
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.print(u+" ");
                for(int v : adjList[u]){
                    if(!visited[v]){
                        stack.push(v);
                    }
                }
            }
        }
    }
}
