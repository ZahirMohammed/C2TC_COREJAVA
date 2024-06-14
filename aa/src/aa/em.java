package aa;

import java.util.Scanner;

public class em {
	Scanner sc= new Scanner(System.in);
	private int id;
	private String name;
	private int salary=0;
	private String dest;
	private static String company="1000";
	@Override
	public String toString() {
		return "em [sc=" + sc + ", id=" + id + ", name=" + name + ", salary=" + salary + ", dest=" + dest + "]";
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		em.company = company;
	}
	

}
