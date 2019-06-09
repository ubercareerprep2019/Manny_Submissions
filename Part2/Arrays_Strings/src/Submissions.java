import java.util.*;

public class Submissions {
	
	public static void main(String[] args) {
		System.out.println(isStringPermutation("cat", "dog"));
		System.out.println(isStringPermutation("god", "dog"));
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(1);
		inputArray.add(3);
		inputArray.add(2);
		inputArray.add(4);
		inputArray.add(5);
		inputArray.add(8);
		
		
		
		ArrayList<Pair> toPrint = pairsThatEqualSum(inputArray, 5);
		
		for(int i = 0; i < toPrint.size(); i++) {
			Pair printing = toPrint.get(i);
			System.out.print(printing.numberOne);
			System.out.println(" " + printing.numberTwo);
		}
	}

	public static Boolean isStringPermutation(String s1, String s2) {
	HashMap<Character,Integer> tracker = new HashMap<Character,Integer>();
		for(int i = 0; i < s1.length(); i++) {
			Character toPut = s1.charAt(i);
			if(tracker.containsKey(toPut)) {
				tracker.put(toPut, tracker.get(toPut) + 1);
			}
			tracker.put(toPut, 1);
		}
		
		for(int i = 0; i < s2.length(); i++) {
			Character toPut = s2.charAt(i);
			if(!tracker.containsKey(toPut)) {
				return false;
			}
			tracker.put(toPut, tracker.get(toPut) - 1);
		}
		
		for (Integer value : tracker.values()) {
		    if(value != 0) {
		    	return false;
		    }
		}
		
		return true;
	}
	
	
	public static ArrayList<Pair> pairsThatEqualSum(ArrayList<Integer> inputArray, Integer targetSum){
		ArrayList<Pair> toReturn = new ArrayList<Pair>();
		HashMap<Integer,Integer> tracker = new HashMap<Integer,Integer>();
		for(int i = 0; i < inputArray.size(); i++) {
			Integer at = inputArray.get(i);
			if(tracker.containsKey(at)) {
				Pair toPut = new Pair();
				toPut.numberOne = at;
				toPut.numberTwo = tracker.get(at);
				toReturn.add(toPut);
			}
			tracker.put(targetSum - at, at);
		}
		return toReturn;
	}
	
}

