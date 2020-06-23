package Wipro;
class Animal{
	public void eat()
	{
		System.out.println("Food is delicious");
	}
	public void sleep() {
		
		System.out.println("heaven");
	}
	
}
class Bird extends Animal{
	
	public void flying()
	{
		super.eat();
		super.sleep();
		System.out.println("Birds are flying");
		
	}
}
public class AnimalDemo {
public static void main(String[] args) {
		Bird b=new Bird();
		b.flying();
	}

}
