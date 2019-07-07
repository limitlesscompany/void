package codewars_kyu7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPIN {
	
	
	public static void main(String [] args)  {
		
		String pin = "12345";
		
		System.out.println(validatePin(pin));
		System.out.println(Pattern.matches("\\d{4,4}","123456"));
	}

  public static boolean validatePin(String pin) {
	  
	  return pin.matches("\\d{4}|\\d{6}");
	  	/*
	    Pattern p = Pattern.compile("\\d{4}");
	    
	    String candidate = pin;
	    Matcher m = p.matcher(candidate);
	    if (Pattern.matches("\\d{4}", candidate) || Pattern.matches("\\d{6}", candidate) ) {
	    	return true;
	    }
	    return false;
	    */
  }
}


