package corejava2;

public class Constructor {
		
	//Default constructor
	public Constructor()
	{
		System.out.println("you are going to print in the output.");
	}
	
	public void method1()
	{
		System.out.println("You are method 1");
	}
	//parameterized constructor.
	public Constructor(int a, int b)
	{
		int c;
		System.out.println( c = a+b);
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		Constructor csa = new Constructor();
		Constructor cs = new Constructor(a,b);
		
	}

}
