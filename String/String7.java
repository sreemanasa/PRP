package Wipro;

import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.next();
		if(a.charAt(0)=='x' || a.charAt(a.length()-1)=='x')
		{
			System.out.println(a.substring(1,a.length()-1));
		}
		else
		{
			System.out.println(a);
		}
	}

}
