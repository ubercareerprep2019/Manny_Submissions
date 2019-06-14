
public class Node<T> {
	Node<T> next;
	T value;
	Node(T value){
		this.value = value;
		next = null;
	}
	
	Node(){
		next = null;
		value = null;
	}
	
}
