package demo;

public class xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==i || i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
