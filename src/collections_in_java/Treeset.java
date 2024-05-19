package collections_in_java;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
public static void main(String[] args) {
	Set<Double> ts=new TreeSet<Double>();
	System.out.println("Before adding elements into the set:\n"+ts);
	ts.add( 18.2);
	ts.add( 19.3);
	ts.add(2.3);
	
	System.out.println("after adding elements into the set:\n"+ts);
	ts.remove(18.2);
	System.out.println("after removing element from the set:\n"+ts);
	System.out.println("verification of element int the set:"+ts.contains(2.3));
}
}
