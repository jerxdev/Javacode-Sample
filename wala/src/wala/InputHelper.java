package wala;
import java.io.*;

public class InputHelper {



			public static String getString(String message)
					throws IOException {
						
					BufferedReader reader =
								new BufferedReader (new InputStreamReader (System.in));
					
					System.out.print(message);
					String input = reader.readLine();
					return input;
				
			}

			
			public static int readInt(String message)
				throws IOException {
				
				BufferedReader reader =
						new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print(message);
				int value = Integer.parseInt(reader.readLine());
				return value;
			}
			
			
			public static char readchar(String message)
				throws IOException{
				
				BufferedReader reader =
						new BufferedReader(new InputStreamReader(System.in));
						
				System.out.print(message);
				char value = parseChar(reader.readLine());
				return value;
			}


			private static char parseChar(String readLine) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}

		
		
		
		
		
		
	