
public class RefPass1_Book {
	
	//MVC
	
	private String name;
	private String isbn;
	private double price; //图书价格
	private  int count; //目前图书库存
	private boolean borrow; //是否可以借
	//构造方法
	public RefPass1_Book() {}
	
	public RefPass1_Book(String name) {
		this.setName(name);
	}
	public RefPass1_Book(String name, String isbn, double price, int count) {
		setName(name);
		setIsbn(isbn);
		setPrice(price);
		setCount(count);
		setBorrow(borrow);
	}
	
	
	//封装方法
	
	public boolean isBorrow() {
		return borrow;
	}

	public void setBorrow(boolean borrow) {
		this.borrow = borrow;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 0) {
			price = 0;
		}
		else {
			this.price = price;
		}
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		if(count < 0) {
			count = 0;
		}
		else {
			this.count = count;
		}
	}
	
	
}
