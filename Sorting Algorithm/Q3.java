/*Write a JAVA program to arrange n numbers present in a given array in ascending order using 
Selection sort algorithm*/

public class Q3 {
	    public static void main(String[] args) {
	        int[] arr = {25, 12, 22, 11};
	        int n = arr.length;
	        selectionSort(arr);
	        System.out.println("Sorted array:");
	        printArray(arr);}
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;}}
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;}}
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");}}}
	        
