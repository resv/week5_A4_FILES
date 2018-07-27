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
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Assignment4_4 {

		public static void main(String[] args) throws IOException {

//	INITIALIZE STUDENT CLASS
			Student2 student = new Student2();
			
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
			
		
			String name = reader.nextLine();
			student.setName(name);
			nameWriter.write(student.getName());
		
			
			String grade = reader.nextLine();
			student.setGrade(grade);
			gradeWriter.write(student.getGrade());
		

			double gpa = reader.nextDouble();
			student.setGpa(gpa);
			gpaWriter.write(Double.toString(student.getGpa()));
			
//	CLOSES ALL READERS
			nameReader.close();
			gradeReader.close();
			gpaReader.close();
		}
}