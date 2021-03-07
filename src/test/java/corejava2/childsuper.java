package corejava2;

public class childsuper extends parentsuper{

	 
	 String abc = "Rohit Motkuri.";
	 public void getdata()
	 {	 
		super.getdata();
		 System.out.println(abc);

		 
	 }
	 public childsuper()
	 {
		 System.out.println("I am from childsuper.");
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childsuper ch = new childsuper();
		ch.getdata();
		
	}

}
