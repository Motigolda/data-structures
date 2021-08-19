
public class Queue {
	private Node head;
	public Queue() {
		this.head = null;
	}
	public void enqueue(int data) {
		if (this.head == null) {
			this.head = new Node(data);
		}
		else {
			Node newNode = new Node(data);
			newNode.setNext(this.head);
			this.head = newNode;
		}
	}
	public int dequeue() throws EmptyQueueException{
		if (this.isEmpty())
			throw new EmptyQueueException("Can't dequeue: the queue is empty.");
		Node current = head, previous = null;
		while (current.getNext() != null) {
			previous = current;
			current = current.getNext();
		}
		int retval;
		if (previous == null) {
			retval = this.head.getData();
			this.head = null;
		}
		else {
			retval = current.getData();
			previous.setNext(null);
		}
		return retval;
	}
	public boolean isEmpty() {
		return this.head == null;
	}
	public void traversal() {
		Node current = head;
		while(current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
}
