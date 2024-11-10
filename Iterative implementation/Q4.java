/*Write a JAVA program to find the largest sum contiguous subarray in an array. A largest 
sum contiguous subarray is a subarray of the original array whose elements are present 
contiguously and has a sum of the elements that is maximum among all the contiguous 
subarrays*/

import java.util.*;
public class Q4 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();}
	        int maxSum = maxSumContiguousSubarray(arr);
	        System.out.println("Largest sum contiguous subarray is " + maxSum);}
	    public static int maxSumContiguousSubarray(int[] arr) {
	        int maxSoFar = arr[0];
	        int maxEndingHere = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
	            maxSoFar = Math.max(maxSoFar, maxEndingHere);}
	        return maxSoFar;}}
	    
