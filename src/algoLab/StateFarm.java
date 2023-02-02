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
  public static <E> void main(String[] args) throws IOException {
    //InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    //BufferedReader in = new BufferedReader(reader);
    String line = "Get|Dog";
    String function;
    String input;
    Vector<E> cache = new Vector<E>();
    
      StringTokenizer st = new StringTokenizer(line);
      function = st.nextToken("\\|");
      input = st.nextToken("\\|");
      
      System.out.println(function + "++");
      System.out.println(input + "++");

  
  switch (function)
  {
	  case "Reset":
	      int size = 0;
	      cache.removeAllElements();
	      size = cache.size();
	      System.out.println(size);
	      break;
	  case "Add":
	      if(cache.add((E) input)) {
	        System.out.println("True");
	      }
	      else {
	        System.out.println("False");
	      }
	      break;
	  case "Get":
	      if(cache.contains(input)) {
	        System.out.println(input);
	      }
	      else {
	        System.out.println("NULL");
	      }
	      break;
	  case "Has":
	  	  if(cache.contains(input)) {
	        System.out.println("True");
	      }
	      else {
	        System.out.println("False");
	      }
	  	  break;
	  case "Remove":
	      if(cache.contains(input)) {
	        cache.remove(input);
	        System.out.println("True");
	      }
	      else {
	        System.out.println("False");
	      }
	      break;
	      
	      
  	}
  }
}










/*
public static int Reset(Vector cache) {
	  case (function.equals("Reset")) 
      int size = 0;
      cache.removeAllElements();
      cache.size();
      return size;
    }
  
  public static boolean Add(String input, Vector cache) {
      if(cache.add(input)) {
        return true;
      }
      else {
        return false;
      }
    }

    public static String Get(String input, Vector cache) {
      if(cache.contains(input)) {
        return input;
      }
      else {
        return "NULL";
      }
    }

    public static boolean Has(String input, Vector cache) {
      return cache.contains(input);
    }

    public static boolean Remove(String input, Vector cache) {
      if(cache.contains(input)) {
        cache.remove(input);
        return true;
      }
      else {
        return false;
      }
    }
*/
