package Wipro;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		System.out.println(s.substring(1, s.length()-1));

	}

}
