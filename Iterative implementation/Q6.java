/*Given an unsorted array, write a JAVA program reorder the elements of the array to store 
the numbers as maximum, minimum, second maximum, second minimum, third 
maximum, third minimum, and so on. (I/p: 1 2 3 4 5, O/p: 5 1 4 2 3)*/

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
	            System.out.print(num + " ");
		}}}
	       

