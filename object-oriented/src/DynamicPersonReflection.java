import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicPersonReflection {

	public static void main(String[] args) throws Exception {
		
		Class pc = Class.forName("Person");
		
		Object obj = pc.newInstance();
		System.out.println(obj);
		
		Constructor cons = pc.getConstructor(String.class, int.class);
		System.out.println(cons);
		
		Object obj2 = cons.newInstance("Mona", 29);
		System.out.println(obj2);
		
		Method m = pc.getDeclaredMethod("print", null);
		System.out.println(m);
		
		m.setAccessible(true);
		m.invoke(obj2, null);
		
	}
}
