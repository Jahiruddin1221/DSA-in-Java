package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

 class DFSandBFS {
    public static class Edge{
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
     public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }
    // Breath First Search (BFS)
    public static void bfs(ArrayList<Edge> graph[], int start, boolean vis[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while (q.size() > 0) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (vis[e.dest] == false) {
                    q.add(e.dest);
                    vis[e.dest] = true;
                }
            }
        }
    }
    // Depth First Search (DFS)
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
        }

    }
    public static void main(String[] args) {
        int v = 7;

        /* Graph design
                1 --- 3
               /      | \
              0       |  5 -- 6
               \      | /
                2 --- 4
        */

        ArrayList<Edge> graph[] = new ArrayList[v];
        CreateGraph(graph);

        boolean vis[] = new boolean[v];

        System.out.println("Breath First Search (BFS): ");
        bfs(graph,0, vis);
        System.out.println("Depth First Search (DFS): ");
        dfs(graph, 0, vis);

    }
}
