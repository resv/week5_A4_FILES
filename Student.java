/*	WEEK 5 ASSIGNMENT 4 - FILES
  	3.	STORING A STUDENT
	
		Create a class named Student which contains student information.
		Specifically, create three variables: name, grade, and gpa.

		Create an instance of type Student and read the values from user input.
		Create three files on your desktop named: names, grades, and gpas.
		
		Store the information from this Student in those files.
		(name stored in names, grade => grades, gpa => gpas)
*/


//		---------------------------------------------------------------------------------------------------


package week5_A4_FILES;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {

//	INITIALIZE VARIABLES
		private String name;
		private char grade;
		private double gpa;
		
//	SETTERS AND GETTERS
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public char getGrade() {
			return grade;
		}
		public void setGrade(char grade) {
			this.grade = grade;
		}
		public double getGpa() {
			return gpa;
		}
		public void setGpa(double gpa) {
			this.gpa = gpa;
		}


//	MAIN --------------------------------------------------------------

	public static void main(String[] args) throws IOException {

	Student student = new Student();
	
	String nameFile = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK\\4_3FILES\\name";
	String gradeFile = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK\\4_3FILES\\grade";
	String gpaFile = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK\\4_3FILES\\gpa";
	
	File nameFile = new File(nameFile);	
	File gradeFile = new File(gradeFile);	
	File gpaFile = new File(gpaFile);
	
	FileWriter nameWriter = new FileWriter(nameFile, true);
	FileWriter gradeWriter = new FileWriter(gradeFile, false);
	FileWriter gpaWriter = new FileWriter(gpaFile, false);
	
	System.out.println("I will write the student's name, grade, and GPA in 3 seperate files.");
	System.out.println("What is the student's name ?");
	Scanner reader = new Scanner(System.in);
	String name = reader.nextLine();
	student.setName(name);
	System.out.println(student.getName());
	
	
	
	nameWriter.write(student.getName());
	nameWriter.close();
	
	}
}
