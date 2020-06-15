package Wipro;

import java.util.Scanner;
public class Prg4a {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<4;i++)
	{
	int num=sc.nextInt();
	if(num<0)
	{
		System.out.println(num+" is a negative number");
	}
	else if(num>0)
	{
		System.out.println(num+" is a positive number");
	}
	else if(num==0)
	{
		System.out.println(num+" is zero");
	}
}

}


}
