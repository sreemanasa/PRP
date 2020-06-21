package Wipro;

import java.util.Scanner;

public class Prg23 {
    public static int toSearch(int a[],int num)
    {
    	if(a==null)
    		return -1;
       int i=0;
       int count=0;
       int x = 0;
       while(x<6)
       {
    	   if(a[i]==num)
    	   {
    		   return i;
    	   }
    	   else
    	   {
    		  return -1;
    	   }
       }
	return -1;
    }
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		toSearch(a,num);
		System.out.println(toSearch(a,num));

	}
	
	

}
