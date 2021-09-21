
public class Product {
	private int code;
	private String name;
	private double price;
	private int stock;
	
	private static int autogen = 101;
	
	public Product() {
	}

	public Product(String name, double price, int stock) {
		this.code = autogen ++;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void description() {
		System.out.println("Code: " + code);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Stock: " + stock);
	}

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}
}
