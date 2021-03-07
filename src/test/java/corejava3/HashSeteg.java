package corejava3;

import java.util.HashSet;

public class HashSeteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("India");
		System.out.println(hs);
		hs.add("USA");
		hs.add("UK");
		System.out.println(hs);
		System.out.println(hs.size());
		
		
	}

}
