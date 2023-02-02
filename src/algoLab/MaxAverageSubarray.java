package algoLab;

import java.util.*;
public class MaxAverageSubarray {
	public static void main (String[] args) {	
		
	int[] nums = {1,12,-5,-6,50,3};
	int k = 4;
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        double maxAverage = windowSum / k;

        for (int i = 0; i < nums.length - k; i++) {
            windowSum = windowSum - nums[i] + nums[i + k];
            double average = windowSum / k;
            maxAverage = Math.max(maxAverage, average);
        }

        System.out.println(maxAverage);
    }
	
}
  

	

