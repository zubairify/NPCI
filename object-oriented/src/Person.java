import java.security.BasicPermission;

public class Person implements Cloneable {
	private String name;
	private int age;
	
	static {
		System.out.println("Static block");
	}
	
	{
		System.out.println("Non-static block");
	}
	
	public Person() {
		// Calling another constructor on the same object with matching signature - aka constructor chaining
		this("Anonymous", -1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("No trespassing") {});
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(this.name.equals(p.name) && this.age == p.age)
				return true;
		}
		return false;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Person is no more!");
	}

	public static void main(String[] args) throws Exception {
		Person p = null;
		for(int c=1; c<=5; c++)
			p = new Person();
		
		System.gc();
	}
}
