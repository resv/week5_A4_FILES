package week5_A4_FILES;

public class Student2 {

//	INITIALIZE VARIABLES
		private String name;
		private String grade;
		private double gpa;
		
		public Student2(String name, String grade, double gpa) {
			super();
			this.name = name;
			this.grade = grade;
			this.gpa = gpa;
		}


		//	SETTERS AND GETTERS
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public double getGpa() {
			return gpa;
		}
		public void setGpa(double gpa) {
			this.gpa = gpa;
		}

		public void getInfo() {
			System.out.println("My name is " + this.name + " and I have a " + this.gpa + " GPA. For now, at least...");	
		}
		
}
