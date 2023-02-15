package algoLab;

import java.util.*;

public class SubstringWithDistinctCharacters {
	public static void main (String[] args) {	
		    String s = "jhgfhgshgvh";
		        int k = 3;

		        if (s.length() < k) {
		            System.out.println(0);
		        }

		        int count = 0;
		        Map < Character, Integer > freq = new HashMap < Character, Integer > ();
		        int windowStart = 0;

		        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
		            if (!freq.containsKey(s.charAt(windowEnd))) {
		                freq.put(s.charAt(windowEnd), 1);
		            } 
		            else {
		                freq.put(s.charAt(windowEnd), freq.get(s.charAt(windowEnd)) + 1);
		            }

		            if (windowEnd >= k - 1) {
		                if (freq.size() == k) {
		                    count++;
		                }

		                if (freq.get(s.charAt(windowStart)) == 1) {
		                    freq.remove(s.charAt(windowStart));
		                } 
		                else {
		                    freq.put(s.charAt(windowStart), freq.get(s.charAt(windowStart)) - 1);
		                }
		                
		                windowStart++;
		            }
		        }

		        System.out.println(count);
		    }

}
  

	

