package corejava3;

import java.util.ArrayList;

public class ArrayListeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rohit");
		a.add("Chinnya");
		a.add("Sunita");
		a.add("Motkuri");
		System.out.println(a);
		a.add(1, "Sayali");
		System.out.println(a);
		System.out.println(a.get(3));
		System.out.println(a.indexOf("Motkuri"));
		a.remove("Sayali");
		System.out.println(a);
		System.out.println(a.contains("Row"));
		System.out.println(a.contains("Motkuri"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
