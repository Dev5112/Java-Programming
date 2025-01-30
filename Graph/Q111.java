package dev3;
import java.util.*;
public class Q111 {
	    private int vertices; 
	    private LinkedList<Integer>[] adjacencyList;
	    public Q111(int vertices) {
	        this.vertices = vertices;
	        adjacencyList = new LinkedList[vertices];
	        for (int i = 0; i < vertices; i++) {
	            adjacencyList[i] = new LinkedList<>();
	        }}
	    public void addEdge(int source, int destination) {
	        adjacencyList[source].add(destination);
	    }
	    public void BFS(int startVertex) {
	        boolean[] visited = new boolean[vertices]; 
	        Queue<Integer> queue = new LinkedList<>(); 
	        visited[startVertex] = true;
	        queue.add(startVertex);
	        System.out.println("Breadth-First Traversal starting from vertex " + startVertex + ":");
	        while (!queue.isEmpty()) {
	            int currentVertex = queue.poll();
	            System.out.print(currentVertex + " ");
	            for (int adjacentVertex : adjacencyList[currentVertex]) {
	                if (!visited[adjacentVertex]) {
	                    visited[adjacentVertex] = true;
	                    queue.add(adjacentVertex); 
	                }}}
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        Q111 graph = new Q111(6); 
	        graph.addEdge(0, 1);
	        graph.addEdge(0, 2);
	        graph.addEdge(1, 3);
	        graph.addEdge(1, 4);
	        graph.addEdge(2, 4);
	        graph.addEdge(3, 5);
	        graph.addEdge(4, 5);
	        graph.BFS(0);
	    }}


