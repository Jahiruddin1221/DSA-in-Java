package Graphs;

import java.util.ArrayList;

 class allPathSrcToTar {
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
    public static void PathPrint(ArrayList<Edge> graph[], int curr, String path, int tar, boolean vis[]) {
        if (curr == tar) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (vis[e.dest] == false) {
                vis[curr] = true;
                PathPrint(graph, e.dest, path + e.dest, tar, vis);
                vis[curr] = false;                  
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
        int source = 0, target = 5;
        PathPrint(graph, source, "0", target, vis);
    }
}
