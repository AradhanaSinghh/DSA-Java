package com.company;
import java.util.*;

public class graph1 {
    public static int[][] printAdjacency(int n, int m, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<Integer>();
        }

        // Creating the graph.
        for(int i = 0; i < m; i++){

            // Adding adjecent nodes.
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }

        // Create an adjacency list of size 'N'.
        int[][] adjacencyList = new int[n][];

        for(int i = 0; i < n; i++) {
            int graphSize = graph[i].size();
            int[] temp = new int[graphSize + 1];
            temp[0] = i;

            for(int j = 0; j < graph[i].size(); j++) {
                temp[j + 1] = graph[i].get(j);
            }

            adjacencyList[i] = temp;
        }

        return adjacencyList;
    }
    
    public static void main(String[] args) {
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3},
                {1, 3},
                {0, 2},
                {2, 4},
                {0, 4}
        };

        int[][] graph = printAdjacency(5, 7, edges);
        // Printing the content of the graph
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
