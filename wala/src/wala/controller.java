package wala;

import java.io.IOException;
import wala.InputHelper;

public class controller {

		public static void main(String[] args) throws IOException {
		
				int x;
				int count = 0;
				
				x = InputHelper.readInt("Enter number: ");
				
				if (x < 0 && x%2== 0) 
					do{
						count++;
						x = InputHelper.readInt("Enter number: ");
						
						
						}while (x < 0 && x%2== 0);
						
						
						
						System.out.println("valid number is " +count );
			}
		}

	
	

