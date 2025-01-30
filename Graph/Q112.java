/*Write a JAVA program to perform the Depth First traversal (DFS) on a given graph.*/

package dev3;
import java.util.*;
public class Q112 {
	    private int vertices; 
	    private LinkedList<Integer>[] adjacencyList; 
	    public Q112(int vertices) {
	        this.vertices = vertices;
	        adjacencyList = new LinkedList[vertices];
	        for (int i = 0; i < vertices; i++) {
	            adjacencyList[i] = new LinkedList<>();}}
	    public void addEdge(int source, int destination) {
	        adjacencyList[source].add(destination);}
	    private void DFSUtil(int vertex, boolean[] visited) {
	        visited[vertex] = true;
	        System.out.print(vertex + " ");
	        for (int adjacentVertex : adjacencyList[vertex]) {
	            if (!visited[adjacentVertex]) {
	                DFSUtil(adjacentVertex, visited);}}}
	    public void DFS(int startVertex) {
	        boolean[] visited = new boolean[vertices]; 
	        System.out.println("Depth-First Traversal starting from vertex " + startVertex + ":");
	        DFSUtil(startVertex, visited);
	        System.out.println();}
	    public static void main(String[] args) {
	        Q112 graph = new Q112(6); 
	        graph.addEdge(0, 1);
	        graph.addEdge(0, 2);
	        graph.addEdge(1, 3);
	        graph.addEdge(1, 4);
	        graph.addEdge(2, 4);
	        graph.addEdge(3, 5);
	        graph.addEdge(4, 5);
	        graph.DFS(0);}}


