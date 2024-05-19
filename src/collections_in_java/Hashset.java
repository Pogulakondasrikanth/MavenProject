package collections_in_java;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		//Add elements into the HashSet
		hs.add(1);
		hs.add(10);
		hs.add(20);
		hs.add(8);
		hs.add(15);
		hs.add(4);
		System.out.println(hs);
		
		//Remove elements from the Set
		hs.remove(10);
		System.out.println("After removal of element from the set:");
		System.out.println(hs);
		//Verification of elements present in the set
		System.out.println("Verification of element present in the list:");
		System.out.println(hs.contains(15));

		
	}

}
