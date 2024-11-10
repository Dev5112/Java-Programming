package dev6;
public class Q3 {
	    public static int recursiveFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * recursiveFactorial(n - 1);}}
	     public static void main(String[] args) {
	        int num = 5;
	        int factorial = recursiveFactorial(num);
	        System.out.println("The factorial of " + num + " is: " + factorial);}}
