import static org.junit.Assert.assertNotNull;
import java.util.*;
/*
 * 
	 * all i could do in the time frame of 2 hours. 
● Implement the following method: Bool hasCycle()
○ Cycles can happen if a given node references an earlier node for the “next”
reference. Using your LinkedList class, implement a function to detect cycles in
the list.
● Implement a function to check if a linked list is a palindrome
 */
public class LinkedList<T> {
	 Node<T> head;
	 Node<T> tail;
	 Integer size;
	LinkedList(){
	//	System.out.println("hello");
		head = new Node<T>();
		tail = head;
		size = 0;
	}
	
	public void pushback(T data ) {
		if(head == tail) {
			Node<T> toInsert = new Node<T>(data);
		    head = toInsert;
		    tail = new Node<T>();
		    head.next = tail;
		    size++;
		    return;
		}
		else {
		Node<T> temp = new Node<T>(data);
		tail.next = temp;
		tail = temp;
		size++;
		}
	} 
	
	public T popBack(){
	//	System.out.println("SIZE" + size);
		Node<T>temp = head;
		int i = 1;
		if(size <= 2) {
			head.next = null;
			T toReturn = tail.value;
			tail = head;
			size--;
			return toReturn;
		}

		while(i < size-1) {
			temp = temp.next;
		}
		tail = temp;
		T toReturn = tail.value;
		tail.next = null;
		size--;
		return toReturn;
		
	}
	
	public int size() {
		return size;
	}
	
	public void erase(int index) {
		if (index > size) {
			return;
		}
		if(index == 1) {
			head = head.next;
		}
		else {
			Node<T>temp = head;
			int i = 1;
			while(i < index-1) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
		size--;
	}
	
	public T elementAt(int index){
		Node<T>temp = head;
		int i = 1;
		while(i < index) {
			temp = temp.next;
		}
		return temp.value;
	}
	
	public void insert(int index, T data) {
		if(index > size) {
			return;
		}
		else {
			Node<T>temp = head;
			int i = 1;
			while(i < index-1) {
				temp = temp.next;
			}
			Node<T> tempInsert = new Node<T>(data);
			tempInsert.next = temp.next;
			temp.next = tempInsert;
			if(tail == temp) {
				tail = temp.next;
			}
		}
	}
	
	public static void main(String[] args) {
	//	LinkedList<Integer> list = new LinkedList<Integer>();
	//	list.size = 2;
		
	}
	
}