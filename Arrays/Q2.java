package dev8;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7}; 
        int[] array2 = {2, 4, 6, 8}; 
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length); 
        sortTwoArrays(mergedArray, array2);
        System.out.println("Merged Array after sorting: " + Arrays.toString(mergedArray));}
    public static void sortTwoArrays(int[] mergedArray, int[] array2) {
        int i = mergedArray.length - array2.length - 1; 
        int j = array2.length - 1; 
        int k = mergedArray.length - 1; 
        while (i >= 0 && j >= 0) {
            if (mergedArray[i] > array2[j]) {
                mergedArray[k--] = mergedArray[i--];
            } else {
                mergedArray[k--] = array2[j--];}}
        while (j >= 0) {
            mergedArray[k--] = array2[j--];}}}
       
	
	        


