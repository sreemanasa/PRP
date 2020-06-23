package Wipro;

public class Box {
	int width;
	int length;
	int height;
	public Box(int width,int length,int height)
	{
		this.width=width;
		this.length=length;
		this.height=height;
	}
	public double getVolume()
	{
		return width*length*height;
	}

	public static void main(String[] args) {
		Box b=new Box(89,45,3);
		System.out.println(b.getVolume());

}
}
