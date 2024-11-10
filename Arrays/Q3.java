/*Given an array of integers, write a JAVA program to find, if reversing a sub-array makes 
the array sorted*/

public class Q3 {
	    public static void main(String[] args) {
	        int[] arr = {1, 5, 3, 4, 2, 6};
	        boolean result = canBeSortedByReversingSubArray(arr);
	        System.out.println("Can the array be sorted by reversing a sub-array? " + result);}
	    public static boolean canBeSortedByReversingSubArray(int[] arr) {
	        int n = arr.length;
	        int start = -1, end = -1;
	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                start = i;
	                break;}}
	        if (start == -1) return true;
	        for (int i = n - 1; i > 0; i--) {
	            if (arr[i - 1] > arr[i]) {
	                end = i;
	                break;}}
	        reverse(arr, start, end);
	        return isSorted(arr);}
	    private static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;}}
	    private static boolean isSorted(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                return false;}}
	        return true;}}
	    



