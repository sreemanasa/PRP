package Wipro;

public class Calculator {

	public static int powerint(int num1,int num2)
	{
		return (int)Math.pow(num1,num2);
	}
	public static double powerdouble(int num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.powerint(2,3));
		System.out.println(c.powerdouble(2,5));
	}

}
