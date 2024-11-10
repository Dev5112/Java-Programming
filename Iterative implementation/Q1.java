package dev5;
import java.util.*;
public class Q1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.print("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int sum = sumOfArrayElements(arr);
	        System.out.println("Sum of array elements is : " + sum);
	    }
	    public static int sumOfArrayElements(int[] arr) {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return sum;
	    }}
	
