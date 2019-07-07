package codewars_kyu6;

import java.util.ArrayList;




public class CountingDuplicates {
	
		public static void main(String [] args) {
			
			duplicateCount("abcde");
			
		}
	
	  public static int duplicateCount(String text) {
	  
	  //char[] arr = text.toCharArray();
	  
	  Character[] charArray = 
			  text.chars().mapToObj(c -> (char)c).toArray(Character[]::new); 
	  
	  ArrayList arDup = new ArrayList<String>();
	  
	  int countChar = 0;
	  
	  for (int i = 0; i < charArray.length; i++) {
		  
		  for (int j = i+1; j < charArray.length; j++) {
			  //t e s t e r
			  if (charArray[j].equals(charArray[i])) {
				  if (!arDup.contains(charArray[j])) {
					  arDup.add(charArray[j]);
				  }
				 
			  }
			  
		  }
		  
	  }
	    
		  System.out.println(arDup);
		  return arDup.size();
	  }
	}