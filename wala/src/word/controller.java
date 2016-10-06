package word;

import java.io.IOException;
import wala.InputHelper;

public class controller {

		public static void main(String[] args) throws IOException {
		
	String hey;
	
	hey = InputHelper.getString("Enter letter: ");
	
	if (hey.matches("[a-zA-Z]+") && hey.length() == 1)
	{
	do{
		hey = InputHelper.getString("Enter letter: ");
	        
	} while (hey.matches("[a-zA-Z]+") && hey.length() == 1);
	}

	String str;
			str = InputHelper.getString("Enter String: ");
	    
	    
			String reverse = new StringBuffer(str).reverse().toString();
	    {
	        System.out.println(reverse);
	    }


	}		
	
	
		}


	
	

