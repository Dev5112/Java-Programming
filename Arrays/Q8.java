/*Given a list n numbers, write a JAVA program to find the element that appears
maximum number of times.*/

public class Q8 {
	    public static void main(String[] args) {
	        int[] numbers = {1, 3, 2, 3, 4, 3, 2, 1}; 
	        int maxElement = findMaxOccurrence(numbers);
	        System.out.println("Element with maximum occurrences: " + maxElement);}
	    public static int findMaxOccurrence(int[] arr) {
	        int maxCount = 0; 
	        int maxElement = arr[0]; 
	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[j] == arr[i]) {
	                    count++;}}
	            if (count > maxCount) {
	                maxCount = count;
	                maxElement = arr[i];}}
	        return maxElement;}}

