package corejava2;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		int b = 0;
		try 
		{
				int c = a/b;
				System.out.println(c);
				
		}
		catch(Exception e)
		{
			System.out.println("exception.");
			
		}
		finally
		{
			System.out.println("Finally block is executed.");
		}
		
	}

}
