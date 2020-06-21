package Wipro;

import java.util.Scanner;

public class Prg26 {
public static void ascendingSort(int[] arr)
{
	int temp;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
		System.out.println("Ascending order :");
		for(int k:arr)
		System.out.println(k);
}
public static void decendingSort(int[] arr) {
	int temp;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
		System.out.println("Ascending order :");
		for(int k:arr)
		System.out.println(k);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enterelements");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		ascendingSort(arr);
		decendingSort(arr);
	}
	

}
