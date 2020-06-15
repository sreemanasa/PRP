package Wipro;

import java.util.Scanner;

public class prg4b {

	private static boolean lastDigit(int a,int b) {
		
			return a%10==b%10;
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		lastDigit(n1, n2);
		System.out.println(lastDigit(n1,n2));
		

	}

	

}
