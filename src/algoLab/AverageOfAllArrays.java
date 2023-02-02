package algoLab;

import java.util.*;
public class AverageOfAllArrays {
	public static void main (String[] args) {	
		
		List < Integer > nums = new ArrayList<>();
		int k = 5;
		 
		nums.add(1);
		nums.add(3);
		nums.add(2);
		nums.add(6);
		nums.add(-1);
		nums.add(4);
		nums.add(1);
		nums.add(8);
		nums.add(2);
		 
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums.get(i);
        }
        double average = windowSum / k;
        List < Double > result = new ArrayList < > ();
        result.add(average);

        for (int i = 0; i < nums.size() - k; i++) {
            windowSum = windowSum - nums.get(i) + nums.get(i + k);
            average = windowSum / k;
            result.add(average);
        }

        System.out.println(result);
    }
  
}

	

