package Tests;

import corejava2.class1demo;

public class maxnoofarray  extends class1demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2 3 5
		   5 8 9
		   7 6 3
		 */
		maxnoofarray m = new maxnoofarray();
		m.method1();

		int a[][] = {{2,3,5},{5,8,9},{7,6,3}};
		int min = a[0][0];
		int mincolumn = 0;
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3; j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					 mincolumn = j;
				}
			}
		}System.out.println(min);
		
		int k=0;
		int max = a[0][mincolumn];
		while(k<3)
		{
			if(a[0][mincolumn]>max)
			{
				max=a[0][mincolumn];
				
			}
			k++;
		}System.out.println(max);
		
	}

}
