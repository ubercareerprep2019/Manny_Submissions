import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {
	/*
	 * all i could do in the time frame of 2 hours. 
	● Implement the following tests (should be self explanatory):
		○ testEraseRemovesCorrectNode
		○ testEraseDoesNothingIfNoNode
		○ testElementAtReturnNode
		○ testElementAtReturnsNoNodeIfIndexDoesNotExist
		○ testSizeReturnsCorrectSize
		*/

	@Test
	void testPushBackAddsOneNode() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.pushback(1);
	assert(list.size == 1);
	}
	
	@Test
	void testPopBackRemovesCorrectNode() {
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.pushback(1);
		linkedlist.pushback(2);
		linkedlist.pushback(3);
		int oldValue = linkedlist.tail.value;
		System.out.println(oldValue);
		linkedlist.popBack();
        int value = linkedlist.tail.value;
		System.out.println(oldValue + " " +  value);
		assert( oldValue == 3 && value == 2);
	}
/*
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

*/
}
