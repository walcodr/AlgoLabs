package algoLab;
import java.util.*;
public class NumberOfGoodPairs {
	public static void main (String[] args) {
	int[][] accounts = {{1,2,3},{2,3,4},{3,4,5},{5,6,7}};
	
	        int maxWealth = 0;
	        for (int[] account: accounts) {
	            int wealth = 0;
	            for (int a: account) {
	                wealth += a;
	            }
	            maxWealth = Math.max(maxWealth, wealth);
	        }
        System.out.println(maxWealth);
    }
}
	



	

