/*Write a JAVA program to find the minimum spanning tree of a given weighted connected
graph using Kruskal’s algorithm.*/

package dev3;
import java.util.*;
class Edge implements Comparable<Edge> {
    int src, dest, weight;
    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;}
    public int compareTo(Edge other) {
        return this.weight - other.weight;}}
class UnionFind {
    private int[] parent, rank;
    UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;}
    int find(int u) {
        while (u != parent[u]) {
            parent[u] = parent[parent[u]];
            u = parent[u];}
        return u;}
    void union(int u, int v) {
        int rootU = find(u), rootV = find(v);
        if (rootU != rootV) {
            if (rank[rootU] > rank[rootV]) parent[rootV] = rootU;
            else if (rank[rootU] < rank[rootV]) parent[rootU] = rootV;
            else {
                parent[rootV] = rootU;
                rank[rootU]++;}}}}
public class Q113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices and edges: ");
        int vertices = sc.nextInt(), edges = sc.nextInt();
        Edge[] edgeList = new Edge[edges];
        System.out.println("Enter edges (src dest weight):");
        for (int i = 0; i < edges; i++) {
            int src = sc.nextInt(), dest = sc.nextInt(), weight = sc.nextInt();
            edgeList[i] = new Edge(src, dest, weight);}
        Arrays.sort(edgeList);
        UnionFind uf = new UnionFind(vertices);
        List<Edge> mst = new ArrayList<>();
        int mstWeight = 0;
        for (Edge edge : edgeList) {
            if (uf.find(edge.src) != uf.find(edge.dest)) {
                uf.union(edge.src, edge.dest);
                mst.add(edge);
                mstWeight += edge.weight;}}
        System.out.println("Minimum Spanning Tree edges:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);}
        System.out.println("Total weight: " + mstWeight);
    }
}
