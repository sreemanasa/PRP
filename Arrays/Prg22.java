package Wipro;

public class Prg22 {
    public static int getMax(int a[])
    {
    	int max=0;
    	for(int i=0;i<a.length;i++)
		{
    		if(a[i]>max)
				{
					max=a[i];
				}
		}
		return max;
    	
    }
    public static int getMin(int a[])
    {
    	int min=a[0];
    	for(int i=0;i<a.length;i++)
		{
    		if(a[i]<min)
				{
					min=a[i];
				}
		}
		return min;
    	
    }
	public static void main(String[] args) {
		int[] a= {-1,-2,-4,0,1,2,3,7};
		int max=0;
		int min=a[0];
		getMin(a);
		getMin(a);
		System.out.println("Minimum "+getMin(a));
		System.out.println("Maximum  "+getMax(a));
	}
}


