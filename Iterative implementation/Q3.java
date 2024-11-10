package dev5;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        System.out.print("Enter the number of positions to rotate: ");
        int k = sc.nextInt();
        rotatebyk(arr, k);
        System.out.println("Rotated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");}}
    public static void rotatebyk(int[] arr, int k) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);}
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;}}}
        