
public class Stack {
	private Node top;
	public Stack() {
		this.top = null;
	}
	public void push(int data) {
		if(this.isEmpty()) {
			this.top = new Node(data);	
		}
		else {
			Node newNode = new Node(data);
			newNode.setNext(top);
			top = newNode;
		}
	}
	public int pop() throws StackUnderFlowException{
		if(this.isEmpty())
			throw new StackUnderFlowException("The stack is empty, nothing to pop.");
		
		int retval = top.getData();
		top = top.getNext();
			
		return retval;
	}
	public boolean isEmpty() {
		return this.top == null;
	}
	public int getLength() {
		int length = 0;
		Node current = top;
		while(current != null) {
			length++;
			current = current.getNext();
		}
		return length;
	}
}
