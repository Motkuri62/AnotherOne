package corejava3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Shivaji");
		hm.put(1, "Sambhaji");
		hm.put(2, "Shahaji");
		hm.put(3, "Jijau");
		System.out.println(hm.get(2));
		hm.remove(3);
		System.out.println(hm);
		Set s = hm.entrySet();
		Iterator it =s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		
		
	}

}
