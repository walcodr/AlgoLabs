package algoLab;

public class PalindromeNumber {
	public static void main (String[] args) {
		int x = 1551;
		boolean result = false;
	        if (x < 0)
	            System.out.println(result);
	
	        int reverseNumber = 0;
	        int number = x;
	
	        while (number > 0) {
	            reverseNumber = reverseNumber * 10 + number % 10;
	            number = number / 10;
	            System.out.println("Reverse Number: " + reverseNumber);
	            System.out.println("Number: " + number);
	        }
	
	        result = x == reverseNumber;
	        System.out.println(result);
	    }
}
