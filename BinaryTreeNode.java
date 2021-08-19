
public class BinaryTreeNode {
	private int value;
	private BinaryTreeNode leftSon, rightSon;
	public BinaryTreeNode() {
		value = 0;
		this.leftSon = this.rightSon = null;	
	}
	public BinaryTreeNode(int value) {
		this.value = value;
		this.leftSon = this.rightSon = null;
	}
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void setLeftSon(BinaryTreeNode son) {
		this.leftSon = son;
	}
	public BinaryTreeNode getLeftSon() {
		return this.leftSon;
	}
	public void setRightSon(BinaryTreeNode son) {
		this.rightSon = son;
	}
	public BinaryTreeNode getRightSon() {
		return this.rightSon;
	}
	public boolean isLeave() {
		return this.getLeftSon() == null && this.getRightSon() == null;
	}
	
}
