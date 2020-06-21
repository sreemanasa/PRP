package Wipro;

import java.util.Scanner;

public class Prg28 {
    public static void sum(int arr[],int a,int b)
    {

        int sum = 0; 
        boolean add = true; 
        
        for (int i = 0;i < arr.length; i++) 
        { 
           if(arr[i]!=a && add==true)
                sum = sum + arr[i]; 
            else if (arr[i] == a) 
                add = false; 
            else if( arr[i] == b) 
                add = true; 
        } 
       
        System.out.print(sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
		sum(arr,a,b);
		

	}

}
