package com.GraphTraversals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total nodes : ");
        int nodes = sc.nextInt();
        BFSTraversal graph1 = new BFSTraversal(nodes);
        DFSTraversal graph2 = new DFSTraversal(nodes);
        System.out.println("Enter Edges count :");
        int edges = sc.nextInt();
        int i=1;
        while(edges-->0){
            System.out.println("Enter source & dest vertice "+i+":");
            int svertice = sc.nextInt();
            int dvertice = sc.nextInt();
            //graph1.addEdge(svertice,dvertice);
            graph2.addEdge(svertice,dvertice);
            i++;
        }

        System.out.println("Enter source node : ");
        int snode = sc.nextInt();
        //graph1.bfsTraversal(snode,nodes);
        graph2.dfsTraversal(snode,nodes);

    }
}
