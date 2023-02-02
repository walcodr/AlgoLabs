package algoLab;
import java.util.*;
public class RunningSumsOf1dArray {
	public static void main (String[] args) {
		
	    int[] nums= {1,2,3,4,5,6};
	    
	        for (int i = 1; i < nums.length; i++) {
	            nums[i] += nums[i - 1];
	        }
	        
	        for (int num : nums)
	        System.out.println(num);
	    }
}



	

