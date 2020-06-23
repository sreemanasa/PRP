package Wipro;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		String s1=sb.reverse().toString();
		if(s.equals(s1))
		{
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not a palindrome");
			
		}

	}

}
