package dev5;
import java.util.*;
public class Q7 {
	public static int factorial(int n) {
		int f = 1;
		for ( int i = 2; i<= n;i++) {
			f*=i;}
		return f;}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Factorial is : " +factorial(n));}}
		
			
