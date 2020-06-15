package Wipro;

import java.util.Scanner;

public class Prg20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int rev = 0;
		int rem;
		int ori=num;
		
        while( num != 0 )
        {
            rem= num % 10;
            rev = rev * 10 + rem;
            num  /= 10;
        }

        if (ori == rev)
            System.out.println( " is a palindrome.");
        else
            System.out.println(" is not a palindrome.");

	}

}
