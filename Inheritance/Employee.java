package Wipro;

public class Employee extends Person{
	double salary;
	int year;
	int insno;
	public Employee(String name,double salary,int year,int insno)
	{
		super(name);
		this.salary=salary;
		this.year=year;
		this.insno=insno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getInsno() {
		return insno;
	}
	public void setInsno(int insno) {
		this.insno = insno;
	}
	public void display()
	{
		super.display();
		System.out.println(salary+" "+year+" "+insno);
	}

}
