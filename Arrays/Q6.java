package dev8;
public class m3 {
	    public static int findMissingNumber(int[] arr, int n) {
	        int expectedSum = n * (n + 1) / 2;
	        int actualSum = 0;
	        for (int num : arr) {
	            actualSum += num;}
	        return expectedSum - actualSum;}
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 5, 6}; 
	        int n = 6; 
	        int missingNumber = findMissingNumber(arr, n);
	        System.out.println("The missing number is: " + missingNumber);}}

