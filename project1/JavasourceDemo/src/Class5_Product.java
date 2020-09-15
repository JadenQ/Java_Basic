import java.util.Scanner;


public class Class5_Product {
	private String name;
	private double price;
	private String Des;
	private String[] services;
	
	//构造方法
	public Class5_Product() {}
	
	public Class5_Product(String name, String Des) {
		setName(name);
		setDes(Des);
	}
	//方法
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDes() {
		return Des;
	}
	public void setDes(String des) {
		Des = des;
	}
	public String[] getServices() {
		return services;
	}
	public void setServices(String[] services) {
		this.services = services;
	}

}
