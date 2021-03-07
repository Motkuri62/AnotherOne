package corejava2;

public class thiskeyword {

	int a = 50;
	
	public void keyword()
	{	
		
		int a =40;
		System.out.println(this.a);
		System.out.println(a);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword t = new thiskeyword();
		t.keyword();
		
	}

}
