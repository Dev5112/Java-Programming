package dev6;
public class Q5 {
	    public static int recursiveGCD(int a, int b) {
	        if (b == 0) {
	            return a;
	        } else {
	            return recursiveGCD(b, a % b);}}
	    public static void main(String[] args) {
	        int num1 = 48;
	        int num2 = 18;
	        int gcd = recursiveGCD(num1, num2);
	        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);}}
	    

