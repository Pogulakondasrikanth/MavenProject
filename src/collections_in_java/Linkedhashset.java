package collections_in_java;

import java.util.LinkedHashSet;

public class Linkedhashset {
public static void main(String[] args) {
	LinkedHashSet<String> lh=new LinkedHashSet<String>();
	System.out.println("Before adding elements into the set:\n"+lh);
	lh.add("Sri");
	lh.add("sweety");
	lh.add("Nani");
	lh.add("chintu");
	lh.add("Sri");
	lh.add("sri");
	System.out.println("After adding elements into the set:\n"+lh);
	lh.remove("chintu");
	System.out.println("after removing element from the list:\n"+lh);
	System.out.println("verification of element in the set:");
	System.out.println(lh.contains("sri"));
}
}
