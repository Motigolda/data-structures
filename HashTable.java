
public class HashTable {
	private int[] data;
	private boolean[] slotReserved; 
	private final int LENGTH = 1000;
	public HashTable() {
		this.data = new int[LENGTH];
		this.slotReserved = new boolean[LENGTH];
		for (int i = 0; i < LENGTH; i++)
			this.slotReserved[i] = false;
	}
	public void insert(int value) {
		int key = this.hash(value);
		
	}
	// returns the key of the value
	// returns -1 if not found
	
	public int find(int value) {
		return -1;
	}
	public void delete() {
		
	}
	// returns the key of given value 
	// Using linear probing
	// Read about it here: https://en.wikipedia.org/wiki/Linear_probing
	private int hash(int value) {
		return -1;
	}
}
