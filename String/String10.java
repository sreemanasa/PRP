package Wipro;

import java.util.Scanner;

public class String10 {
		public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String s=sc.next();
	        String s1="";
	        int a=sc.nextInt();
	        int l=s.length();
	        for(int i=0;i<a;i++)
	        {
	        	s1=s1+s.substring(l-a, l);
	        		
	        }
	        System.out.println(s1);
	    }

	}
