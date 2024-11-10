package dev5;
import java.util.*;
public class Q8n {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the position : ");
	        int n = sc.nextInt();
	        if (n <= 0) {
	            System.out.print(" Please enter a positive number ");}
	         else if (n == 1) {
	            System.out.print("The Fibonacci number is : 0 ");}
	         else if (n == 2) {
	            System.out.print("The Fibonacci number is : 1 ");}
	         else {
	            int a = 0, b = 1, c = 0;
	            for (int i = 3; i <= n; i++) {
	                c = a + b;
	                a = b;
	                b = c;}
	            System.out.print("The Fibonacci number is : " + c);}}}
	        

