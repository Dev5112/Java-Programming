/*Given an array of integers, check if a given value is present in the array using iterative Linear 
Search algorithm. Display the position of the value if found, and “NOT PRESENT” if not*/

public class Q1{
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50};
	        int target = 30;
	        int result = linearSearch(arr, target);
	        if (result == -1) {
	            System.out.println("NOT PRESENT");
	        } else {
	            System.out.println("Element found at position " + result);}}
	    public static int linearSearch(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i; }}
	        return -1; }}
	    

