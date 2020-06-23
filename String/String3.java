package Wipro;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		if(s.length()<=1)
		{
			s1=s;
			
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
				s1=s1+s.charAt(0)+s.charAt(1);
			}
		}
		System.out.println(s1);
   sc.close();
	}

}
