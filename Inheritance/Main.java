package Wipro;
class Author
{
	String name;
	String email;
	String gender;
	public Author(String name,String email,String gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void display() {
		System.out.println(name+" "+email+" "+gender);
	}
}
class Book extends Author
{
	String bname;
	int price;
	int stock;
	public Book(String bname,int price,int stock,String name,String email,String gender)
	{
		super(name,email,gender);
		this.bname=bname;
		this.price=price;
		this.stock=stock;
		
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void display() {
		super.display();
		System.out.println(bname+" "+price+" "+stock);
	}
}
public class Main {

	public static void main(String[] args) {
		Book b=new Book("abcc",1500,12,"abcd","abcd@gmail.com","male");
		b.display();
	}

}
