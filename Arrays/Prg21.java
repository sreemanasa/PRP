package Wipro;

public class Prg21 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum=0;
		float average=0;
		for(int i=0;i<=a.length;i++)
		{
			sum=sum+i;
			average=sum/a.length;
		}
		System.out.println(a.length);
		System.out.println("sum "+sum);
		System.out.println("Average "+average);
        }
}
