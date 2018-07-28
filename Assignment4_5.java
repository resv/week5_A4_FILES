/*	WEEK 5 ASSIGNMENT 4 - FILES	
	5.	THERE HAS TO BE A BETTER WAY
		
		Instead of storing your student information in three separate files,
		let's try storing them in one.
		You can do this by separating columns of data with a designated character.
		For instance, separating student data with a comma might look like this:
		Mike,15,4.0
		
		While separating student data with a space would look like this:
		Mike 15 4.0
		
		For this exercise, let's stick with commas.
		Create a new file on your desktop named students.csv (csv means Comma Separated Values)
		Fill it up with 10 lines of data (feel free to use the values from your old files!)
		Now, read each line of the file and, with the help of String.split(), 
		store the line in a String array.
		Then, immediately store the data from that array in a Student object.
		Finally, add that Student object to your Student[] array and continue with the loop.
		To confirm your work, loop through your Student[] array and call the getInfo method on each Student.
*/


//	---------------------------------------------------------------------------------------------------

package week5_A4_FILES;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Assignment4_5 {

	public static void main(String[] args) throws FileNotFoundException {

//	INITIALIZING FILE	
		String directory = ("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK");
		String specific = ("\\4_5_FILES\\students.csv");
		File csvFile = new File(directory + specific);
		
//	INITIALIZING SCANNER	
		Scanner csvReader = new Scanner(csvFile);
	
//	WHILE LOOP TO READ FILE
		while (csvReader.hasNextLine()) {
			ArrayList<String[]> list = new ArrayList<String[]>(); /*CREATES ARRAYLIST TO STORE INFORMATION READ*/
			String data = csvReader.nextLine(); /* PUTS THE INFORMATION INTO A VARIABLE*/
			list.add(data.split(",")); /*VARIABLE IS SPLIT BY ",", ADDED INTO ARRAY LIST*/
			for (int i = 0; i < list.size();i++) { /*FOR LOOP TO ITERATE THROUGH THE MANY PROCEDURES BELOW*/
				for (String[] d : list) { /*ITERATING THOUGH THE ARRAY LIST*/
					
//					System.out.println(d[0] + " " + d[1]  + " " + d[2]); /*TESTING DATA EXISTS IN ARRAY LIST*/
					
					Student3 student = new Student3(d[i],d[i+1],Double.valueOf(d[i+2])); /*CREATING OBJECT AND STORING VALUES*/
					
//					System.out.println(student.getName() + " " + student.getGrade() + " " + student.getGpa()); /*TESTING DATA EXISTS IN STUDENT OBJECT FROM ARRAY LIST*/
					
					ArrayList<Student3> studList = new ArrayList<Student3>(); /*CREATING ARRAYLIST OF TYPE STUDENT3 TO STORE OBJECTS INTO*/
					
					studList.add(student); /*ADDING OBJECTS INTO ARRAYLIST*/
					
					for (int k = 0; k < studList.size(); k++) { /*FOR LOOP TO EXECUTE METHOD USING THE ARRAYLIST ELEMENT*/
//						System.out.println(studList.get(k)); /*TESTING TO SEE IF WE CAN CALL FROM ARRAYLIST INDEX*/
						studList.get(k).getInfo();
					}
				}
			}
		}
//	CLOSING READER
		csvReader.close();
	}
}
