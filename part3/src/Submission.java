
public class Submission {

	
	public static void main(String[]args ) {
		Stack stack = new Stack();
		stack.push(4);
	//	stack.push(3);
		stack.push(5);
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		Queue queue = new Queue();
		queue.push(4);
		queue.push(5);
		System.out.println(queue.top());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}
	

}
