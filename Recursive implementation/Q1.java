package dev6;
public class Q1 {
	    public static int recursiveSum(int[] arr, int n) {
	        if (n == 0) {
	            return 0;
	        } else {
	            return arr[n - 1] + recursiveSum(arr, n - 1);}} 
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int n = arr.length;
	        int sum = recursiveSum(arr, n);
	        System.out.println("The sum of the array elements is: " + sum);}}
	    


