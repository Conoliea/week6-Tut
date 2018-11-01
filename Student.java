package tutorial3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student 
{
	
	static Scanner kboard = new Scanner (System.in);

	private int studentNo;
	private String forename;
	private String surname;
	private String mobileNo;
	private String result;


	public Student (int studentNo, String forename, String surname, String mobileNo, String result)
	{
		this.studentNo = studentNo;
		this.forename = forename;
		this.surname = surname;
		this.mobileNo = mobileNo;
		this.result = result;
	}

	
	public int setStudentNumber()
	{
		System.out.println("Please enter your student Number");
		int studentNo = kboard.nextInt();
		
		return (studentNo);	
	}
	
	public int getStudentNumber()
	{
		return this.studentNo;
	}
	
	public String setForname()
	{
		System.out.print("Please enter your forename");
		String forname = kboard.next();
		
		return(forname);
	}
	
	public String getForname()
	{
		return this.forename;
	}
	
	public String setSurname()
	{
		System.out.print("Please enter your surname");
		String surname = kboard.next();
		
		return(surname);
	}
	
	public String getSurname()
	{
		return this.surname;
	}
	
	public String setMobileNo()
	{
		System.out.print("Please enter your mobile number");
		String mobileNo = kboard.next();
		
		return(mobileNo);
	}
	
	public String getMobileNo()
	{
		return this.mobileNo;
	}
	
	public String setResult()
	{
		System.out.print("Please enter your result");
		String result = kboard.next();
		
		return(result);
	}
	
	public String getResult()
	{
		return this.result;
	}
	
	public String toString()
	{
	    return this.studentNo + ", " + this.forename + " " + this.surname + ", " + this.mobileNo + ", " + this.result;
	}
	
	 public boolean checkIfPassed()
	 {
		 if(this.result.equalsIgnoreCase("pass"))
		 {
			 return true;
		 }
		 
		 return false;
	 }
	
}
