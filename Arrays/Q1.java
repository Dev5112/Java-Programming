/*Given an array of positive numbers, a reduction operation involves subtracting the smallest 
number of the array from each element of the array. Write a JAVA program to perform 
reduction till no elements left in the array. Print the elements left after each reduction and 
total number of reductions performed*/

import java.util.*;
public class Q1 {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50};
	        int reductions = 0;
	        while (arr.length > 0) {
	            System.out.println("Array before reduction: " + Arrays.toString(arr));
	            int min = findMin(arr);
	            arr = reduceArray(arr, min);
	            reductions++;
	            System.out.println("Array after reduction: " + Arrays.toString(arr));
	            System.out.println();}
	        System.out.println("Total number of reductions: " + reductions);}
	    public static int findMin(int[] array) {
	        int min = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];}}
	        return min;}
	    public static int[] reduceArray(int[] array, int min) {
	        int[] reducedArray = new int[array.length];
	        for (int i = 0; i < array.length; i++) {
	            reducedArray[i] = array[i] - min;}
	        return removeZeroes(reducedArray);}
	    public static int[] removeZeroes(int[] array) {
	        int count = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] != 0) {
	                count++;}}
	        int[] newArray = new int[count];
	        int j = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] != 0) {
	                newArray[j] = array[i];
	                j++;}}
	        return newArray;}}
	   


