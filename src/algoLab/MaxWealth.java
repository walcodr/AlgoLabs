package algoLab;

public class MaxWealth {
	public static void main (String[] args) {
	
	    int[][] accounts = {{45,17,4},{52,3,28},{9,70,12},{1,45,90}};
	    
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