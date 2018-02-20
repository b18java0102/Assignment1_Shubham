package demo;

public class abc {

	public static void main(String[] args) {
		int i,j,k,x,y;
		for(i=1;i<=3;i++)
		{
			x=97;
			for(k=3;k>=i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print((char)x);
				x++;
			}
			y=x-2;
			for(j=1;j<=i;j++)
			{
				System.out.print((char)y);
				y--;
			}
			System.out.println();

		}

	}

}
