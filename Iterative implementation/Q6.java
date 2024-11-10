package dev5;
import java.util.*;
public class Q6 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the array:");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.print("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();}
	        Arrays.sort(arr);
	        int[] result = new int[n];
	        int maxIndex = n - 1;
	        int minIndex = 0;
	        for (int i = 0; i < n; i++) {
	            if (i % 2 == 0) {
	                result[i] = arr[maxIndex--];
	            } else {
	                result[i] = arr[minIndex++];}}
	        System.out.print("The reordered array is:");
	        for (int num : result) {
	            System.out.print(num + " ");}}}
	       

