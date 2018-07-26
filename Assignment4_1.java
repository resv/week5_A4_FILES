/*	WEEK 5 ASSIGNMENT 4 - FILES
	1.	Reading a single file
		Create one file on your desktop named hello
		Fill the file with two lines:
		Hello
		World
		
		Create a program to print the lines of the file.
		Modify the program to print the lines of the file backwards.
		Add more content to the file and see if you can make your program work.
*/


//		---------------------------------------------------------------------------------------------------


package week5_A4_FILES;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment4_1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		
//	LOCATION OF TXT FILE IN MY CLOUD FOLDER
		String location = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK\\hello.txt";
//	CREATES AN INSTANCE OF THE OBJECT NAME FILE IN THE TXT FILE	
		File file = new File(location);
//	OPENS SCANNER
		Scanner input = new Scanner(file);
		
//	ASSIGN DATA VARIABLE TO EVERY NEXT DATA SLOT
		String data = "";
//	WHILE LOOP TO CONTINUE IF THERE IS A NEXT LINE
		while (input.hasNextLine()) {
			data = input.nextLine();
//	PRINTS OUT DATA VARIABLE INTO CONSOLE
			System.out.println(data);
		}
//	CLOSE READER
		input.close();
	}
}
		
	

