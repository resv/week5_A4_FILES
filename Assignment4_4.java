/*	WEEK 5 ASSIGNMENT 4 - FILES
	4.	STUDENTS REVISITED
		Create a method in your Student class called getInfo(), which prints a line that looks like this:
		My name is Mike. I'm in grade 15 and I have a 4.0 GPA. For now, at least...
	
		Create three files on your desktop named: names, grades, and gpas.
		Create 10 lines of information in each file.
		Read the lines of each file and store their contents in their own arrays.
		Create an array of type Student[] and fill it using those arrays.
		To confirm your work, loop through your Student[] array and call the getInfo method on each Student
*/


//---------------------------------------------------------------------------------------------------


package week5_A4_FILES;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4_4 {

		public static void main(String[] args) throws FileNotFoundException {

//	INITIALIZE STUDENT CLASS
			
//	FILE CONSTRUCTORS		
			File nameFile = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
																+ "\\src\\week5_A4_FILES\\FILE_BANK\\4_4_FILES\\name.txt");	
			
			File gradeFile = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
																+ "\\src\\week5_A4_FILES\\FILE_BANK\\4_4_FILES\\grade.txt");	
			
			File gpaFile = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
																+ "\\src\\week5_A4_FILES\\FILE_BANK\\4_4_FILES\\gpa.txt");
			
//	INITIALIZE ALL READERS INSTANCES IN THE FILE LOCATIONS		
			Scanner nameReader = new Scanner(nameFile);
			Scanner gradeReader = new Scanner(gradeFile);
			Scanner gpaReader = new Scanner(gpaFile);
			
//	WELCOME MSG		
			System.out.println("I will gather Name + Grade + GPA, from 3 different files and print them out together!");
			
//	INITIALIZE ARRAYLISTS
			ArrayList<String> nameList = new ArrayList<String>();
			ArrayList<String> gradeList = new ArrayList<String>();
			ArrayList<Double> gpaList = new ArrayList<Double>(); 
			Student2[] studentArr = new Student2[10];
							
//	WHILE LOOP TO GET NAME, GRADE, GPA and INSERT TO THE INDEX OF THE ARRAYLISTS
			while (nameReader.hasNextLine()) {
				String name = nameReader.nextLine();
				nameList.add(name);
			}
		
			while (gradeReader.hasNextLine()) {
				String grade = gradeReader.nextLine();
				gradeList.add(grade);
			}
				
			while (gpaReader.hasNextLine()) {
				double gpa = gpaReader.nextDouble();
				gpaList.add(gpa);
			}
				
//USING FOR LOOP TO ADD EACH ELEMENT OF THE ARRAYLISTS TO ONE STUDENT ARRAY
	System.out.println("First, printing from ArrayLists, adding ArrayList elements into Array, then implementing getInfo() per loop");
		for (int i = 0; i < studentArr.length; i++){
			/* USED FOR TESTING
			System.out.println("Name: " + nameList.get(i) + " / Grade: " + gradeList.get(i) + " / GPA: " + gpaList.get(i)); */
			studentArr[i] = new Student2(nameList.get(i), gradeList.get(i), gpaList.get(i));
			studentArr[i].getInfo();   /*CALLING METHOD PER LOOP*/
		}
		
//	CLOSES ALL READERS
			nameReader.close();
			gradeReader.close();
			gpaReader.close();
		}
}