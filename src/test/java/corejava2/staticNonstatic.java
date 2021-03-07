package corejava2;

public class staticNonstatic {

		String name;	//instance veriable. it will always change its value depending upon object. 
		String value;
		String city;
		static String state = "maharashtra"; // it will not change the value and we can use static without creating any object. 
		static int i = 0;
		staticNonstatic(String name, String value, String city) // variables are present in constructor are called local veriable.
		{
			this.name=name;
			this.value=value;
			this.city=city;
			i++;
			System.out.println(i);
		}
		
		 public void getmethod()
		 {
			 System.out.println(name);
			 System.out.println(value);
			 System.out.println(city);
			 System.out.println(state);
			 
		 }
		 public static void main(String[] args) {

		staticNonstatic s = new staticNonstatic("Rohit","60","Mumbai");
		s.getmethod();
		staticNonstatic s1 = new staticNonstatic("Sayali","30","Mumbai");
		s1.getmethod();
		
		
		
	}

}
