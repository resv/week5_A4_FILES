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

	public static void main(String[] args) {

	Student student1 = new Student();
	Student student2 = new Student();
	Student student3 = new Student();	
	
	String location1 = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK\\4_3FILES\\name.txt";
	String location2 = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK\\4_3FILES\\grade.txt";
	String location3 = "C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK\\4_3FILES\\gpa.txt";
	
	
	
	
	}
}
