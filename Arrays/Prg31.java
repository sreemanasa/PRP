package Wipro;

import java.util.Scanner;

public class Prg31 {
    public static boolean oneorfour(int[] arr)
    {
    	boolean status=false;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]==1 || arr[i]==4)
    	    status=true;
    		else
    		return false;
    	     
    	}
		return status;
    	
    }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of elements");
			int num=sc.nextInt();
			int arr[]=new int[num];
			System.out.println("Enterelements");
			for(int i=0;i<num;i++)
			{
				arr[i]=sc.nextInt();
			}
	       oneorfour(arr);
	       System.out.println(oneorfour(arr));
	   	}

}
