package Wipro;

import java.util.Scanner;

public class Prg5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
		int num=sc.nextInt();
		if(num%2==0 && num!=0)
		{
			System.out.println(num+" is a even number");
		}
		else if(num%2!=0)
		{
			System.out.println(num+" is a odd number");
		}
		
	}

}

	}


