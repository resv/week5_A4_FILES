/*	WEEK 5 ASSIGNMENT 4 - FILES
	2.	READING MULTIPLE FILES
		Create two files on your desktop named courseCode and courseName.
		Fill each file with 2 lines of data.
		Try to print the contents of the files at the same time like so:
		
		CS235 - Object Oriented Programming II
		CS135 - Intro to Object Oriented Programming
		
		Hint: If you can't read both files at the same time, 
		maybe you can store each one in some kind of variable?
*/


//		---------------------------------------------------------------------------------------------------


package week5_A4_FILES;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment4_2 {

	public static void main(String[] args) throws FileNotFoundException {
		
//	LOCATION OF TXT FILE IN MY CLOUD FOLDER
		String location1 = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK\\4_2_FILES\\courseCode.txt";
		String location2 = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK\\4_2_FILES\\courseName.txt";
		

		File file1 = new File(location1);					//	CREATES AN INSTANCE OF THE OBJECT NAME FILE IN THE TXT FILE	
		File file2 = new File(location2);					//	CREATES AN INSTANCE OF THE OBJECT NAME FILE IN THE TXT FILE	

		Scanner reader1 = new Scanner(file1);				//	OPENS SCANNER1
		Scanner reader2 = new Scanner(file2);				//	OPENS SCANNER2

		
		String data1 = "";									//	ASSIGN DATA VARIABLE TO EVERY NEXT DATA SLOT
		String data2 = "";
				
		while (reader1.hasNextLine() && reader2.hasNextLine()) {	//	WHILE LOOP TO CONTINUE IF THERE IS A NEXT LINE
			data1 = reader1.nextLine();
			data2 = reader2.nextLine();
			System.out.println(data1 + " - " +data2);		//	PRINTS OUT DATA VARIABLE INTO CONSOLE
		}
		reader1.close();  									//	CLOSE READER1
		reader2.close();									//	CLOSE READER2
	}
}
