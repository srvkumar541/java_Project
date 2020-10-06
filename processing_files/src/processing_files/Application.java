package processing_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		for(int i=0; i<=3 ;i++) {
//			
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Please enter some text");
//			String input = sc.nextLine();
//			System.out.println(input);
//			
//		}
	
		try {
			File file = new File("myfile.txt");
			Scanner input;
			input = new Scanner(file);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyFileUtils myUtils = new MyFileUtils();
		try {
			System.out.println(myUtils.subtract10FromlargerNumber(9));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
