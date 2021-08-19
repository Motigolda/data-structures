public class LinkedList {
	private Node head;
	final boolean REMOVE_ALL_OCCURRENCES = false;
	public LinkedList() {
		this.head = null;
	}
	// insert in the beginning
	public void insert(int data) {
		if(head == null)
			head = new Node(data);
		else {
			Node newNode = new Node(data);
			newNode.setNext(head);
			head = newNode;
		}
	}
	// remove if found
	public void remove(int data) {
		Node 	previous = null, 
				current = this.head;
		
		while(current != null) {
			if (current.getData() == data) {
				if (previous == null) {
					this.head = current.getNext();
				}
				else {
					previous.setNext(current.getNext());
				}
				if (this.REMOVE_ALL_OCCURRENCES) return;
			}
			previous = current;
			current = current.getNext();
		}
	}
	public boolean exists(int data) {
		Node current = this.head;
		while(current != null) {
			if(current.getData() == data) 
				return true;
			current = current.getNext();
		}	
		return false;
	}
	public int getLength() {
		int length = 0;
		Node current = head;
		while(current != null) {
			length++;
			current = current.getNext();
		}
		return length;
	}
	public void traversal() {
		Node current = head;
		while(current != null)
		{
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
}
