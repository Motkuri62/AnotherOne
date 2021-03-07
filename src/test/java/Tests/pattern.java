package Tests;

public class pattern {
//print minimum numbers. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 2 5 6 
		 4 8 9 
		 7 3 5
		 */
	int a[][] = new int[3][3];
	a[0][0]=4;
	a[0][1]=5;
	a[0][2]=6;
	a[1][0]=4;
	a[1][1]=8;
	a[1][2]=9;
	a[2][0]=7;
	a[2][1]=3;
	a[2][2]=5;
	
	int min =a[0][0];
	for(int i=0; i<3; i++)
	{
		for(int j=0; j<3;j++)
		{
			if(a[i][j]<min)
			{
				min =a[i][j];
				
			}
		}
		
	}System.out.println(min);
	
	

//print maximum numbers
	int max =a[0][0];
	for(int k=0; k<3; k++)
	{
		for(int l=0; l<3;l++)
		{
			if(a[k][l]>max)
			{
				max =a[k][l];
				
			}
		}
		
	}System.out.println(max);
	
}
}