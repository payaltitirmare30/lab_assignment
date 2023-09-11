/*Create a main class which will use package and calculate total marks and percentage. */
import  MCA.Student;
import java.util.Scanner;
public class StudInfo{
	public static void main(String args[]){

		String name;
		int roll_no;
		int grade;
		int mar,eng,math,phy,chem,bio;

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter Your Name is: ");
		name=sc.nextLine();

		System.out.print("Enter Your Roll Number is: ");
		roll_no=sc.nextInt();

		System.out.print("Enter Your Grade :");
		grade=sc.nextInt();		

		System.out.print("Enter Your Marathi Marks Out Of 100: ");
		mar=sc.nextInt();

		System.out.print("Enter Your English Marks Out Of 100: ");
		eng=sc.nextInt();

		System.out.print("Enter Your Math Marks Out Of 100: ");
		math=sc.nextInt();

		System.out.print("Enter Your Physics Marks Out Of 100: ");
		phy=sc.nextInt();

		System.out.print("Enter Your Chemistry Marks Out Of 100: ");
		chem=sc.nextInt();

		System.out.print("Enter Your Bio Marks Out Of 100: ");
		bio=sc.nextInt();

		Student student = new Student(name, roll_no, grade, mar, eng, math, phy, chem,bio);

		// Display student details
     		   student.display();

    	    // Calculate and display total marks and percentage
    	    int totalMarks = student.getTotalMarks();
    	    double percentage = student.getPercentage();
    	    System.out.println("--------------Total Marks--------------");
    	    System.out.println("Total Marks: " + totalMarks + " Out of 600.");
    	    System.out.println("Percentage: " + percentage + "%");
     	    System.out.println("----------------------------------------");

	}
}