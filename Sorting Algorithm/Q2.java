/*Write a JAVA program to arrange n numbers present in a given array in ascending order 
using Insertion sort algorithm*/

public class Q2 {
	    public static void main(String[] args) {
	        int[] arr = {34, 25, 12, 22, 90};
	        int n = arr.length;
	        insertionSort(arr);
	        System.out.println("Sorted array:");
	        printArray(arr);}
	    public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; i++) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;}
	            arr[j + 1] = key;}}
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");}}}
	        
	 
