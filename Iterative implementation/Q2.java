package dev5;
import java.util.*;
public class Q2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();}
	        int max = findMax(arr);
	        int min = findMin(arr);
	        System.out.println("The maximum element in the array is: " + max);
	        System.out.println("The minimum element in the array is: " + min);}
	    public static int findMax(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];}}
	        return max;}
	    public static int findMin(int[] arr) {
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];}}
	        return min;}}
	    
