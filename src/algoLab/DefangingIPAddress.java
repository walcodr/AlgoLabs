package algoLab;
import java.util.*;
public class DefangingIPAddress {
	public static void main (String[] args) {
		String address = "";	
        StringBuilder ans = new StringBuilder();
        
        for (char ch: address.toCharArray()) {
            if (Character.isDigit(ch)) {
                ans.append(ch);
            } else {
                ans.append("[.]");
            }
        }
	    System.out.println(ans);
	}
}


	

