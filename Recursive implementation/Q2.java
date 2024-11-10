/*Write a JAVA program to find the maximum and minimum elements in an array*/

public class Q2 {
	    public static int recursiveMax(int[] arr, int n) {
	        if (n == 1) {
	            return arr[0];
	        } else {    
	            int max = Math.max(arr[n - 1], recursiveMax(arr, n - 1));
	            return max;}}
	    public static int recursiveMin(int[] arr, int n) {
	        if (n == 1) {
	            return arr[0];
	        } else {
	            int min = Math.min(arr[n - 1], recursiveMin(arr, n - 1));
	            return min;}}
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 3, 1, 6, 4};
	        int n = arr.length;
	        int max = recursiveMax(arr, n);
	        int min = recursiveMin(arr, n);
	        System.out.println("The maximum element in the array is: " + max);
	        System.out.println("The minimum element in the array is: " + min);}}
	    


