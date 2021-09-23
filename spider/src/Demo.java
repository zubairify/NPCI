
public class Demo<Z> {
	private Z data;

	public Demo(Z data) {
		this.data = data;
	}

	public Z getData() {
		return data;
	}
	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo<String> d1 = new Demo<String>("Hi");
//		d1.setData(99);
		System.out.println(d1.getData());
		
		Demo<Integer> d2 = new Demo<Integer>(100);
//		d2.setData("Hey");
		System.out.println(d2.getData());
	}
}

// Create a child class of Demo as ChildDemo with additional generic field.
