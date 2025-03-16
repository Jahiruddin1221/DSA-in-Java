package Graphs;
import java.util.*;

public class random {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Input the number of vertices and edges
            System.out.println("Enter the number of vertices and edges:");
            int v = sc.nextInt();  // 5
            int e = sc.nextInt();  // 6

            // Step 2: Initialize the adjacency list
            ArrayList<Integer>[] graph = new ArrayList[v];
            for (int i = 0; i < v; i++) {
                graph[i] = new ArrayList<>();
            }

            // Step 3: Input edges
            System.out.println("Enter the edges (src dest):");
            for (int i = 0; i < e; i++) {
                int src = sc.nextInt();
                int dest = sc.nextInt();

                // Add the edge to the adjacency list (undirected graph)
                graph[src].add(dest);
                graph[dest].add(src); // Remove this line for directed graphs
            }

            // Step 4: Print the adjacency list to verify the input
            System.out.println("Graph representation (Adjacency List):");
            for (int i = 0; i < v; i++) {
                System.out.print(i + ": ");
                for (int neighbor : graph[i]) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }
