/*Create a class Student having rool_ number,Name as fields .
Create another class Marksdetails to accept 5 subject marks .
Apply Single Inheritance to display the result */
import java.util.Scanner;

class Student
{
	int roll_number;
	String name;
	Scanner sc = new Scanner(System.in);
	 // Method to accept student details
	public void acceptInfo()
	{
	  System.out.println("Enter your roll number ");
	  roll_number = sc.nextInt();
	  System.out.println("Enter your full name  ");
	  sc.nextLine();
	 name = sc.nextLine();
	}
 }

class MarksDetails extends Student
{
 	int maths;
	int physics;
	int chemistry;
	int bio;
	int english;
	double total_marks,percentage;
	 // Method to accept subject marks
	public void acceptMarks()
	{
	  System.out.println("Enter your Maths Marks out of 100 ");
	  maths = sc.nextInt();
	   System.out.println("Enter your Maths Marks out of 100");
	  physics = sc.nextInt();
	  System.out.println("Enter your Maths Marks out of 100");
	 chemistry = sc.nextInt();
	  System.out.println("Enter your Maths Marks out of 100");
	  bio = sc.nextInt();
	  System.out.println("Enter your Maths Marks out of 100");
	  english = sc.nextInt();
	}
	
	 // Method to calculate and display marks 
	 public void displayInfo()
	{
	 System.out.println("Name : "+name);
	  System.out.println("Roll number : "+roll_number);
	  System.out.println("--------------------------------------------");
	  System.out.println("Maths : "+maths);
	  System.out.println("Physics : "+ physics);
	  System.out.println("Chemistry : "+chemistry);
	  System.out.println("Bio : "+ bio);
	  System.out.println("English : "+english);

	  total_marks = maths+physics+chemistry+bio+english;
	  percentage =( total_marks/500)*100 ;
	  System.out.println("--------------------------------------------");
	  System.out.println("Total :"+ total_marks+ " out of 500");
	  System.out.println("Percentage :"+ percentage);
	}

	 // Method to  display result 
	public void grade()
	{
	  if (percentage >= 80) {
                     System.out.print("Congratulations! You are in the Distinction category, ");
      	  } 
	else if (percentage < 75 && percentage >= 60) {
           	 System.out.print("Congratulations! You are in the First Class category, ");
        	 } 
	else if (percentage < 60 && percentage >= 45) {
        	    System.out.print("Good job! You are in the Second Class category, "+"* ");
     	   } 
	else if (percentage < 45 && percentage >= 35) {
           	 System.out.print("You have passed, ");
        	} 
	else {
        	    System.out.print("Unfortunately, you have failed, ");
       	     }
              }
}

public class StudDetails
{
	public static void main(String args[])
	{  
	  MarksDetails marks = new MarksDetails();

	 marks.acceptInfo();
	 marks.acceptMarks();
	 marks.displayInfo();
	 marks.grade();

	}
}
	




