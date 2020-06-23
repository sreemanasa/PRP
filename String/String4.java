package Wipro;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		String s1="";
		int len=s.length();
		System.out.println(len);
		if(len%2==0)
		{
			System.out.println(s.substring(0, len/2));
		}
		else
		{
			System.out.println("null");
		}
		
	}

}
