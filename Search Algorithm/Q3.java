/*Given an array of integers, check if a given value is present in the array using iterative Binary
Search algorithm. Display the position of the value if found, and “NOT PRESENT” if not*/

public class Q3 {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50};
	        int target = 30; 
	        int result = binarySearch(arr, target);
	        if (result == -1) {
	            System.out.println("NOT PRESENT");
	        } else {
	            System.out.println("Element found at position " + result);}}
	    public static int binarySearch(int[] arr, int target) {
	        int low = 0;
	        int high = arr.length - 1;
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            if (arr[mid] == target) {
	                return mid; n
	            } else if (arr[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;}}
	        return -1; }}
	    
