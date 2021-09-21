
public class LinkedList {
	private class Node {
		private String data;
		private Node next;
		
		public Node(String data) {
			this.data = data;
		}

		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	};
	
	private Node first, curr;
	private int count;
	
	public void addNode(String data) {
		
	}
	
	public void deleteNode(String data) {
		
	}
	
	public int size() {
		return count;
	}
	
	public void print() {
		
	}
}
