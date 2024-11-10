package dev6;
public class Q4 {
	    public static int recursiveFibonacci(int n) {
	        if (n == 0 || n == 1) {
	            return n;
	        } else {
	            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);}}
	    public static void main(String[] args) {
	        int n = 4;
	        int fibonacci = recursiveFibonacci(n);
	        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci);}}
	   
