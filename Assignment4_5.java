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
		
//		File csvFile = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK\\4_5_FILES\\students.csv");
		
		String directory = ("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week5_A4_FILES\\FILE_BANK");
		String specific = ("\\4_5_FILES\\students.csv");
		File csvFile = new File(directory + specific);
		
		
		Scanner csvReader = new Scanner(csvFile);
		
		ArrayList<String[]> list = new ArrayList<String[]>();
		
//	TESTING FOR DATA IN DOCUMENT
		while (csvReader.hasNextLine()) {
			String data = csvReader.nextLine();
			list.add(data.split(","));
			System.out.println(data);
		}
		
		
		System.out.println("Data in array printed below : ");
		
		for (String[] newData : list) {
			System.out.println(newData[0] + " " + newData[1] + " " + newData[2]);
		}
		
		csvReader.close();
	}
}
