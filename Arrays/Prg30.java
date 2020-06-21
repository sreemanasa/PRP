package Wipro;

import java.util.Scanner;

public class Prg30 {

		 public static void moveZeroes(int[] arr) {
			 
	        int len = arr.length;
	        int count = 0;
	        for(int i = 0; i < len; i++) {
	             if(arr[i]!=0) {
	                arr[count++] = arr[i];
	              }
	          }
	          for(int i = 0; i < len; i++) {
	          while(count < len) {
	             arr[count++] = 0;
	          }
	         }
	          System.out.print("Zeros :");
	          for(int j = 0; j < len; j++) {
	             System.out.print(arr[j] + " ");
	          }
	         
		 }
	    
			 public static void moveNonzeros(int arr[])
			 {
			    int i;
				int[] new_arr = new int[arr.length];
				int j = 0,k = arr.length-1;
				for(i = 0; i < arr.length; i++){
					if(arr[i] != 0){
						new_arr[k--] = arr[i];
					}
					else{
						new_arr[j++] = arr[i];
					}
				}
				System.out.print("Nonzeros :");
				for(i = 0; i < new_arr.length; i++){
					
						System.out.print(new_arr[i]+" ");
				}
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
	        moveZeroes(arr);
	        moveNonzeros(arr);
	    }
	
	}


