/*Write a JAVA program to find the element pair with minimum/maximum difference
in a given array of integers.*/

public class Q7 {
	public static void findMaxDifferencePair(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;}
        int minDiff = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        int[] minPair = new int[2];
        int[] maxPair = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < minDiff) {
                    minDiff = diff;
                    minPair[0] = arr[i];
                    minPair[1] = arr[j];}
                if (diff > maxDiff) {
                    maxDiff = diff;
                    maxPair[0] = arr[i];
                    maxPair[1] = arr[j];}}}
        System.out.println("Minimum difference between elements : " + minPair[0] + " and " + minPair[1] + " is " + minDiff);
        System.out.println("Maximum difference between elements : " + maxPair[0] + " and " + maxPair[1] + " is " + maxDiff);}
    public static void main(String args[]) {
        int arr[] = { 5,10,15,20,30 };
        findMaxDifferencePair(arr);}}
       
   




