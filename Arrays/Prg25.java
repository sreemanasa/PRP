package Wipro;

import java.util.Scanner;

public class Prg25 {
	public static void printLargest(int[] arr) {
		int l1,l2,temp;
		l1=arr[0];
		l2=arr[1];
		if(l1<l2)
		{
			temp=l1;
			l1=l2;
			l2=temp;
			
		}
        for(int i=2;i<arr.length;i++)
        {
        	if(arr[i]>l1)
        	{
        		l2=l1;
        		l1=arr[i];
        		}
        	else if(arr[i]>l2 && arr[i]!=l1)
        	{
        		l2=arr[i];
        	}
        }
        System.out.println("1st Largest "+l1);
        System.out.println("2nd Largest "+l2);
		
	}
public static void printSmallest(int[] arr)
{
	 int s1,s2,temp1;
		s1=arr[0];
		s2=arr[1];
		if(s1>s2)
		{
			temp1=s1;
			s1=s2;
			s2=temp1;
			
		}
     for(int i=2;i<arr.length;i++)
     {
     	if(arr[i]<s1)
     	{
     		s2=s1;
     		s1=arr[i];
     		}
     	else if(arr[i]<s2 && arr[i]!=s1)
     	{
     		s2=arr[i];
     	}
     }
    
     System.out.println("1st Smallest "+s1);
     System.out.println("2nd Smallest "+s2);
	
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
		printLargest(arr);
		printSmallest(arr);
       
	}


}
