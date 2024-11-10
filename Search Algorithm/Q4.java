/*Given an array of integers, check if a given value is present in the array using recursive Binary
Search algorithm. Display the position of the value if found, and “NOT PRESENT” if not*/

public class Q4 {
	    public static int recursiveBinarySearch(int[] arr, int target, int low, int high) {
	        if (low > high) {
	            return -1; 
	        } else {
	            int mid = (low + high) / 2;
	            if (arr[mid] == target) {
	                return mid; 
	            } else if (arr[mid] < target) {
	                return recursiveBinarySearch(arr, target, mid + 1, high); 
	            } else {
	                return recursiveBinarySearch(arr, target, low, mid - 1); }}}
	        public static void main(String[] args) {
		        int[] arr = {10, 20, 30, 40, 50};
		        int target = 50; 
		        int result = recursiveBinarySearch(arr, target, 0, arr.length - 1);
		        if (result == -1) {
		            System.out.println("NOT PRESENT");
		        } else {
		            System.out.println("Element found at position " + result);}}}
	    
