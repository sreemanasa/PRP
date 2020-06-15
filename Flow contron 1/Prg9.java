package Wipro;

import java.util.Scanner;

public class Prg9 {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String gender=sc.next();
	   int age=sc.nextInt();
	   if(gender.equals("Female") && (age>=1 && age<=58))
	   {
		   System.out.println("Percentage of interest id 8.2%");
	   }
	   else if(gender.equals("Female") && (age>=59 && age<=100))
	   {
		   System.out.println("Percentage of interest id 9.2%");
	   }
	   else if(gender.equals("male") && (age>=1 && age<=58))
	   {
		   System.out.println("Percentage of interest id 8.4%");
	   }
	   else if(gender.equals("male") && (age>=59 && age<=100))
	   {
		   System.out.println("Percentage of interest id 10.5%");
	   }
	   

	}

}
