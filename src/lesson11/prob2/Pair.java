package lesson11.prob2;

import java.util.Objects;

public class Pair {
	String first;
	String second;
	public Pair(String f, String s) {
		first = f;
		second = s;
	}
		public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Pair p = (Pair)ob;
		return Objects.equals(p.first, first) && Objects.equals(p.second, second);
	}
	
	public int hashCode() {
return Objects.hash(first,second);
		
	}

}
