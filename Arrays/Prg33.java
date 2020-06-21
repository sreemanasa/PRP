package Wipro;

import java.util.Scanner;

public class Prg33 {

	public static void main(String[] args) {
		 {
		        int a[][] = new int[2][2];
		        int i,j,k = 0;
		        for( i=0; i<2; ++i)
		        {
		            for( j=0; j<2; ++j)
		            {
		                a[i][j]=Integer.parseInt(args[k]);
		                k++;
		            }
		        }
		        System.out.println("The given array is :");
		        for( i=0; i<2; ++i)
		        {
		            for(j=0; j<2; ++j)
		            {
		                System.out.print(a[i][j]+" ");
		            }
		            System.out.println("");
		        }
		        System.out.println("The reverse of the array is :");
		        for( i=1; i>=0; i--)
		        {
		            for(j=1; j>=0; j--)
		            {
		                System.out.print(a[i][j]+" ");
		            }
		            System.out.println("");
		        }
		    }
		}