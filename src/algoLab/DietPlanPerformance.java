package algoLab;

import java.util.*;

public class DietPlanPerformance {
	public static void main (String[] args) {	
		int[] calories = {23,14,30,8,5,50,12,24,3,14,5,76}; 
		int k = 3;
		int lower = 40;
		int upper = 20;
        int windowSum = 0;
		
        
        for (int i = 0; i < k; i++) {
            windowSum += calories[i];
        }
        int points = 0;

        if (windowSum < lower) {
            points -= 1;
        }
        if (windowSum > upper) {
            points += 1;
        }

        for (int i = 0; i < calories.length - k; i++) {
            windowSum = windowSum - calories[i] + calories[i + k];
            if (windowSum < lower) {
                points -= 1;
            }
            if (windowSum > upper) {
                points += 1;
            }
        }
		
        System.out.println(points);
    }

}
  

	

