package algoLab;


public class ValidAnagram {
	public static void main (String[] args) {
		String s = "programming";
		String t = "ginmargromp"; 
		
		boolean result = true;
	
        if (s.length() != t.length()) {
            result = false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            System.out.println((s.charAt(i) - 'a') + " - s.count: " + counts[s.charAt(i) - 'a']);
            
            counts[t.charAt(i) - 'a']--;
            System.out.println((t.charAt(i) - 'a') + " - t.count: " + counts[t.charAt(i) - 'a']);
        }

        for (int count: counts) {
            if (count != 0) {
            	result = false;
            }
        }
        System.out.println(result);
	}
}
	

