package algoLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class StateFarm {
  /**
   * Iterate through each line of input.
   * @param <E>
   */
  public static <E> void main(String[] args) {
	  
	long startTime = System.currentTimeMillis();
	
    String line = "ADD|Dog";
    String function;
    String input;
    Vector<E> cache = new Vector<E>();
    
      StringTokenizer st = new StringTokenizer(line);
      function = st.nextToken("\\|");
      input = st.nextToken("\\|");
      String[] methods = {"reset",
    		  				"add",
    		  				"get",
    		  				"has",
    		  				"remove"};
      
	
	  try {
		  if ( function.toLowerCase().equals((methods[0]))) {
		      int size = 0;
		      size = reset(cache);
		      System.out.println(size);
		  }
		  else if ( function.toLowerCase().equals(methods[1])) {
		      if(add(input, cache)) {
		        System.out.println("True");
		      }
		      else {
		        System.out.println("False");
		      }
		  }
		  else if ( function.toLowerCase().equals(methods[2])) {
		     	System.out.println(get(input, cache));
		  }
		  else if (function.toLowerCase().equals(methods[3])) {
		  	  System.out.println(has(input, cache));
		  }
		  else if (function.toLowerCase().equals(methods[4])) {
			  System.out.println(remove(input, cache));
		  }
		  else throw new Exception("Input not valid :: ");
		  
		  long endTime = System.currentTimeMillis();
		  long elapsedTime = endTime - startTime;
		  
		  System.out.println("Time in milliseconds : " + elapsedTime);
	  }      
	  catch(Exception ex) {
		  ex.printStackTrace();
	  }
  	
  }












  public static int reset(Vector cache) {
      int size = 0;
      cache.removeAllElements();
      return cache.size();
    }
  
  public static boolean add(String input, Vector cache) {
      if(cache.add(input)) {
        return true;
      }
      else {
        return false;
      }
    }

    public static String get(String input, Vector cache) {
      if(cache.contains(input)) {
        return input;
      }
      else {
        return "NULL";
      }
    }

    public static boolean has(String input, Vector cache) {
      return cache.contains(input);
    }

    public static boolean remove(String input, Vector cache) {
      if(cache.contains(input)) {
        cache.remove(input);
        return true;
      }
      else {
        return false;
      }
    }
    
    
    
    }
