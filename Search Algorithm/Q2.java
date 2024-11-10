/*Given an array of integers, check if a given value is present in the array using recursive Linear 
Search algorithm. Display the position of the value if found, and “NOT PRESENT” if not*/

public class Q2 {
	    public static int recursiveLinearSearch(int[] arr, int target, int index) {
	        if (index >= arr.length) {
	            return -1; 
	        } else if (arr[index] == target) {
	            return index; 
	        } else {
	            return recursiveLinearSearch(arr, target, index + 1); }}
	        public static void main(String[] args) {
		        int[] arr = {10, 20, 30, 40, 50};
		        int target = 40;
		        int result = recursiveLinearSearch(arr, target, 0);
		        if (result == -1) {
		            System.out.println("NOT PRESENT");
		        } else {
		            System.out.println("Element found at position " + result);}}}
