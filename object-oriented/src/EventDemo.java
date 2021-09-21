
class EventImpl implements Event {

	@Override
	public void happens() {
		System.out.println("First Event happened!");
	}
}

public class EventDemo {
	
	static class InnerEventImpl implements Event {

		@Override
		public void happens() {
			System.out.println("Second Event happened");
		}
	}
	
	public void anotherEvent() {
		class NestedEventImpl implements Event {

			@Override
			public void happens() {
				System.out.println("Third Event happened");
			}
		};
		new NestedEventImpl().happens();
	}

	public void oneMoreEvent() {
		Event e = new Event () {
			
			@Override
			public void happens() {
				System.out.println("Forth Event happened");
			}
		};
		
		e.happens();
	}
	
	public void oneLastEvent() {
		Event e = () -> System.out.println("Fifth Event happened");
		e.happens();
	}
	
	public static void main(String[] args) {
		EventImpl e = new EventImpl();
		e.happens();
		
		EventDemo ed = new EventDemo();
//		InnerEventImpl ie = ed.new InnerEventImpl();
//		ie.happens();
		
		EventDemo.InnerEventImpl ie = new EventDemo.InnerEventImpl();
		ie.happens();
		
		ed.anotherEvent();
		ed.oneMoreEvent();
		ed.oneLastEvent();
		
	}
}
