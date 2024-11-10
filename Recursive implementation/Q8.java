/*Given an unsorted array with both positive and negative elements, write a JAVA program to 
find the smallest positive number missing from the array*/

public class Q8 {
	    public static int recursiveSPos(int[] arr, int current) {
	        if (current > arr.length) {
	            return current;
	        } else {
	            boolean present = false;
	            for (int i = 0; i < arr.length; i++) {
	                if (arr[i] == current) {
	                    present = true;
	                    break;}}
	            if (!present) {
	                return current;
	            } else {
	                return recursiveSPos(arr, current + 1);}}}
	    public static void main(String[] args) {
	        int[] arr = {3, -2, 1, 5, -4, 2};
	        int smallestPositive = recursiveSPos(arr, 1);
	        System.out.println("The smallest positive number missing from the array is: " + smallestPositive);
	    }}
