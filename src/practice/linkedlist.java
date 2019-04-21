package practice;

public class linkedlist {
	node head;

	public void insert(int data) {
		node node = new node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	void show() {
		node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.print(n.data);
	}
}
