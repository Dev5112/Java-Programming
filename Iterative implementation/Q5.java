/*Given an unsorted array with both positive and negative elements, write a JAVA program 
to find the smallest positive number missing from the array*/

import java.util.*;
public class Q5 {
	    public static int findSmallestMissingPositive(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] <= 0 || arr[i] > n) {
	                arr[i] = n + 1;}}
	        for (int i = 0; i < n; i++) {
	            int absValue = Math.abs(arr[i]);
	            if (absValue <= n) {
	                if (arr[absValue - 1] > 0) {
	                    arr[absValue - 1] = -arr[absValue - 1];}}}
	        for (int i = 0; i < n; i++) {
	            if (arr[i] > 0) {
	                return i + 1; }}
	        return n + 1;}
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();}
	        int result = findSmallestMissingPositive(arr);
	        System.out.println("Smallest missing positive number: " + result);
	    }}
	        
	       

