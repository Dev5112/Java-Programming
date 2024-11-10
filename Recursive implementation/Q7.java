package dev6;
public class Q7 {
	    public static double recursivePower(double base, int exponent) {
	        if (exponent == 0) {
	            return 1;
	        } else if (exponent < 0) {
	            return 1 / recursivePower(base, -exponent);
	        } else {
	            return base * recursivePower(base, exponent - 1);}}
	    public static void main(String[] args) {
	        double base = 2.5;
	        int exponent = 3;
	        double result = recursivePower(base, exponent);
	        System.out.println("The " + exponent + "rd power of " + base + " is: " + result);}}
