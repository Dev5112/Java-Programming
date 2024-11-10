/*Write a JAVA program to convert a given decimal number to its hexadecimal equivalent*/

public class Q6 {
	    public static String recursiveDecimalToHexadecimal(int decimal) {
	        if (decimal == 0) {
	            return "0";
	        } else {
	            int remainder = decimal % 16;
	            String hexRemainder = getHexDigit(remainder);
	            return recursiveDecimalToHexadecimal(decimal / 16) + hexRemainder;}}
	    public static String getHexDigit(int remainder) {
	        switch (remainder) {
	            case 10:
	                return "A";
	            case 11:
	                return "B";
	            case 12:
	                return "C";
	            case 13:
	                return "D";
	            case 14:
	                return "E";
	            case 15:
	                return "F";
	            default:
	                return String.valueOf(remainder);}}
	    public static void main(String[] args) {
	        int decimal = 223;
	        String hexadecimal = recursiveDecimalToHexadecimal(decimal);
	        System.out.println("The hexadecimal equivalent of " + decimal + " is: " + hexadecimal);
	    }}
