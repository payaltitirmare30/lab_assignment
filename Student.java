/*Write a Package MCA which has one class Student. Accept student
detail through parameterized constructor. Write display () 
method to display details.*/ 
package MCA;
public class Student{
	String sname;
	int sroll_no;
	int grade;
	int mar,eng,math,phy,chem,bio;

	public Student(String name, int roll_no, int grade,int mar, int eng, int math, int phy, int chem, int bio){
	this.sname=name;
	this.sroll_no=roll_no;
	this.grade=grade;
	this.mar=mar;
	this.eng=eng;
	this.math=math;
	this.phy=phy;
	this.chem=chem;
	this.bio=bio;
	}

	public void display(){
	System.out.println("\n");
	System.out.println("*****************************************");
	System.out.println("Your Name is: "+sname);
	System.out.println("Your Roll Number is: "+sroll_no);
	System.out.println("Your Class Name is: "+grade);
	System.out.println("Your Marathi Marks is: "+mar);
	System.out.println("Your EnglishMarks is: "+eng);
	System.out.println("Your Math Marks is: "+math);
	System.out.println("Your Physics Marks is: "+phy);
	System.out.println("Your Chemistry Marks is: "+chem);
	System.out.println("Your Biology Marks is: "+bio);
	System.out.println("*****************************************");
	System.out.println("\n");

	}
	 public int getTotalMarks() {
                   return mar + eng + math + phy+ chem+ bio;
    }
    	public double getPercentage() {
                   int totalMarks = getTotalMarks();
                   return (double) totalMarks / 6;
    }

}
















