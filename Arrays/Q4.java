/*Given an unsorted array of n elements, write a JAVA program to find the first
element, which is repeated.*/

public class Q4 {
	    public static Integer findFirstRepeated(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    return arr[i]; }}}
	        return null; }
	    public static void main(String[] args) {
	        int[] arr = {5, 1, 3, 4, 2, 3, 1};
	        Integer firstRepeated = findFirstRepeated(arr);
	        if (firstRepeated != null) {
	            System.out.println("The first repeated element is: " + firstRepeated);
	        } else {
	            System.out.println("No repeated elements found.");}}}

