
public class BinarySearchTree {
	private BinaryTreeNode root;
	public BinarySearchTree() {
		this.root = null;
	}
	public void insert(int value) {
		insert(value, this.root);		
	}
	private void insert(int value, BinaryTreeNode root) {
		if (root == null) {
			root = new BinaryTreeNode(value);
		}
		else if(value <= root.getValue()) {
			if(root.getLeftSon() == null)
				root.setLeftSon(new BinaryTreeNode(value));
			else
				insert(value, root.getLeftSon());
		}
		else {
			if(root.getRightSon() == null)
				root.setRightSon(new BinaryTreeNode(value));
			else
				insert(value, root.getRightSon());
		}
	}
	public boolean find(int value) {
		return find(value, this.root);
	}
	private boolean find(int value, BinaryTreeNode root) {
		if (this.root == null) return false;
		if (this.root.getValue() > value) 
			return find(value, this.root.getLeftSon());
		
		if (this.root.getValue() < value)
			return find(value, this.root.getRightSon());
		
		return true;
	}
	public void delete(int value) {
		if (this.root == null) return;
		
	}
	public int[] getPreOrder() {
		return new int[]{};
	}
	public int[] getInOrder() {
		return new int[]{};
	}
	public int[] getPostOrder() {
		return new int[]{};
	}

}
