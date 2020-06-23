package Wipro;

import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter strings");
		String a=sc.next();
		String b=sc.next();
		if(a.length()>b.length())
		{
			System.out.println(b+a+b);
		}
		else
		{
			System.out.println(a+b+a);
		}
		

	}

}
