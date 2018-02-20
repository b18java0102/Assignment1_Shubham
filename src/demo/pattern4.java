package demo;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=3;i++)
		{
			for(k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=i;j<=2*i-1;j++)
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
		for(i=2;i>=1;i--)
		{
			for(k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=i;j<=2*i-1;j++)
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}

		
	}

}
