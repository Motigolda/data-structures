
public class Node {
	private int data;
	private Node next;
	public Node() {
		this(0);
	}
	public Node(int data) {
		this.data = data;
		next = null;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return this.data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getNext() {
		return this.next;
	}
}
