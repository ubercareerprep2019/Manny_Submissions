
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
public class Stack {
	
	private Node head;
	private Node prevHead;
	private Integer minElement;
	private Integer size;
	
	Stack(){
		head = new Node();
		prevHead = head;
		minElement = Integer.MAX_VALUE;
		size = 0;
		
	}
	
	public void push(Integer insert) {
		prevHead = head;
		Node toAdd = new Node(insert);
		head = toAdd;
		head.next = prevHead;
		if(insert < minElement){
			minElement = insert;
		}
		size++;
		
	}
	
	public Integer pop() {
		Integer toReturn = head.value;
		try {
		head = head.next;
		prevHead = prevHead.next;
		size--;
		return toReturn;
		}
		catch(Exception e) {
			
		}
		return toReturn;
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
