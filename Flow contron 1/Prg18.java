package Wipro;

import java.util.Scanner;

public class Prg18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i=0; i< rows;i++ )
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        } 

       
       
	}

}
