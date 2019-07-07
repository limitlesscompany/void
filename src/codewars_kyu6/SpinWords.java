package codewars_kyu6;

public class SpinWords {

	public String spinWords(String sentence) {
		
		
		String[] words = sentence.split(" ");
	    for (int i=0; i<words.length; i++) {
	      if (words[i].length() >= 5) {
	        words[i] = new StringBuilder(words[i]).reverse().toString();
	      }
	    }
	    return String.join(" ",words);
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//		int rotate = 5;
//
//		String[] words = sentence.split("\\s+");
//		//String answer = "";
//		System.out.println(words[0]);
//		StringBuilder sbMain = new StringBuilder();
//		StringBuilder sbTemp = new StringBuilder();
//		for (int i = 0; i < words.length; i++) {
//			
//			if (words[i].length() >= rotate) {
//				
//				sbTemp.append(words[i]).reverse();
//				
//				sbMain.append(sbTemp + " ");
//				sbTemp.setLength(0);
//			} else {
//				sbMain.append(words[i] + " ");
//			}
//			
//			System.out.println(sbMain);
//		}
//		
//		return sbMain.toString().trim();
	}
}
