/*	WEEK 5 ASSIGNMENT 4 - FILES
	3.	STORING A STUDENT

	Create a class named Student which contains student information.
	Specifically, create three variables: name, grade, and gpa.

	Create an instance of type Student and read the values from user input.
	Create three files on your desktop named: names, grades, and gpas.
	
	Store the information from this Student in those files.
	(name stored in names, grade => grades, gpa => gpas)
*/


//	---------------------------------------------------------------------------------------------------


package week5_A4_FILES;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment4_3 {

		public static void main(String[] args) throws IOException {

//	INITIALIZE STUDENT CLASS
			Student1 student = new Student1();
			
//	FILE CONSTRUCTORS		
//			File nameFile = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
//																+ "\\src\\week5_A4_FILES\\FILE_BANK\\4_3_FILES\\name.txt");	
			
			String directory = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE";
			String source = ("\\src\\week5_A4_FILES\\FILE_BANK");
			String specific = ("4_3_FILES\\name.txt");
			
			File nameFile = new File(directory + source + specific);	
			
			
			File gradeFile = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
																+ "\\src\\week5_A4_FILES\\FILE_BANK\\4_3_FILES\\grade.txt");	
			
			File gpaFile = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
																+ "\\src\\week5_A4_FILES\\FILE_BANK\\4_3_FILES\\gpa.txt");
			
//	INITIALIZE ALL WRITER INSTANCES IN THE FILE LOCATIONS		
			FileWriter nameWriter = new FileWriter(nameFile, false);
			FileWriter gradeWriter = new FileWriter(gradeFile, false);
			FileWriter gpaWriter = new FileWriter(gpaFile, false);
			
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

	
