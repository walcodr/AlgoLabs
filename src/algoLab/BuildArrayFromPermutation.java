package algoLab;

import java.util.*;
public class BuildArrayFromPermutation {
	public static void main (String[] args) {	
		int[] nums = {0,1,2};
        int[] ans = new int[nums.length * 2];
        int n = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i]; 
            ans[i+n] = nums[i];
        }
        for (int a : ans) 
        	System.out.println(a);
    }
}

	

