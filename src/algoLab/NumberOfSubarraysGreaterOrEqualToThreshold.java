package algoLab;

import java.util.*;
public class NumberOfSubarraysGreaterOrEqualToThreshold {
	public static void main (String[] args) {	

	    int[] arr = {9,3,7,1,4,8,11,2,5,10,12};
	    int k = 6; 
	    int threshold = 3;
	   
        int count = 0;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        if ((windowSum / k) >= threshold) {
            count++;
        }

        double average = 0;
        for (int i = 0; i < arr.length - k; i++) {
            windowSum = windowSum - arr[i] + arr[i + k];
            average = windowSum / k;
            if (average >= threshold) {
                count++;
            }
        }

        System.out.println(count);
    }

}
  

	

