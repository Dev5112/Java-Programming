/*Write a JAVA program to print the duplicate elements in a given array of n numbers.*/

public class Q5 {
	    public static void printDuplicates(int[] arr) {
	        boolean foundDuplicate = false; 
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {  
	                if (arr[i] == arr[j]) {
	                    System.out.println("Duplicate element: " + arr[i]);
	                    foundDuplicate = true; 
	                    break;}}}
	        if (!foundDuplicate) {
	            System.out.println("No duplicates found.");}}
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 2, 6}; 
	        printDuplicates(arr);}}

