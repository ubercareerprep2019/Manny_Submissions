

/*Implement the Stack class from scratch. You will need the following methods.
	○ push()
	■ Pushes an integer on top of the stack.
	○ pop()
	■ Removes what is on the top of the stack, and returns that value to the
	caller.
	○ top()
	■ Looks at the top value, and returns it. Does not manipulate the stack.
	○ isEmpty()
	■ Returns a True or False if the stack is Empty or not, respectively.
	*/
public class Queue {
	
	private Node head;
	private Node tail;
	private Integer minElement;
	private Integer size;
	
	Queue(){
		head = new Node();
		tail = head;
		minElement = Integer.MAX_VALUE;
		size = 0;
		
	}
	
	public void push(Integer insert) {
		Node toAdd = new Node(insert);
		if(size == 0) {
			head = toAdd;
			tail = toAdd;
		}
		else {
		tail.next = toAdd;
		tail = toAdd;
		}
		if(insert < minElement){
			minElement = insert;
		}
		size++;
		
	}
	
	public Integer pop() {
		try {
	    Integer toReturn = head.value;
		head = head.next;
		size--;
		return toReturn;
		}
		catch(Exception e) {
			
		}
		return null;
	}
	
	public Integer top() {
		return head.value;	
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}

	public Integer min() {
		return minElement;
	}
	
	public Integer size() {
		return this.size;
	}
}

