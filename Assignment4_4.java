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
																+ "\\src\\week5_A4_FILES\\FILE_BANK\\4_3_FILES\\name.txt");	
			
			File gradeFile = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
																+ "\\src\\week5_A4_FILES\\FILE_BANK\\4_3_FILES\\grade.txt");	
			
			File gpaFile = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
																+ "\\src\\week5_A4_FILES\\FILE_BANK\\4_3_FILES\\gpa.txt");
			
//	INITIALIZE ALL WRITER INSTANCES IN THE FILE LOCATIONS		
			FileWriter nameWriter = new FileWriter(nameFile, true);
			FileWriter gradeWriter = new FileWriter(gradeFile, true);
			FileWriter gpaWriter = new FileWriter(gpaFile, true);
			
//	WELCOME MSG		
			Scanner reader = new Scanner(System.in);
			System.out.println("I will write the student's name, grade, and GPA in 3 seperate files.");
			
//	GETS NAME, SETS VALUE TO STUDENT INSTANCE, THEN WRITES VALUE INTO FILE			
			System.out.println("What is the student's name ?");	
			String name = reader.nextLine();
			student.setName(name);
			nameWriter.write(student.getName());
		
//	GETS GRADE, SETS VALUE TO STUDENT INSTANCE, THEN WRITES VALUE INTO FILE			
			System.out.println("What is the student's grade?");
			String grade = reader.nextLine();
			student.setGrade(grade);
			gradeWriter.write(student.getGrade());
		
//	GETS GPA, SETS VALUE TO STUDENT INSTANCE, THEN WRITES VALUE INTO FILE
			System.out.println("What is the student's GPA?");
			double gpa = reader.nextDouble();
			student.setGpa(gpa);
			gpaWriter.write(Double.toString(student.getGpa()));
			
//	CLOSES CONSOLE READER
			reader.close();
//	CLOSES ALL WRITERS
			nameWriter.close();
			gradeWriter.close();
			gpaWriter.close();
		}
}