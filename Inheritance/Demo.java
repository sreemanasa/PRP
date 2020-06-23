package Wipro;

import java.util.Scanner;

class Fruit
{
	String name;
	String taste;
	int size;
	public Fruit(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void display()
	{
		System.out.println(name+" "+taste+" "+size);
	}
}
class Apple extends Fruit
{
	public Apple(String name,String taste,int size)
	{
		super(name,taste,size);
	}
	public void display()
	{
		super.display();
	}
	
}
class Orange extends Fruit
{
	public Orange(String name,String taste,int size)
	{
		super(name,taste,size);
	}
	public void display()
	{
		super.display();
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Apple a=new Apple(sc.next(),sc.next(),sc.nextInt());
		Orange o=new Orange(sc.next(),sc.next(),sc.nextInt());
		a.display();
		o.display();
	}

}
