package Tests;

public class TestClass implements TestInter{

	public static void main(String[] args) {
		
		TestInter it = new TestClass();
		it.red();
		it.green();
		it.yellow();
		
		
		

	}

	@Override
	public void red() {
		System.out.println("This is red.");
		
		
	}

	@Override
	public void green() {
		System.out.println("This is green.");
		
	}

	@Override
	public void yellow() {
		System.out.println("This is yellow.");
	}
	
	

}
