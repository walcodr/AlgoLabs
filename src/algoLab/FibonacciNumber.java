package algoLab;

public class FibonacciNumber {
	public static void main (String[] args) {
	int n = 9;	    
        if (n <= 1) {
            System.out.println(n);
        }
        int lastValue = 0;
        int scndLastValue = 1;
        for (int i = 2; i <= n; i++) {
            int temp = scndLastValue + lastValue;
            lastValue = scndLastValue;
            scndLastValue = temp;
        }
        System.out.println(scndLastValue);
		    
    }
}


	

