package Wipro;

import java.util.Scanner;

public class Prg15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if(num==0||num==1)
        {
        	System.out.println("Not a prime number");
        }
        for(int i=2;i<num;i++)
        {
        	if(num%i==0)
        	{
        	 count++;
        	 System.out.println("Not a prime number");
        	  break;
        	}
       }
       
	if(count ==0)
	{
		System.out.println("Prime number");
	}
	}

}
