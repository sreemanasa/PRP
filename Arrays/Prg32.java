package Wipro;

import java.util.Arrays;
import java.util.Scanner;

public class Prg32 {
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
			int v[]=new int[3];
			int v1[]=new int[3];
			System.out.println("Enterelements 1st");
			for(int i=0;i<3;i++)
			{
				v[i]=sc.nextInt();
			}
			System.out.println("Enterelements 2nd");
			for(int j=0;j<3;j++)
			{
				v1[j]=sc.nextInt();
			}
			int a[]= {v[1],v1[1]}; 
	    int[] array_new = {v[0], v1[2]};	
		System.out.println(Arrays.toString(array_new)); 	
	     
	   	}

}

