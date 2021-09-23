
public class ChildDemo<Z, S> extends Demo<Z> {
	private S temp;

	public ChildDemo(Z data, S temp) {
		super(data);
		this.temp = temp;
	}

	public S getTemp() {
		return temp;
	}
	public void setTemp(S temp) {
		this.temp = temp;
	}
	
	public static void main(String[] args) {
		ChildDemo<String, Integer> c1 = new ChildDemo<String, Integer>("Hi", 19);
		System.out.println(c1.getData() + " = " + c1.getTemp());
	}
}
